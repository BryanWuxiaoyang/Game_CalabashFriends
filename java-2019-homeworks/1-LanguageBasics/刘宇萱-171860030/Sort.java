public class Sort {
    public static void main (String[] args) {
        int num[] = new int[] {1, 234, 23, 3, 32, 44, 56, 75};
        final int SIZE = 8;
        for(int i = 1; i < SIZE; i++) {
            int temp = num[i], j = i - 1;
            for(; j > 0; j--) {
                if(num[j] > temp) {
                    num[j + 1] = num[j];
                }
                else {
                    break;
                }
            }
            num[j + 1] = temp;
        }
        for(int i = 0; i < SIZE; i++) {
            System.out.print(num[i] + " ");
        }
    }
}