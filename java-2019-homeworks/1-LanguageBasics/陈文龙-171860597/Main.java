
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * 
 * @作者 ：  我喜欢你家孩子呀~
 * 联系方式： 1019070879@qq.com
 * 创建日期: 2019年9月4日   时间: 上午1:32:42
 */

public class Main
{
	public static void main(String[] args)
	{
		// ***************** 默认数组如下 *****************
		Integer[] array =  {10,3,4,6,2,1,9,5,7,8};
		//从大 -> 小 
		Arrays.stream(array).sorted((a,b) -> b-a).forEach(System.out::println);
		System.out.println("----------------我是分隔符--------------------");
		//从小 -> 大
		Arrays.stream(array).sorted((a,b) -> a - b).forEach(a -> System.out.print(a + " "));
		// ***************** 下面是其他实现方式 *****************
		
		
		/**
		//从小->大 
		Arrays.sort(array, (a,b) -> a-b);
		//从大->小
		Arrays.sort(array, (a,b) -> b-a);
		for (int i : array)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("====================================");
		//如果要输出空格的话
		Arrays.asList(array).forEach( a -> System.out.print(a+" "));
		//也可以这样：
		Arrays.asList(array).forEach(System.out::println);	
		//还有这样：
	    Arrays.asList(array).stream().forEach(System.out::println);
	    //如果要空格分开的话
	    Arrays.asList(array).stream().forEach(a -> System.out.print(a+" "));
	    //java 9可以用下面的方法
	    List.of(array).stream().forEach(System.out::println);
	    List.of(array).stream().forEach(a -> System.out.print(a + " "));
	    
	    */

	}
}
