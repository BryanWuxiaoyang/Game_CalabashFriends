import java.util.Scanner;
import java.util.Arrays;
class sort{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("请输入5个整数:");
        for(int i = 0;i<arr.length;i++)
            arr[i] = scan.nextInt();
        Arrays.sort(arr);
        System.out.print("排序结果为:");
        for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
        scan.close();
     }
    }
}
