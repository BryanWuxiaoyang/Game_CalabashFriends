public class SortIntArray {
    public static void main(String[] args) {
        final int SIZE = 10;//数组大小
        int[] mylist = {3, 9, 2, 1, 0, 5, 4, 7, 6, 8};
        for (int i = 0; i < SIZE; i++) {//冒泡排序
            for (int j = 0; j < SIZE - i - 1; j++) {
                if (mylist[j] > mylist[j + 1]) {
                    int temp = mylist[j];
                    mylist[j] = mylist[j + 1];
                    mylist[j + 1] = temp;
                }
            }
        }
        for (int i=0; i < SIZE; i++)
            System.out.println(mylist[i]);
    }
}
