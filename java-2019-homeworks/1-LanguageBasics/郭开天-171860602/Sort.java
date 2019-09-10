import java.util.Scanner;

public class Sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("import the lenth:");
        int lenth=sc.nextInt();
        int[]list=new int[lenth];
        for(int i=0;i<lenth;i++){
            System.out.print("import"+i+":");
            list[i]=sc.nextInt();
        }
        for(int i=0;i<lenth-1;i++){
            int max=i;
            for(int j=i;j<lenth;j++){
                if(list[max]<list[j]){
                    max=j;
                }
            }
            int temp=list[i];
            list[i]=list[max];
            list[max]=temp;
        }
        for(int i=0;i<lenth;i++){
            System.out.print(list[i]);
            System.out.print(' ');
        }
        sc.close();
    }
}