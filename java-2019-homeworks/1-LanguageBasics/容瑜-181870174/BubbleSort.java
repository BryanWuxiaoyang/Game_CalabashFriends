
public class BubbleSort {

	public static void main(String[] args) {
		//��ð�����򷨸���������
		double[] arr = {2.5, 6.8, 4.3, 56.3, 4.2};
		int i = 0;
		int j = 0;
		System.out.print("ԭʼ�����ǣ�");
		for(i=0;i<5;i++)
		{
			System.out.print(arr[i]+", ");
		}
		//������������
		for(i=0;i<4;i++) {
			for(j=0;j<4-i;j++) {
				if(arr[j] > arr[j+1])
				{
					double temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("\n");
		System.out.print("�������������������ǣ�");
		for(i=0;i<5;i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
}
