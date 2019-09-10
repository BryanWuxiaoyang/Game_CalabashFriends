import java.util.Arrays;
public class sort {
        public static void main(String[] args ){
            //System.out.print("please input number of the array:");
            int []array = new int[]{114,145,-21,2195,215,-259,15617,-251,12,32,27,159,-1};
            Arrays.sort(array);
            for(int i : array)
                System.out.println(i+" ");
        }

}
