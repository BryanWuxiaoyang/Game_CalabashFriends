package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //System.out.println("Hello Java");
        System.out.println("请输入一组整数，以'$'结束");
        Scanner scan=new Scanner(System.in);
        int count=0;
        int arr[]=new int[10000];
        for(;;){
            if(scan.hasNextInt())
            {
                arr[count]=scan.nextInt();
                count++;
            }else{
                break;
            }
        }
        scan.close();
        /*for(int i=0;i<count;i++){
            System.out.print(arr[i]);
            System.out.print(' ');
        }*/
        //System.out.println(' ');
        quickSort(arr, 0, count-1);
        for(int i=0;i<count;i++){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
    }

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int arr[],int left,int right){
        int pivot=arr[right];
        int i=left,j=i;
        for(;i<right&&j<right;i++){
            if(arr[i]<pivot){
                swap(arr,i,j);
                j++;
            }
        }
        swap(arr,right,j);
        return j;
    }

    public static void quickSort(int arr[],int left,int right){
        if(left<right){
            int pivotIndex=partition(arr,left,right);
            quickSort(arr,left,pivotIndex-1);
            quickSort(arr,pivotIndex+1,right);
        }
    }
}