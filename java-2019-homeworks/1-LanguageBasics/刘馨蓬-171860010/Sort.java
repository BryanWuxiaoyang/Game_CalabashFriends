package Sort.demo;

public class Sort{
    public static void main (String[] args) {
        int numbers[] = new int[]{32, 43, 53, 54, 32, 65, 63, 98, 43, 23};
        int temp = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
