import java.util.*;
public class Helloworld {
    public static void main(String[] args){
        int numbers[]=new int[]{12,23,32,64,35,46,87,68,76,96};
        //array of 10 numbers
        for(int i=1;i<numbers.length-1;i++)//bubbling sorting from small to large
            for(int j=i+1;j<numbers.length;j++)
                if(numbers[j]<numbers[i]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];//exchange numbers
                    numbers[i] = temp;
                }
        for(int k=1;k<numbers.length;k++)
        System.out.println(numbers[k]);//print sorted array
    }

}
