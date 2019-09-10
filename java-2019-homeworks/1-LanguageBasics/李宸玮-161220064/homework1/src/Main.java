import java.util.*;
public class Main {
    public static void main(String[] args){
        int myArray[]=new int[10];
        int len=myArray.length;
        System.out.print("输入10个整数：");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<len;i++)
        {
            myArray[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(myArray[i]>myArray[j]){
                    temp=myArray[i];
                    myArray[i]=myArray[j];
                    myArray[j]=temp;
                }
            }
        }//从小到大
        System.out.print("排序后的数组是：");
        for(int i=0; i<len; i++){
            System.out.print(myArray[i] + " ");
        }
    }
}
