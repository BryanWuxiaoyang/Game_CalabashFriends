public class simplesort {
    public static void main(String args[])
    {
        int []array={-1,6,-65,20,0,25,84385,-234,8,9,7};
        int i,j,k;
        System.out.println("The previous array:");
        for(i=0;i<11;i++)
        System.out.println(array[i]);
        for(i=0;i<10;i++)
            for(j=i+1;j<11;j++)
            {
                if(array[i]>array[j])
                {
                    k=array[i];
                    array[i]=array[j];
                    array[j]=k;
                }
            }
        System.out.println("After sorted:");
        for(i=0;i<11;i++)
            System.out.println(array[i]);
    }
}
