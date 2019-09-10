/*
    输入：数字，至输入-1结束
    输出：从小到大的排序
 */

import java.util.Scanner;
import java.util.Collections;
import java.util.Vector;

public class MySort {
    public static void main(String[] args){

        // 从键盘读入数据，为-1则停止
        Scanner myscanner = new Scanner(System.in);
        Vector<Integer> num = new Vector<>();
        while(true){
            int tmpnum = myscanner.nextInt();
            if(tmpnum==-1){
                break;
            }
            else{
                num.add(tmpnum);
            }
        }
        myscanner.close();

        // 按从小到大的顺序输出
        //System.out.println(num);
        Collections.sort(num);
        System.out.println(num);

    }
}
