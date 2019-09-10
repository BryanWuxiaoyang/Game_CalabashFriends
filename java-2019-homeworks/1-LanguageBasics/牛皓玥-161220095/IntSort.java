import java.util.Arrays;
import java.util.Scanner;

/**
 * java-2019-homework1
 */

public class IntSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入待排序数组长度：");
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("请输入待排序数组：");
        for(int i = 0;i<len;i++)
            array[i] = sc.nextInt();
        sc.close();
        int [] array1 = (int[])array.clone();

        System.out.print("原始数组为：");
        System.out.println(Arrays.toString(array));

        //冒泡排序
        BubbleSort(array);
        System.out.print("冒泡排序结果为：");
        System.out.println(Arrays.toString(array));

        //内置排序
        Arrays.sort(array1);
        System.out.print("内置排序结果为：");
        System.out.println(Arrays.toString(array1));
    }

    public static void BubbleSort(int [] array){
        for(int i = 0;i < array.length;i++){
            for(int j = 1;j < array.length -i;j++){
                if (array[j] < array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
