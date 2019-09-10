public class Recrusion{
    public static void main(String[] args) {
        int numbers[] = new int[]{23,56,79,12,6,45,72,12};
        int i=8;
        for(;i>1;i--){
            int max=0;
            for(int j=1;j<i;j++){
                if(numbers[max]<numbers[j]){
                    max=j;
                }
            }
            int temp=numbers[max];
            numbers[max]=numbers[i-1];
            numbers[i-1]=temp;
        }
        for(int j=0;j<8;j++){
            System.out.println(numbers[j]);
        }
    }
    
}