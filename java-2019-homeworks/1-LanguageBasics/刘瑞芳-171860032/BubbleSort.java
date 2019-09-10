import java.util.Scanner;
public class BubbleSort{
	public static void main(String[] args){
		int[] arr = new int[10];
		Scanner inp = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			arr[i] = inp.nextInt();
		}
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(arr[i] < arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i = 0; i < 10; i++){
			System.out.print(arr[i] + " ");
		}
	}
}