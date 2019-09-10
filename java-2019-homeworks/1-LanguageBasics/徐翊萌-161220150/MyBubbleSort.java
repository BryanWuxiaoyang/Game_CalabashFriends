import java.util.Scanner;

public class MyBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入待排序数组的长度：\n");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.print("请输入待排序数组的元素：\n");
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        sc.close();
        bubble_sort(array);
        System.out.print("从小到大排序，结果如下：\n");
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }
    //从小到大冒泡排序
    public static void bubble_sort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = 1; j < length; j++) {
                if (array[j-1] > array[j]) {
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
