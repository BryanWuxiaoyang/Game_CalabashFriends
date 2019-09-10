public class sort {
    public int[] arr;

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,9,10,7,89,103,55,78,12,13};


        System.out.println("before sorting£º");
        for(int num:arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("result of sorting£º");
        sort.BubbleSort(arr);
        for(int num:arr) {
            System.out.print(num + " ");
        }
    }
}
