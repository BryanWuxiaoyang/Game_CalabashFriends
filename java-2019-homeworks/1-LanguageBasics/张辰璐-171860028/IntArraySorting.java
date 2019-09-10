import java.util.*;

/*design this class to enhance portability*/
class MyInt {
    private int x;

    /*this function cannot be static cause non-static members will not be allocated space*/
    public int showX() {
        return x;
    }

    /*static factory method: https://www.jianshu.com/p/ceb5ec8f1174
     *CMP with showX: this func can visit x cause myInt has become an object
     * */
    public static MyInt newInt(int a) {
        MyInt myInt = new MyInt();
        myInt.x = a;
        return myInt;
    }
}

/*Met an error: intArray was once a Vector, remember it can not be an element to be compared*/
class MyCmp implements Comparator<MyInt> {
    public int compare(MyInt a, MyInt b) {
        return b.showX() - a.showX();
    }
}

public class IntArraySorting {
    static MyInt[] intArray;// = {69, 18, 80, 59, 100, 1, 96, 12};

    public static void main(String[] args) {
        int tempI = 0, length = 0;
        Vector<MyInt> tempV = new Vector<MyInt>();//Vector sacrifice space to be robust, MyInt array must exist cause Comparator
        Scanner reader = new Scanner(System.in);
        while (reader.hasNextInt()) {
            length++;
            tempI = reader.nextInt();
            tempV.add(MyInt.newInt(tempI));
        }
        intArray = new MyInt[length];
        for (int i = 0; i < length; i++)
            intArray[i] = tempV.get(i);//cannot visit director because of object orient idea
        Arrays.sort(intArray, new MyCmp());
        for (MyInt arr : intArray)
            System.out.println(arr.showX() + " ");
    }
}




