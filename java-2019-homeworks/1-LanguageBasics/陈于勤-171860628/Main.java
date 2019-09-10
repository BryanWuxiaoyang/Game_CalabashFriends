import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please input the length of the input:");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int temparray[] = new int[length];
        System.out.println("Please input your numbers:");
        for (int i = 0; i < length; i++) temparray[i] = input.nextInt();
        quickSort(temparray, 0, length-1);
        System.out.println("The result is:");
        for (int i = 0; i < length; i++) System.out.print(temparray[i] + " ");
    }

    public static void quickSort(int array[], int start, int end) {
        if (start >= end) {
            return ;
        }

        int i = start, j = end;
        while (i < j) {
            while (i < j) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                i++;
            }

            if (i >= j) break;

            while (i < j) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j--;
            }
        }

        quickSort(array, start, i-1);
        quickSort(array, i+1, end);
    }
}
