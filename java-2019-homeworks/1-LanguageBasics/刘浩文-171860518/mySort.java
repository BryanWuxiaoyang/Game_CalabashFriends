package mySort;

public class mySort {
    public static void main(String[] args)
    {
        int nums[]={26,14,72,37,4,78,45,56,2,47,77,42,30};
        int len=13;
        for(int i=1;i<len;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int tmp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
        }
        //for(int i=0;i<len;i++) System.out.print(nums[i]);
    }
}
