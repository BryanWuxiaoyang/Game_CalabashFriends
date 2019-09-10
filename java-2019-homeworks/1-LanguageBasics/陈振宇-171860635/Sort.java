import java.util.Scanner;

public class Sort {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int n=0;
			System.out.print("请输入数字数量：\n");
			n=sc.nextInt();
			int[] array=new int[n];
			System.out.print("请输入所有数字：\n");
			for(int i=0;i<n;i++)
			{
				array[i]=sc.nextInt();
			}

			sc.close();
			sort(array);
			System.out.print("输出排序结果：");
			for(int i=0;i<n;i++)
			{
				System.out.print(String.valueOf(array[i])+" ");
			}

		}

		public static void sort(int[] array)
		{
			int n=array.length;
			for (; n > 1; n--)
			{
				int i_max = 0;
				for (int i = 1; i < n; i++)
				{
					if (array[i] > array[i_max])
						i_max = i;
				}
				int temp = array[i_max];
				array[i_max] = array[n - 1];
				array[n - 1] = temp;
			}

		}
}