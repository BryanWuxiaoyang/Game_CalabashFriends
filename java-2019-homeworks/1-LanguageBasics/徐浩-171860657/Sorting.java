import java.util.Arrays;
public class Sorting
{
    public static void main(String[] args)
    {
        int []numbers=new int[]{1,60,85,43,16,49,52,34,27,9,6};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]+"\t");
        }
    }
}
