import java.util.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
       int n = 0;
       Scanner s = new Scanner(System.in);
       n = s.nextInt();
       int[] a = new int[n];
       for(int i=0;i<n;i++)
           a[i] = s.nextInt() ;
       s.close();

       Arrays.sort(a);
       for(int i=0;i<a.length;i++)
           System.out.print(a[i]+"  ");
    }
}
