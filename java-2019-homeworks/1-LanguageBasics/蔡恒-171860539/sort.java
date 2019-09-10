public class sort {
    //a simple implement for quick sort
    public static void quicksort(int[] array,int low,int high){
        int i,j,pivot,temp;
        if(low>=high){
            return;
        }
        i=low;
        j=high;
        pivot = array[low];
        while (i<j) {
            while (pivot<=array[j]&&i<j) {
                j--;
            }
            while (pivot>=array[i]&&i<j) {
                i++;
            }
            //exchange the value of array[i] array[j]
            if (i<j) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        array[low] = array[i];
        array[i] = pivot;
        //recursion
        quicksort(array, low,j-1);
        quicksort(array, j+1, high);
    }
    public static void main(String[] args){
        //a sample input, 171860539 is my student number
        int[] array = {17,1,8,6,0,5,3,9};
        quicksort(array, 0, array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
