public class MySort
{
    public static void bSort(int[] A)
    {
        int temp;
        for(int i=0;i<A.length-1;++i)
        for(int j=0;j<A.length-1-i;++j)
        {
            if(A[j+1]<A[j])
            {
                temp=A[j];
                A[j]=A[j+1];
                A[j+1]=temp;
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] array = new int[]{50,18,34,6,99,12,77,46,88};
        bSort(array);
        for(int i=0;i<array.length;++i)
        System.out.println(array[i]+",");
    }
}