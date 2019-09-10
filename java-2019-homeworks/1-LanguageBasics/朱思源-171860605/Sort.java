import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        System.out.println("Please enter the number to be sorted, separated by spaces, ending with -1.");
        int element;
        Scanner in=new Scanner(System.in);
        element=in.nextInt();
        while(element!=-1)
        {
            list.add(element);
            element=in.nextInt();
        }
        System.out.print("before:");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(" "+(int)list.get(i));
        }
        Collections.sort(list);
        System.out.println();
        System.out.print("after:");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(" "+(int)list.get(i));
        }
    }
}