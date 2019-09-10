import java.util.Arrays;
/*
    use Arrays.sort to sort
*/
public class ArraySort{
    public static void main(String[]args){
        int a1 []={0,9,8,6,1,2,4,7,5,3};
        Arrays.sort(a1);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]);
            System.out.print(" ");
        }
    }
}