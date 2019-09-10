import java.util.*;

public class Sort
{
    public static void main(String[] args)
    {
        int[] array = new int[10];//create a new random array
        for(int i = 0;i<10;i++)
            array[i] = (int)(Math.random()*100);
        for(int i = 0;i<10;i++)//sort
        {
            int k = i;
            for(int j = i+1;j<10;j++)
                if(array[j] < array[k])
                    k = j;
             int temp = array[i];
             array[i] = array[k];
             array[k] = temp;
        }
        for(int i = 0;i<10;i++)//output
            System.out.println(array[i]);
    }
}
