import java.util.Scanner;
import java.util.ArrayList;
public class Sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List=new ArrayList<>();
        int len=0;
        System.out.println("Enter the size of the array:");
        if(sc.hasNextInt()){
            len=sc.nextInt();
        }
        else  System.exit(0);
        System.out.println("Enter the integers to be sorted separated by space:");
        for(int i=0;i<len;i++)
            List.add(sc.nextInt());
            select_sort(List);
        sc.close();
    }
    public static void select_sort(ArrayList<Integer> a){
        int length=a.size();
        for(int i=0;i<length;i++){
            int minIndex = i;
            for(int j=i+1;j<length;j++){
                if(a.get(j)<a.get(minIndex)){
                    minIndex = j;
                }
            }
            if(minIndex != i){
            int temp = a.get(i);
            a.set(i,a.get(minIndex));
            a.set(minIndex,temp);
            }
        }
        if(length>0){
        System.out.println("the ordered array:");
        for(int k=0;k<length-1;k++)
            System.out.print(a.get(k)+" ");
        System.out.println(a.get(length-1));
        }
    }
}
