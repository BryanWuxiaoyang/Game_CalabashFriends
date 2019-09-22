# 第三次作业
### 姓名：吴晓阳
### 学号：171860622
### QQ: 530787266
### 邮箱：530787266@qq.com
![ff](https://github.com/BryanWuxiaoyang/learngit/blob/master/diagram1.png)
# 一、概述
&ensp; 该文档涉及两个方面的内容：**本程序游戏设计框架**、**本次作业所涉及的部分的代码分析**。前者会放在最后的part进行介绍，而后者会基于前者已经存在的一些功能进行设计，若遇到重要算法部分，会进行相关引用。

# 二、作业设计
## 概述
 本次程序的人物继承自[FinishedFigure](#FinishedFigure), 同时Disable其子弹发射器。
 GridFrame框架的尺寸为 **40 * 40**。葫芦娃在正下方，妖怪在正上方，蛇精在左上方，爷爷在左下方。
## 程序流程
程序首先经过 `init`方法，将所有除爷爷和蛇妖的人物随机插入地图的任意位置，然后将前二者插入对应位置。
之后使用 `FiguresMoveTo`方法,依次 将葫芦娃按照蛇形排序，将妖怪按照雁阵排序，将妖怪按照鹤翼排序。
在移动时，通过将初末位置转换为动量，赋予人物，使其得以移动。
如main方法所示：
```java
public static void main(String[] args)throws Exception{
        init();
        frame.display();

        // 葫芦娃蛇形排队
        Thread.sleep(2000);
        figuresMoveTo(calabashes, SnakeFormation.getInstance(), new Point(15, 20));

        // 添加爷爷和妖精
        Thread.sleep(2000);
        frame.addItem(new FinishedSnake(), 5, 5,4, 4);
        frame.addItem(new FinishedGrandpa(), 5, 30, 4, 4);

        // 妖精雁阵排序
        Thread.sleep(2000);
        figuresMoveTo(enemies, GooseFormation.getInstance(), new Point(15, 0));

        // 妖精鹤翼排序
        Thread.sleep(2000);
        figuresMoveTo(enemies, CraneWingFormation.getInstance(), new Point(15, 0));
    }
```
## 类继承结构

## 采用的设计模式
### 策略模式
阵型本身是一个接口`Formation`：
```java
/*
* 阵型，以（0,0）为基准点
 */
interface Formation{
    /*
    * 获取阵型
     */
    List<Point> getFormation();

    /*
    * 阵型的尺寸
     */
    Dimension getSize();

    /*
    * 阵型包含的人数
     */
    int getNum();
}
```
任何的阵型只需要继承之，并实现相关方法，同时在`getFormation` 方法中返回对应的位置序列即可。因此，阵型本身是一个策略，它会在`FiguresMoveTo`方法中被调用：
```java
Point dstGridPos = formation.getFormation().get(i);
```

此外，将构造器的访问限制设置为 **private** 即可。

除此以外，游戏设计框架中的 **事件处理器**`ItemEventProcessor`也是一种策略模式。通过实现该接口，并添加进控制台，使得用户可以进行除基本事件处理（如移动、删除判定等）外的自定义事件的处理。

### 单例模式
与策略模式的阵型对应的，每一个实际的阵型都只存在一个单例，通过`getInstance`方法获取。其原因是每一个阵型的位置序列都是完全一致的，因此没有必要构造多个相同的阵型实例,如下：
```java
private static final GooseFormation instance = new GooseFormation();

public static GooseFormation getInstance(){
    return instance;
}
```

### 工厂模式
`Creator`即是简易的工厂模式，它通过作为`Generator`的参数传递，使得后者可以通过前者间隔地生成所需对象。

### 代理模式
控制台具有两种类型的代理，一种是`UnmodifiableConsole`,这使得`console`的一些添加删除操作被Disable，在向 **事件处理器** 传递`console`参数时，需要设置此代理，以防止控制台被不当修改。另一种是`SynchronizedConsole`，这使得控制台得以实现线程同步，这在多线程访问时十分重要。


&ensp;
# 三、游戏设计框架
## 1、技术路线
&ensp; 当前框架主要通过 ***swing*** 来进行GUI开发，人物的构建过程中主要通过JLabel来实现显示。在可见的未来会更新为javaFX。

## 2、设计模块划分
### 概述
&ensp; 框架存在三个核心模块：[物件模块](#itemModule)、[显示与存储模块](#displayModule)、[事件处理模块](#eventProcessModule)，以及数个util模块： [显示尺寸调整](#dimensionModule)、[动量模块](#momentumModule)、[图像获取](#imageModule) 等。

### 基本运作方式
在框架运作时，图像的每一次刷新时，在进行绘图前，会对框架中存在的物件进行 **事件处理**：
```java
        processEvents();
        super.paint(g);
        paintItems(g);
        repaint();
```
而事件处理模块即负责这一部分，所有事件都被分离来，进行单独的处理。控制台内置的处理事件有：**移动事件**、**发射事件**、**生命值处理事件**、**交互事件**，分别对应接口`Movable`, `Emittable`, `Lifable`, `Interactable`，当扫描到当前处理的`Item`具有对应接口时，则对其进行相应操作。除此之外，可以通过`addItemEventProcessor`方法添加自定义的事件处理器。
```java
            processEmit(item, rect, addSet);
            processMovable(item, rect);
            processInteraction(item, rect);
            processLifable(item, rect);
            processors.forEach(processor-> processor.process(
                    item, new Rectangle(rect), addSet,
                    Consoles.UnmodifiableConsole(this))); // 对自定义处理器进行处理

            checkRange(item, rect);  // 检查是否超出范围
            checkRemovable(item, rect, removeSet); // 检查 移除标记
```

### <a id = "itemModule">物件模块</a>
在框架中，一切可以进行操作的物体都属于 `Item`接口。Item类中存在设置删除标记的方法，用于在 **显示模块** 移除该模块。

Item接口具有 `void setRemovable(flag)` `boolean isRemovable()` 两个方法。

对于主要人物，则存在`Figure` 接口，该接口继承自`Item`,且具有 **名称设置和获取** 的方法。

Item的设计，是通过 **接口驱动** 的，它所具有的每一个基础功能，如显示、交互、移动等，都具有相应的接口。而控制台会根据这些接口对`Item`进行控制，同时，在后期的扩展时，也可以通过向控制台添加 **事件处理器** ，辅以 **接口类型的判断** 来对 Item进行相关操作。

### <a id = "eventProcessModule">事件处理模块</a>
在游戏中，事件的处理是与帧刷新同时进行的。控制台会将每一个`Item`传递给每一个处理器，让其判断是否属于自己的处理范围，并进行处理。
此外，可以通过继承`ItemEventProcessor`接口，创建自定义的事件处理器，并将其加入控制台，即可在每次帧刷新时进入该处理器的处理逻辑。
ItemEventProcessor接口如下：
```java
/*
* 专用于item事件的处理器, 负责在每次图像更新时处理事件
* 推荐对于每一个item属于的功能接口设立单独的processor
* 需要将该processor加入对应的控制台后才能起作用
 */
public interface ItemEventProcessor {
    void process(DisplayableItem item, Rectangle itemRect, Collection<Pair<DisplayableItem, Point>> addSet, Console console);
}
```
需要注意的是，`process`方法中除了`Item`，还具有其它3个参数，`itemRect`是当前item在显示区域中的坐标以及占据范围， `addSet`是将添加的item，通过在事件处理过程中向其中加入item，当此轮对所有item的事件处理结合后，会统一将`addSet` 中的item们加入控制台，并显示。之所以不通过控制台直接加入，是因为这样会造成 **Concurrent Modification** 错误。`console`参数即是item所存在的控制台。

例如，倘若想要在每一次帧刷新的时候输出具有 `Lifable` 接口的item的位置，可以这样设置：
```java
      frame.addItemEventProcessor((item, itemRect, addSet, console) ->{
           if(item instanceof Lifable){
               System.out.println(item);
           }
       });
```

### <a id = "displayModule">显示与存储模块</a>
显示模块和存储模块被集成在了`GridFrame`类中。该类继承自JFrame，是整个框架的核心，也是控制台实际发挥作用的关键部分。

`GridFrame`的中的item的定位坐标系与像素坐标有所不同，这可以从其构造函数看出：
```java
public GridFrame(int gridRowNum, int gridColNum, Rectangle bounds){
        this.gridRowNum = gridRowNum;
        this.gridColNum = gridColNum;
        this.gridMap = Collections.synchronizedMap(new HashMap<>());
        this.itemMap = Collections.synchronizedMap(new HashMap<>());

        Dimension screenSize = new Dimension(bounds.width, bounds.height);
        makeGridSize(screenSize);
        setBounds(new Rectangle(bounds.x, bounds.y, screenSize.width, screenSize.height));
    }
```
`gridRowNum`,`gridColNum`对于的是其格坐标，`bounds`对应的是其实际的像素坐标。每一个格子具有固定的像素尺寸，通过像素尺寸与格数的商得到。

每个存在其中的item都具有它的格坐标以及格范围，当进行绘图时，会首先将其翻译成像素坐标再进行绘制。

`GridFrame`中的存储方式是一个双射：
```java
/*
 * 格子集合，负责提供每个格子包含的item的信息
 * 与itemMap配合使用
  */
 private final Map<Point, Collection<DisplayableItem>> gridMap;

 /*
 * item集合，负责提供每个item的信息和位置
 * 与gridMap配合使用
  */
 private final Map<DisplayableItem, Rectangle> itemMap;
```

`gridMap` 存储每个格子上的item的引用，而`itemMap`则存储所以的item以及它们的定位。

当item移动时，`itemMap` 会修改该item的定位，而`gridMap`会通过`itemMap`中对应的定位来从其原来格子中删除引用，并添加引用到item新位于的格子中。

**显示部分**，item的显示接口是`Displayable`, 而可以显示的`Item`则具有接口 `DisplayableItem`,一般的item设计都是基于后者进行的。
`Display`接口本身没有指定显示方式，其具有三个继承接口：`Drawable`,`Imagable`,`Componented`，分别通过直接在画幅上绘图、添加image、装载图像构件 来进行显示。其中后者可以实现前者的功能，同时也可以通过其拥有的构件添加一系列的action，这是独立于事件处理器的，需要注意的是不可以直接通过它对frame中装载的item进行添加或删除。

item的显示区域与存储区域一般是通过像素位置和格位置进行映射的，所以大多数时候是相互匹配的。但有时为了提高处理速度，可以缩小存储位置的覆盖范围。例如 item可以通过添加`SinglePointed`接口，使得在添加item进控制台时，其在存储区域中只存在于单个格子中，而显示的时候却可以完整显示。这一般是用于一些 **不用交互**、**只与其它item交互而其它item不需要与它交互** 的item，例如**子弹**。

`GridFrame` 中之所以用格存储而不用像素存储，主要是为了提高运行处理速度，当使用像素存储时，需要1920*1080 = 2073600个格子，使得处理效率极低，而改为格式存储，则一者可以减小存储要求，二者可以自定义格子的分布，使得 同一行或者同一列的存储内容更多。


### <a id = "imageModule">图像获取</a>
在`ImageRepository`类中，静态装载了一个 **图像名称** 到 `Image` 的映射图。可以通过 `getImage`方法获取，同时在该存储中找不到对应image时，会自动在文件系统中搜索，然后将其装入映射图中。

### <a id = "momentumModule">动量模块</a>
item 的移动并不是指定的终点位置。事实上，item自身从始至终是并不知道自己的位置的，它的位置被 **控制台** 储存 ，被 **事件处理器** 获取并处理。而它的移动，则需要通过item内部的 **动量** 得到。

也就是说，在移动时，实际的item **移动操作** ，与其 **移动请求** 是相互分离的。可以随时给item设置动量，从而发出 **移动请求**， 而在控制台执行到 **移动事件处理器** 时，进行实际的移动操作。

为了实现移动，item需要实现 `Movable`接口。每个可移动的item都具有 基础动量`PrimalMomentum`和当前动量`momentum`。动量的单位是实际的像素。每次处理移动事件时，会将基础动量加入当前动量，然后进行移动，最后将剩余的动量（不足以移动一个格子）放回item中，用于下次移动。

### <a id = "Creator"> 创造器和生成器模块</a>
有的item实现了`Emittable`接口，使得它们具有发射item的能力。此接口具有的方法：
```java
/*
* 可以发射item
 */
public interface Emittable {
    boolean isReadyToEmit();

    /*
    * 添加item生成器
     */

    Item emit();
}
```
发射的方式可以自己实现，默认的方式是利用 生成器`Generator`，每隔一定时间产生一个item。而生成器自身又需要一个创造器`Creator`来使得它生成对应的item。

`Creator`接口为：
```java
public interface Creator<T> {
    T create(Object... args);
}

```
而`Creator`的实现采用了反射技术：
```java

public class BasicCreator<T> implements Creator<T> {
    Constructor<? extends T> ctor;

    public BasicCreator(Class<? extends T> type, Class<?>... ctorArgTypes){
        try {
            ctor = type.getConstructor(ctorArgTypes);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public T create(Object... args){
        T t = null;
        try {
            t = ctor.newInstance(args);
        }catch(Exception e){
            System.err.println("creation" + ctor + args + "  failed!");
        }
        return t;
    }
}
```

在构造器中，会通过其对象类型和构造器参数类型获取对应的构造器，从而进行创造。
但是通常来说推荐使用无参构造器进行创建，以减小程序复杂性

### 控制台
控制台本质上是GridFrame的代理，提供了添加删除item，获取格子位置上的item，获取item的位置等功能。

此外，通过装饰器类`SynchronizedConsole`,`UnmodifiableConsole`，使得它可以具有线程同步、不可修改的特性。

## 3、 已实现的类和方法
### <a id = "FinishedFigure">基本人物`FinishedFigure`</a>
该类提供基础的可装载的，可放射的，可移动的，有生命的figure，显示方式是`Componented`，具有一个label，装载了图片，可以实现gif动图。
继承它时，可以重载其放射接口的方法，并调整显示图像，从而生成不同的角色，并具有不同的发弹技能。

### 基本子弹`FinishedBullet`
与`FinishedFigure`类似，但它具有交互功能，可以在遇到figure时，对其造成伤害，并在适当时候给自己设置删除标记。

### 火球`FinishedFireball`
继承自FinishedBullet，与子弹不同，火球具有范围伤害特性，因此其交互方式有所不同。它实现了`SinglePointed`接口，因此交互判定只有在它的中点触及人物时才会触发。

为了解决这个问题，类中实现了一个它的可装载 **事件处理器** `FIREBALL_MEET_CHECK_PROCESSOR`，可以使得其获得检测其对角线的所有位置的figure的能力，从而增强其范围检测能力。

### 人物边界限制处理器`FigureBoundPreventProcessor`
该处理器使得被指定的figure可以在即将触及显示边界，被控制器删除时强制停止移动。用于主角的移动限制。
