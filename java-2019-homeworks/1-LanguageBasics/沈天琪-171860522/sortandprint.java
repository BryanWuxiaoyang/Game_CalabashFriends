import java.util.*;

public class sortandprint {
    public static void main(String[] args) {
        //System.out.println("13456");
        int[] intArray = new int[]{12, -78, 78, 694, 0, 1};
        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i]+" ");
        //System.out.println("13456");
    }
}
