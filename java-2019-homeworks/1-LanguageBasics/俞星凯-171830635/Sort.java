import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = {48, 98, 24, 15, 10, 27, 65, 88, 42, 55};
        QuickSort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void QuickSort(int[] array, int begin, int end) {
        if (begin >= end)
            return;
        int pivot = array[begin], i = begin, j = end - 1;
        while (i < j) {
            while (i < j && array[j] >= pivot)
                --j;
            array[i] = array[j];
            while (i < j && array[i] <= pivot)
                ++i;
            array[j] = array[i];
        }
        array[i] = pivot;
        QuickSort(array, begin, i);
        QuickSort(array, i + 1, end);
    }
}
