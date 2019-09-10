import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] Numbers = new int[]{1, 99, 71, 50, 25, 6, 18, 33, 42, 64};
        System.out.println("Raw Array:");
        for(int i : Numbers)
            System.out.print(i + "\t");
        System.out.println("\nAfter Sorting:");
        Arrays.sort(Numbers);
        for(int j : Numbers)
            System.out.print(j + "\t");
    }
}