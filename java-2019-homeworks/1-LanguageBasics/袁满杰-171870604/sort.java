import java.util.Random;

/**
 * author Yuan Manjie
 * date 2019/9/3
 * java course homework1
 */

public class sort {
    private static final int LEN=15;
    public static void main(String[] args) {
        Random r= new Random();
        int numbers[] = new int[LEN];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=r.nextInt(100);
        }
        System.out.println("Before Sort:");
        for(int i:numbers)
        {
            System.out.printf("%d ",i);
        }
        Sort(numbers);
        System.out.println("\nAfter Sort:");
        for(int i:numbers)
        {
            System.out.printf("%d ",i);
        }
    }
    // Bubble Sort
    public static void Sort(int[] numbers){
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length-i-1;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    numbers[j+1]+=numbers[j];
                    numbers[j]=numbers[j+1]-numbers[j];
                    numbers[j+1]-=numbers[j];
                }
            }
        }
    }
}
