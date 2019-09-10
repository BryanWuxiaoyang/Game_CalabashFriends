
import java.util.Scanner;
/*
The Array is got from the input.
Use Scanner to input an array
Guo Ruijie, Sep 2, 2019
 */


public class Main {
    public static void main(String[] args) {
        //array of 10 numbers
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Please input the size of Array：");
        n = in.nextInt();
        int []numbers = new int[n];
        System.out.println("Please input the elements：");
        for (int i = 0; i < n; ++i) {
            int num = in.nextInt();
            numbers[i] = num;
        }
        Sort(numbers,0, n - 1);
        for (int i = 0; i < n; ++i) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static void Sort(int []numbers, int left, int right){
        if (left >= right) return;
        int pivotpos = Partition(numbers, left, right);
        Sort(numbers, left, pivotpos - 1);
        Sort(numbers, pivotpos, right);
    }
    public static int Partition(int []numbers, int left, int right){
        int key = numbers[right];
        int end = right; right = right - 1;
        while (left < right) {
            while (left < right && numbers[left] < key){
                ++left;
            }
            while (left < right && numbers[right] > key){
                --right;
            }
            if (left < right){
               int temp = numbers[left];
               numbers[left] = numbers[right];
               numbers[right] = temp;
            }
        }
        if (numbers[left] > key) {
            int temp = numbers[left];
            numbers[left] = numbers[end];
            numbers[end] = temp;
            return left;
        }
        else return end;
    }
}