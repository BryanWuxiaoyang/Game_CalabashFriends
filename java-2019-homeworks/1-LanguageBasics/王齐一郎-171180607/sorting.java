public class sorting {

    private static void mySort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int tmp = a[i];
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > tmp) a[j + 1] = a[j];
                else {
                    a[j + 1] = tmp;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 41, 21, 2, 3, 254, 21};
        mySort(a);
        for (int bb : a) System.out.print(bb + " ");

    }


}
