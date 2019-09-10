import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] nums={1,3,5,4,2,9,1,3,8};
        quickSort(0,nums.length-1,nums);
        System.out.println(Arrays.toString(nums));
    }

    static int partition(int left,int right,int[] nums) {
        int cp=nums[left];
        int pl=left;
        for(int pc=left+1;pc<=right;pc++) {
            if(nums[pc]<cp) {
                nums[pl]=nums[pc];
                pl++;
                nums[pc]=nums[pl];
            }
        }
        nums[pl]=cp;
        return pl;
    }

    static void quickSort(int left,int right,int[] nums) {
        if(left>=right)
            return;
        int pos=partition(left,right,nums);
        quickSort(left,pos-1,nums);
        quickSort(pos+1,right,nums);
    }
}
