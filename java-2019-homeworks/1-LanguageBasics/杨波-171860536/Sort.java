//sort
public class Sort{
    static int[] data = {10,12,1,3,5,7,11,9,2,4,8,6};
    static void myInsertSort(int[] data,int size){
        for(int i = 1;i < size; ++i){
            for(int j = i-1;j >= 0 && data[j]>data[j+1];--j){
                int temp = data[j];
                data[j] = data[j+1];
                data[j+1] = temp;
            }
        }
    }
    public static void main(String[] args){      
        myInsertSort(data,12);
        for(int i = 0;i < 12;++i){
            System.out.println(data[i]);
        }
    }
}