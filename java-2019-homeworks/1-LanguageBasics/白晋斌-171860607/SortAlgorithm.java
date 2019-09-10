//This is my first java program.
//function: sort a series of numbers 
//written by Bai Jinbin

import java.util.Arrays;

public class SortAlgorithm {
  public static void sort(int[] arr){
    for (int i = 1; i < arr.length; i++) {
        for (int j=i;j>0;j--){
            if (arr[j]>=arr[j-1]){
                break;
            }else{
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
  }
  public static void main(String[] args){
      int[] arr={8,1,0,5,9,4,9,5,6};
      System.out.println("hello world! This is my first Java program.");
      System.out.print("before sort:");
      System.out.println(Arrays.toString(arr));
      sort(arr);
      System.out.print("after sort:");
      System.out.println(Arrays.toString(arr));
  }

}