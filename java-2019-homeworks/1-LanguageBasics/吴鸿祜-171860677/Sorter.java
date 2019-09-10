import java.util.*;

public class Sorter{
    public static void main(String[] args)
    {
        int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
        Arrays.sort(numbers);
        for(int num : numbers) System.out.println(num);
    }
}
