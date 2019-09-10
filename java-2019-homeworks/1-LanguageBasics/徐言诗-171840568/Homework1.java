import java.util.Arrays;
public class Homework1 {
    public static void main(String[] args) {
        int [] nums = {7,6,9,5,3,1,2,4,10,8};
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
