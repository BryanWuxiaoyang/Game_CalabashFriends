/* 
  First Assignment for Java-2019
  Build an integer array from input and sort its elements.
*/

import java.util.*;

public class MyArraySort {
    public static void main(String[] args) {
        int arraysize = 0;
        System.out.println("Please input the number of the array's elements:");
        Scanner in = new Scanner(System.in);
        arraysize = in.nextInt();
        int[] arr = new int[arraysize];
        System.out.println("Please input " + arraysize + " intergers:");
        for(int i = 0; i < arraysize; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(arr);
        System.out.println("The sorted array is:");
        for(int i = 0; i < arraysize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}