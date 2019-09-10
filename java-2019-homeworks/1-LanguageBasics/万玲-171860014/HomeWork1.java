import java.util.Scanner;
import java.util.Arrays;

public class HomeWork1 
{
	public static void main(String[] args) 
	{
		Scanner xx = new Scanner(System.in);
		System.out.print("请输入数组的长度：");
		
		int m=xx.nextInt();
		int[] ns=new int[m];
		System.out.print("请输入数组，以空格隔开：");
		for(int i=0;i<m;i++)
		{
			ns[i]=xx.nextInt();
		}
		for (int i = 0; i < ns.length - 1; i++) 
		{
			for (int j = 0; j < ns.length - i - 1; j++) 
			{
				if (ns[j] > ns[j+1]) 
				{
                    // 交换ns[j]和ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
		}
		System.out.print("从小到大排序为：");
        System.out.println(Arrays.toString(ns));
    }
}