
public class Solution {
	public void mergeSort(int []a,int start,int end) {
		//only one or zero 
		if(end-start<=0)
			return;
		int mid=(start+end)/2;
		mergeSort(a, start, mid);
		mergeSort(a, mid+1, end);
		//temp array
		int []temp=new int[a.length];
		int i=start;
		int j=mid+1;
		int k=0;
		while(i<=mid&&j<=end) {
			if(a[i]<a[j]) {
				temp[k]=a[i];
				++i;
				++k;
			}
			else {
				temp[k]=a[j];
				++j;
				++k;
			}
		}
		while(i<=mid) {
			temp[k]=a[i];
			++i;
			++k;
		}
		while(j<=end) {
			temp[k]=a[j];
			++j;
			++k;
		}
		System.arraycopy(temp, 0, a, start, end-start+1);
	}
	public void sort(int []a) {
		//merge sort
		//divide
		mergeSort(a, 0, a.length-1);
	}
	
	public static void main(String[]args) {
		//generate NUM number ranging from 0 to 100 randomly,and sort them
		final int NUM=200;
		int []a=new int[NUM];
		for(int i=0;i<NUM;++i) {
			a[i]=(int)(Math.random()*100);
		}
		Solution s=new Solution();
		s.sort(a);
		for(int e:a) {
			System.out.print(e+" ");
		}
	}
}
