import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int size;
        System.out.print("Input length:");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Input " + size + " number:");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        for(int i: array){
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
