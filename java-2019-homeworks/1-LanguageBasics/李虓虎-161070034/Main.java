package org.nju.edu.Test;

import org.nju.edu.Test.ReadDoc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static int[] sort(int[] target){
        int l = target.length;
        if(l == 0 || l ==1){
            return target;
        }
        for(int i = 0; i< l;i++){
            for(int j = 0; j < l-i-1; j++){
                if(target[j] < target[j+1]){
                    target[j] = target[j]+target[j+1];
                    target[j+1] = target[j] - target[j+1];
                    target[j] = target[j] - target[j+1];
                }
            }
        }
        return target;
    }

    public static void main(String[] args){
        int[] target = {1,2,3,4,5};
        int[] result = sort(target);
        System.out.println(Arrays.toString(result));
    }
}
