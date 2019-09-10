public class Sort {
    public static void main(String[] args) {
        int[] array = {8, 5, 7, 8, 2, 6, 4, 9, 7, 5, 4, 0, 2, 8, 3, 0, 1};
        int n = array.length;
        for (int i = n-2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        for (int value : array) {
            System.out.print(value);
            System.out.print(' ');
        }
    }
}
