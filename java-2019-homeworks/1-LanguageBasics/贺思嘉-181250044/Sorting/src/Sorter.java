
public class Sorter {

	public static void main(String[] args) {
		int [] numbers = new int [] {32,43,53,54,32,65,63,98,43,23	};
		int temp1;
		int temp2;
		for(int i=0;i<numbers.length;i++) {
			temp1 = numbers[i];
			for(int j = i+1;j<numbers.length;j++) {
				if(temp1<numbers[j]) {
					temp2=temp1;
					temp1=numbers[j];
					
					numbers[j]=temp2;
					
				}
				
			}
			numbers[i]=temp1;
			System.out.println(numbers[i]);
		}
		
		
		

	}
}
