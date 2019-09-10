import java.util.Arrays;

public class MySort {
    public static void main(String[] args) {
        int[] array = new int[] {0,114,514,92,-1024,5,68,59,430};
        Arrays.sort(array);
        for(int i: array){
            System.out.print(i + " ");
        }
    }
}