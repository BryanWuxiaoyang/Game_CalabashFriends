import java.util.*;

public class week1_homwork {

	public static int[] arr;
	public static void main(String[] args) {
		
        Random rand = new Random();
        arr = new int[10];
        for(int i = 0;i<10;i++)
        	arr[i] = rand.nextInt(100);
        System.out.println("随机数组为 : "+Arrays.toString(arr));
		sort(arr);
		System.out.println("升序排序为 : "+Arrays.toString(arr));
	}
	private static void sort(int[] arr) {
        for(int i = 0;i<arr.length-1;i++) {
        	int minIndex = i;
        	for(int j = i+1;j<arr.length;j++) 
        		if(arr[j]<arr[minIndex])
        			minIndex = j;
        	
        	if(minIndex!=i) {
        		int temp = arr[minIndex];
        		arr[minIndex] = arr[i];
        		arr[i] = temp;
        	}
        }
	}

}
