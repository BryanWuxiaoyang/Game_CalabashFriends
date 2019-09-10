public class MySort {
    public static void main(String[] args) {
        // create a scanner to read user input
        java.util.Scanner s = new java.util.Scanner(System.in);
        // input the length of array
        System.out.print("input the length of array: ");
        int n = s.nextInt();
        int[] array = new int[n];

        // input array elements
        System.out.print("input the elements of array: ");
        for(int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        // invoke insert sort method
        insertSort(array);

        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static void insertSort(int[] array) {
        if(array == null || array.length == 0) {
            return;
        }        
        for(int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > tmp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = tmp;
        }
    }
}