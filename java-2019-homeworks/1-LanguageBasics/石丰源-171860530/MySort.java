import java.util.Random;

public class MySort{
    public static void main(String[] args){
        //create an array of 10 elements
        int []a = new int[10];

        //Init array
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            a[i] = r.nextInt(100);
        }

        //print original array
        System.out.println("Original array is following:");
        for(int i = 0; i < 10; i++){
            System.out.print(a[i] + " ");
        }

        //QuickSort
        MySort s = new MySort();
        s.quickSort(a, 0, 9);

        //Print sorted array
        System.out.println("\nSorted array is following:");
        for(int i = 0; i < 10; i++){
            System.out.print(a[i] + " ");
        }
    }

    public void quickSort(int []a, int first, int last){
        if(first < last){
            int pivot = partition(a, first, last);
            quickSort(a, first, pivot - 1);
            quickSort(a, pivot + 1, last);
        }
    }

    public int partition(int a[], int first, int last){
        int pivot = first;
        int temp = a[pivot];
        for(int i = first + 1; i <= last; i++){
            if(a[i] < temp){
                pivot++;
                int s = a[pivot];
                a[pivot] = a[i];
                a[i] = s;
            }
        }
        int s = a[pivot];
        a[pivot] = temp;
        a[first] = s;
        return pivot;
    }
}