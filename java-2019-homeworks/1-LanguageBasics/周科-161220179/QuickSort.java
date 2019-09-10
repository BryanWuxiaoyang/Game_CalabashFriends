public class QuickSort {
    public static void mySort(int array[], int low, int high) {
        if (low < high) {
            int pivot = array[low];
            int position = low;
            int temp;
            for (int i = low + 1; i <= high; i++) {
                if (array[i] < pivot) {
                    position++;
                    temp = array[i];
                    array[i] = array[position];
                    array[position] = temp;
                }
            }
            temp = array[low];
            array[low] = array[position];
            array[position] = temp;
            mySort(array, low, position - 1);
            mySort(array, position + 1, high);
        }
    }
    public static void main(String[] args){
       // System.out.println("Hello World!");
        int array[]={6,1,7,8,2,5,9};
        mySort(array,0,6);
        for(int i=0;i<=6;i++)
            System.out.println(array[i]);
    }
}
