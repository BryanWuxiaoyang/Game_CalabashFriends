import java.sql.Array;
import java.util.ArrayList;
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        int [] nums={2,4,5,3,7,6,9,8,0,1};
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
