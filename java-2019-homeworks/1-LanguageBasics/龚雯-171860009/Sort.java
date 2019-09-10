public class Sort{
    public static void main(String[] args) {

        int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
        int temp=0;
        for(int i=1;i<numbers.length;i++){
            for(int j=0;j<numbers.length-i;j++){
                if(numbers[j]>numbers[j+1])
                {
                    temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println(" Sorted array : ");
        for(int i=0;i<numbers.length;i++)
        System.out.println(numbers[i]);
    }
}

