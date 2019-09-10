import java.util.Scanner;
public class SortArray{

    public static void insert(int [] arr,int i,int j){
        int temp=arr[i];
        for(int k=i;k>j;k--)
            arr[k]=arr[k-1];
        arr[j]=temp;
    }

    public static void insertSort(int [] arr){
        int size=arr.length;
        for(int i=1;i<size;i++)
        {   
            int j=i-1; 
            for(;j>=0;j--)
            {
                if(arr[j]<=arr[i])
                    break;
            }
            SortArray.insert(arr, i, j+1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Input number of elements.");
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        System.out.println("Input array.");
        int []arr=new int[len];   
        for(int i=0;i<len;i++)
            arr[i]=in.nextInt();
        SortArray.insertSort(arr);
        for(int a:arr)
            System.out.printf("%d ",a);
       in.close();
    }

}
