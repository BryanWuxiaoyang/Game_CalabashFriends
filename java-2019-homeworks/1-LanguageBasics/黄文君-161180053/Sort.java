import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入待排序数字");
        String[] arr = scanner.nextLine().toString().split(" ");
        int[] nums = new int[arr.length];
        for(int i = 0;i < arr.length;i++)
            nums[i] = Integer.parseInt(arr[i]);
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}