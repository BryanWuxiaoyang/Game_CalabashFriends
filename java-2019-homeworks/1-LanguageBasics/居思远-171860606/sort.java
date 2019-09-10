
import java.util.Scanner;
import java.util.ArrayList;

public class sort {
    public static void main(String args[]) throws Exception {
        ArrayList<Integer> arr = new ArrayList<Integer>();          //创建动态数组
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组元素个数：");
        int n = sc.nextInt();                                     //输入数组元素个数

        System.out.println("请逐个输入数组元素：");                   //输入数组元素
        for (int jk = 0; jk < n; jk++) {
            int m = sc.nextInt();
            arr.add(m);
        }

        java.util.Collections.sort(arr);                            //数组排序

        System.out.println("排序后数组为：");                          //输出
        for (int jk = 0; jk < n; jk++) {
            if(jk != 0)
                System.out.print(" , ");
            System.out.print(arr.get(jk));
        }
    }
}
