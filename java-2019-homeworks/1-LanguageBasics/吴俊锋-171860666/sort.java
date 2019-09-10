public class sort {
    public static void main(String[] args) {
        int numbers[] = new int[]{1, 3, 9, 7, 6, 4, 2, 8, 5, 0};

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length - i - 1; j++) {
                if(numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }
}
