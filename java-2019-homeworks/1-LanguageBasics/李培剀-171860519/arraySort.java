public class arraySort {
    public static void main(String[] args){
        int[] arr = {9, 3, 5, 2, 13, 4, 5, 8, 6};
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
