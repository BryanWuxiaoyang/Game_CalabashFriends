import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class homework1 {
    public static void main(String[] args) {
        int a[] = {100, 93, 78, 120, 46, 327};
        int temp = 0;
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            temp = a[i];
            for (; j >= 0 && temp < a[j]; j--) {
                a[j + 1] = a[j];                       //将大于temp的值整体后移一个单位
            }
            a[j + 1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}