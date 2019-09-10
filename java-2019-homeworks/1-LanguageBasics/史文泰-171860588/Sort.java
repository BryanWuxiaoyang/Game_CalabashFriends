import java.util.Arrays;

public class Sort{
    public static void main(String[] args) {
        int buf[] = new int[]{2, 43, 34, 6, 5, 76, 46, 38, 21, 9, 34, 1, 3, 234, 67, 12, -2, 15};
        System.out.println("原数组: " + Arrays.toString(buf));
        Arrays.sort(buf);
        System.out.println("排序后: " + Arrays.toString(buf));
    }
}