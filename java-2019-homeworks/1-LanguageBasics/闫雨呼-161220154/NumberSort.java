import java.util.Random;

public class NumberSort {
    //Change two numbers
    private static void swap(int[] numbers,int p1,int p2){
        int tmp=numbers[p1];
        numbers[p1]=numbers[p2];
        numbers[p2]=tmp;
    }
    private static int partition(int[] numbers,int low,int high){
        int pivot=numbers[low],pindex=low;
        swap(numbers,pindex,high);
        for(int i=low;i<high;i++){
            if(numbers[i]<=pivot) {
                swap(numbers,pindex,i);
                pindex++;
            }
        }
        swap(numbers,pindex,high);
        return pindex;
    }
    private static void quickSort(int[] numbers,int low,int high){
        if(low>=high)
            return;
        int pivotpos=partition(numbers,low,high);
        quickSort(numbers,low,pivotpos-1);
        quickSort(numbers,pivotpos+1,high);
    }
    public static void main(String[] args){
        //Generating an array by random
        final int length=10000;
        int numbers[]=new int[length];
        Random r = new Random(1);
        for(int i=0;i<length;i++)
            numbers[i]=r.nextInt(length*100);

        //Array Sorting
        quickSort(numbers,0,length-1);

        //Checking
        for(int i=0;i<length-1;i++){
            if(numbers[i]>numbers[i+1]) {
                System.out.println("Sorting Error");
                System.exit(1);
            }
        }
    }
}
