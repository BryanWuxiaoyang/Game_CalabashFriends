/*
    @author:zihanyang
    @homework_one:
    implement the sort algorithm to sort the integer array
 */

public class HelloWorld {
    public static void main(String[] args){
        int size=10;
        int[] array = new int[size];
        System.out.println("Before:");
        for (int i = 0; i < size; i++){
            array[i]=(int)(Math.random()*100);
            System.out.print(array[i] + "  ");
        }
        System.out.print('\n');
        System.out.println("After:");
        //sort
        quickSort(array,0,size-1, size);

        for (int i = 0; i <size; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static void quickSort(int[] array, int first, int last, int n)
    {
        if(first<last)
        {
            int pivot=array[first];
            int splitPoint=partition(array,pivot,first,last);
            array[splitPoint]=pivot;
            quickSort(array,first,splitPoint-1,n);
            quickSort(array,splitPoint+1,last,n);
        }
    }

    public static int partition(int[] array, int pivot, int first, int last)
    {
        while (first < last)
        {
            while (array[last] >= pivot && first < last)
                last--;
            array[first] = array[last];
            while (array[first] < pivot && first < last)
                first++;
            array[last] = array[first];
        }
        array[first]=pivot;
        return first;
    }
}
