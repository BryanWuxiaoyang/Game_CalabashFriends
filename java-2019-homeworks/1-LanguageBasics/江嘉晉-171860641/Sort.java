import java.util.Random;
import java.util.Arrays;

public class Sort{
    public static void main(String[] args) {
        int[] a=new int[10];
        //assign 10 random integer
        for(int i=0;i<a.length;i++)
            a[i]=(int)(Math.random()*100);
        System.out.println("Input: "+Arrays.toString(a));
        for(int i=0;i<(a.length-1);i++)
            for(int j=0;j<(a.length-1-i);j++)
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
        System.out.println("Sorted: "+Arrays.toString(a));
    }
    
}