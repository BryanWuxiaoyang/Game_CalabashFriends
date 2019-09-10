import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class IntegerSort {
    public static void main(String[] args) {
        int nums[];
        nums=new int[5];
        System.out.println("Please input five integers:");
        Scanner si=new Scanner(System.in);
       for(int i=0;i<5;i++)
            nums[i]=si.nextInt();
        Arrays.sort(nums);
        for(int i=0;i<5;i++)
        {
            System.out.println(nums[i]);
        }
    }

}

