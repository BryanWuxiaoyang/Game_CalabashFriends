import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int partition(int [] arr, int left, int right)
    {
        int i = left - 1, j = left;
        // choose a random pivot
        Random rand = new Random();
        int rd = Math.abs(rand.nextInt());
        rd = (rd % (right - left)) + left;
        // switch the pivot to the right position
        int tmp = arr[right];
        arr[right] = arr[rd];
        arr[rd] = tmp;

        int pivot = arr[right];
        while (j < right)
        {
            // if current number less than pivot then move it forward
            if (arr[j] < pivot && i != j)
            {
                i++;
                tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
            j++;
        }
        arr[right] = arr[i + 1];
        arr[i + 1] = pivot;
        return i + 1;
    }
    public static void quickSort(int[] arr, int left, int right)
    {
        if (left < right) {
            int mid = partition(arr, left, right);
            quickSort(arr, left, mid - 1);
            quickSort(arr, mid + 1, right);
        }
    }
    public static void main(String[] args) {
        /* Input Mode Part */
//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println("Please input the number of the array: ");
//        n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Please input each element of the array, using space to separate");
//        for (int i = 0; i < n; i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//        sc.close();

        /* Random Test Part */
        int n = 10;
        int[] arr = new int[n];
        System.out.println("Generating a array randomly: ");
        for (int i = 0; i < n; i++)
        {
            Random rd = new Random();
            arr[i] = rd.nextInt();
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        // using QuickSort to sort the array
        quickSort(arr, 0, n-1);
        System.out.println("The sorted array is: ");
        for (int i: arr)
        {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
