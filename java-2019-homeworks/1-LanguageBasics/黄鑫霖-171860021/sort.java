import java.util.Arrays;
public class sort
{ 
    public static void main(String[] args)
    {
        int[] array = {7,5,8,2,1,3,4,0,9,6};
        Arrays.sort(array);
        for (int num : array) {
            System.out.println(num);
        }
    }
}