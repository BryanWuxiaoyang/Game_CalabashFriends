public class Sort {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,3,4,6,3,7,5,8,5,3,5,6,8,13,2,10};//int array
        for(int i = 1;i < arr.length;i++)//sort
        {
            int j = 0;
            for(;j < i && arr[j] <= arr[i];j++);
            int temp = arr[i];
            for(int k = i;k > j;k--)
            {
                arr[k] = arr[k - 1];
            }
            arr[j] = temp;
        }
        for(int i = 0;i < arr.length;i++)//outprint
            System.out.println(arr[i]);
    }
}