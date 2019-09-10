package Sort;

import java.util.Arrays;

public class intArraySort {
    public static void main(String args[]) {
        int intArray[]=new int []{5,25,3,1,345,78,23,123,56,23,12};
        Arrays.sort(intArray);
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
}
