public class Sort{
    public static void main(String[] args)
    {
        int[] arrays={8,988,2,365,4};
        System.out.println("原数组为");
        for(int i=0;i<arrays.length;i++)
        {
            System.out.print(arrays[i]);
            System.out.print(" ");
        }
        System.out.print("\n");

        for(int i=0;i<arrays.length;i++)
        {
            for(int j=0;j<arrays.length-1;j++)
            {
                if(arrays[j]>arrays[j+1])
                {
                    int t=arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=t;
                }
            }
        }

        System.out.println("排序后数组为");
        for(int i=0;i<arrays.length;i++)
        {
            System.out.print(arrays[i]);
            System.out.print(" ");
        }
        System.out.print("\n");
    }
}