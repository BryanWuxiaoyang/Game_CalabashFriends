import java.util.Scanner;

class tutorial{
    public static void main(String[] args){
        System.out.println("please input the number of integers you want to sort");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("please input the "+n+" integers:");
        int Array[];
        Array=new int[n];
        for(int i=0;i<n;i++){
            Array[i]=sc.nextInt();
        }
        sc.close();
        Sort(Array);
        System.out.println("the sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(Array[i]+" ");
        }
        System.out.println("\n");
    }
    private static void Sort(int a[]){
        for(int i=a.length-1;i>0;i--){
            int maxIdx=0;
            for(int j=0;j<=i;j++){
                if(a[maxIdx]<a[j]){
                    maxIdx=j;
                }
            }
            int tmp=a[maxIdx];
            a[maxIdx]=a[i];
            a[i]=tmp;
        }
    }
}
