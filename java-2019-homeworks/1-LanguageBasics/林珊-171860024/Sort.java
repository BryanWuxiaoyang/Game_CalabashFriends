public class Sort{
    public static void main(String[] args){
        int[] array={1,5,9,2,7,3,8,10,4,6};
        for(int i=9;i>=0;i=i-1){
            for(int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<10;i++){  
            System.out.print(array[i]);
            
        }
        System.out.print('\n');
    }
}