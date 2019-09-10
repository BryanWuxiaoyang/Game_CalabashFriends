//Qi Jiale 2019.09.03
//Reference: Introduction to Algorithms Section 7.1

public class QuickSort{
    public static void main(String[] args){
        int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
        sort(numbers,0,numbers.length-1);
        for(int i=0; i<numbers.length; i++){
             System.out.println(numbers[i]);
         }
    }
    public static void sort(int[] A, int l, int r){
        //'l' for left, 'r' for right, 'm' for middle
        if(l < r){
            int m=partition(A,l,r);
            sort(A,l,m-1);
            sort(A,m+1,r);
        }
    }
    public static int partition(int[] A, int l, int r){
        int x=A[r];
        int i=l-1;
        for(int j=l; j<r; j++){
            if(A[j]<=x){
                i++;
                int temp=A[j];
                A[j]=A[i];
                A[i]=temp;
            }
        }
        int temp=A[i+1];
        A[i+1]=A[r];
        A[r]=temp;
        return i+1;
    }
}