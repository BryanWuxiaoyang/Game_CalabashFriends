package app;

import java.util.Arrays;
import java.util.Scanner;

public class arraysort {
    
       public static void main(String[] args) {
        
        int arrayLen = 0;
        Scanner sc = new Scanner(System.in); 

        System.out.println("Please type in How Many Numbers You Want To Input:\n");
        arrayLen = sc.nextInt();
        
        int[] array = new int[arrayLen];
        
        System.out.println("Please type in limited number of positive integer less than 10000:\n");

        for(int i = 0; i < arrayLen; ++i)
        {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        for (int i = 0; i < array.length; ++i)
            System.out.println(array[i]);

        sc.close();
        
    }
}