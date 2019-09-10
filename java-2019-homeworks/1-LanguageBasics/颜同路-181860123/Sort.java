public class Sort {
    public static void BubbleSort(int a[], int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n - 1;j++){
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int[] array = {8, 3, 5, 4, 10, 6, 7, 1, 2, 9};
        System.out.println("Before Sort:");
        for(int k = 0;k < 10;k++)
            System.out.print(array[k] + " ");
        System.out.println();
        BubbleSort(array, 10);
        System.out.println("After Sort:");
        for(int q = 0;q < 10;q++)
            System.out.print(array[q] + " ");
    }
}
