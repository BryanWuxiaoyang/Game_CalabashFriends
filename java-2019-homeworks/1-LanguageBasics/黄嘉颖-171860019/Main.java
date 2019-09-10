package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int numbers[] = new int []{32,43,53,54,1,2,8,10,15};
    for (int i=0;i<numbers.length-1;i++)
        for (int j=0;j<numbers.length-i-1;j++)
        {
            if (numbers[j]>numbers[j+1])
            {
                int temp=numbers[j];
                numbers[j]=numbers[j+1];
                numbers[j+1]=temp;
            }
        }
        for (int i=0;i<numbers.length;i++)
            System.out.println(numbers[i]);
    }
}
