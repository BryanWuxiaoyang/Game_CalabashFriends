import java.util.Arrays;
public class sort{
    public static void main(String[] args){
        int[] array = {18,67,9,197,164,752,3,95,96,11};
        System.out.println("begin sorting:"+Arrays.toString(array));
        //select sort
        int temp=0;
        for(int i=0;i<array.length-1;i++){
           int index=i;
            for(int j=i+1;j<array.length;j++){
                if(array[index]>array[j])
                    index=j;
            }
            if(index!=i){
                temp=array[i];
                array[i]=array[index];
                array[index]=temp;
            }
        }
        System.out.println("after sorting:"+Arrays.toString(array));
    }
}