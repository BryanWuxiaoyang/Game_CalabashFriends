package sort;

public class sort {
    public static void main(String[] args) {
        int[] array={5,6,4,3,8,7,2,9,0,1};
        System.out.println("The array before sorting: ");
        for(int num:array) {
            System.out.print(num + " ");
        }
        for(int i=0;i<array.length-1;i++) {
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("The array after sorting：");
        for(int num:array) {
            System.out.print(num + " ");
        }
    }
}
