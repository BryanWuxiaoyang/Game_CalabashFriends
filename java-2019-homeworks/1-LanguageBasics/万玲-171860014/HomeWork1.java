import java.util.Scanner;
import java.util.Arrays;

public class HomeWork1 
{
	public static void main(String[] args) 
	{
		Scanner xx = new Scanner(System.in);
		System.out.print("����������ĳ��ȣ�");
		
		int m=xx.nextInt();
		int[] ns=new int[m];
		System.out.print("���������飬�Կո������");
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
                    // ����ns[j]��ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
		}
		System.out.print("��С��������Ϊ��");
        System.out.println(Arrays.toString(ns));
    }
}