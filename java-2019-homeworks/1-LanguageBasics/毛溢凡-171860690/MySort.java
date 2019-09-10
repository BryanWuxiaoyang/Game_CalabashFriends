public class MySort {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 0, 8, 1, 5, 9, 4, 7, 6};

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < 9; i++)
            System.out.print(array[i] + " ");
        System.out.println(array[9]);
    }
}
