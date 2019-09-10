public class SelectSort {
    public static void main(String[] args){
        int []array={10,21,78,3,101,7,4,1};
        for(int i=0;i<array.length-1;i++) {
            int min = i;//递增序列
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
    }
}
