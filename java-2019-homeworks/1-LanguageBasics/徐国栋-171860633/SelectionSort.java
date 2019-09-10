
public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,3,5,4,2,6,9,7,8,10};
        int index;
        int tmp;
        for (int i = 0; i < numbers.length; i++) {
            index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[index] > numbers[j]) {
                    index = j;
                }
            }
            if (index != i) {
                tmp = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = tmp;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
