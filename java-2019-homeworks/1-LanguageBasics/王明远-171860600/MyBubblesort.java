/*
the request of first assignment is below
作业：Java语言基础实践
安装配置Java开发环境；
编写一个Java类及其main方法，实现对一个给定的整型数组进行排序后输出；
按照作业提交要求和流程，完成作业提交
*/
import java.util.*; 

public class MyBubblesort {
                         // using my favorite way (bubble sort) to sort one arry of int(s)
                         // according to my experience in programming with C++ and the first 3 chapters of thinking in java
                         // we can get following codes
                         // thank you!
  public static void main(String[] args) {
     int len_of_myarry=12;//this value represents the length of myarry below
     int myarry[]=new int [len_of_myarry];
     for(int i=0;i<len_of_myarry;++i)// set initial value for myarry
                                     // here when len = 12 
                                     // we get myarry = 12,11,10,9,8,7,6,5,4,3,2,1
     {
        myarry[i]=len_of_myarry-i;
     }

     for(int i=0;i<len_of_myarry-1;++i)//sort myarry with traditional bubblesort
     {
       for(int j=0;j<len_of_myarry-1-i;++j)
       {
         if(myarry[j]>myarry[j+1])
         {
           int temp_for_swap=myarry[j];
           myarry[j]=myarry[j+1];
           myarry[j+1]=temp_for_swap;
         }
       }
     }
     //after sorting, now myarry has changed into 1,2,3,4,5,6,7,8,9,10,11,12
     System.out.print("myarry now is: ");
     for(int i=0;i<len_of_myarry;++i)// output myarry one by one
     {
       System.out.print(myarry[i]);
       System.out.print(" ");
     }
     System.out.print('\n');
  }
}
