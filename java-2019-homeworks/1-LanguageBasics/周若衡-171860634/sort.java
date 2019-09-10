
public class sort{

    public static int partition(int array[],int left,int right){
        int pivot = array[left];
        int pivotpos = left;

        for(int i=left+1;i<=right;i++){
            if(array[i]<pivot){
                pivotpos++;
                if(pivotpos!=i){
                    int tmp = array[pivotpos];
                    array[pivotpos] = array[i];
                    array[i] = tmp;
                }
            }
        }

        array[left]=array[pivotpos];array[pivotpos] = pivot;
        return pivotpos;
    }

    public static void quicksort(int array[],int left,int right){
        if(left < right){
            int partition = partition(array, left, right);
            quicksort(array, left, partition-1);
            quicksort(array, partition+1, right);
        }
    }

    public static void main(String []args){
        int array[]={5,7,13,20,1,23,15,40,67,34};
        quicksort(array, 0, array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}