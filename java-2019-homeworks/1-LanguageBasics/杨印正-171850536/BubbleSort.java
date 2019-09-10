//171850536 uuz
public class BubbleSort {
    public static void bubblesort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
//bubblesort
                }
            }
        }
    }
            public static void main(String[] args)
            {
                int[] array = {444, 3456, 7667, 23, 5, 90, 6};
                bubblesort(array);
                for(int i=0;i<array.length;i++)
                System.out.println(array[i]);
            }

        }