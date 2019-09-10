//2019-9-3 homework1
//written by 171850524

import java.util.Scanner;
public class homework1 {
    public static void quickSort(int[] arr, int a, int b){
        if(a >= b)
            return;
        int i = a, j = b, key = arr[a];
        while(i < j) { //merge
            while(i < j && key < arr[j]) {
                j--;
            }
            if(i < j){ //swap arr[i] and swap[j]
                int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
            }
            while(i < j && key > arr[i]) {
                i++;
            }
            if(i < j){ //swap
                int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
            }
        }
        //here i == j
        quickSort(arr,a,i-1);
        quickSort(arr,i+1,b);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入待排序元素个数：");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入待排序的元素：\n");
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        quickSort(arr,0,n-1);
        System.out.println("以下为排好序的元素：\n");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
