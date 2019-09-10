import java.util.Arrays;
public class ArraySort {
    final static int[] array = {4,5,2,7,2,6,10,21,15,35,3,9};
    public static void main(String[] args) {
        Arrays.sort(array);
        for(int i=0; i<array.length; ++i)
            System.out.println(array[i]);
    }
}
