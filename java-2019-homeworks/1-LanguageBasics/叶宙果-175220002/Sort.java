public class Sort
{
    public static void main(String[] args)
    {
        int []a= {3,1,4,2,6,5};
        for(int i=0;i<5;i++)
        {
            int k=i;
            for(int j=i+1;j<6;j++)
            {
                if(a[j]<a[k])
                {
                    k=j;
                }
            }
            if(i!=k)
            {
                int t=a[i];
                a[i]=a[k];
                a[k]=t;
            }
        }
        for(int i=0;i<6;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\n");
    }
}