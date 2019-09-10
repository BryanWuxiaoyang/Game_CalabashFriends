import java.util.Scanner;

public class Sort {
    public static void main(String[] args){
        //输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        //冒泡排序
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int tmp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        System.out.println("排序结果为：");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }

    }
}
