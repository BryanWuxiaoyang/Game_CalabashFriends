import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {23, 26, 1, 80, -123, 256, 800008, 12};
        Arrays.sort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
