import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        int[] integerArray = {43,7,32,94,8,52,23};
        Arrays.sort(integerArray);
        for(int num : integerArray){
            System.out.println(num);
        }
    }
}