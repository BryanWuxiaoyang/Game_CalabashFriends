package homework_1;

import java.util.Scanner;
import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("数组长度：");
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        System.out.print("数组从小到大排序为：\n");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
