public class Sort {
    public static void main(String[] args){
        int I[]={1,1,2,3,4,12,3,45,6,90,78};
        for(int i=0;i<11;i++)
        {
            for(int j=i+1;j<11;j++)
            {
                if(I[i]>I[j])
                {
                    int temp=I[i];
                    I[i]=I[j];
                    I[j]=temp;
                }
            }
        }
        for(int i=0;i<11;i++)
            System.out.println(I[i]);
    }
}
