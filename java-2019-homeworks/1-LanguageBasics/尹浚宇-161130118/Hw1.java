public class Hw1
{
    public static void main(String []args)
    {
        int []arr = {500, -100, 1, 1, 10, 44, 78, 0, -123, 77, 30, 118};

        // sort in increase order
        for (int i = 0; i < 12; i++)
            for (int j = i + 1; j < 12; j++)
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

        // print
        for (int i = 0; i < 12; i++)
            System.out.print(arr[i] + " ");
    }
}