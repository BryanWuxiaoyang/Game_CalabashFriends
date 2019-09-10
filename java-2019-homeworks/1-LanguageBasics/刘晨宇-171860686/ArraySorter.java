import java.util.Arrays;

/**
 * 本文件的编码格式为UTF-8，使用javac进行编译时请注意；
 * ArraySorter类的main方法对一个给定的整型数组（存放在数组integers中），调用Arrays.sort()方法
 * 将它按照非降序排序后，再调用Arrays.toString()方法将它转化为字符串格式输出
 */

public class ArraySorter{
    public static void main(String[] args){
        int[] integers = new int[]{73, 56, 55, 74, 7, 62, 36, 99, 88, 48};
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));
    }
}