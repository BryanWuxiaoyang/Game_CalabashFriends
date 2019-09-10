package com.company;
import java.util.Arrays;

public  class Main {
        public static void main(String[] args) {
int []ckArr={18,29,57,38,65,12,34,10,56};
for(int i=0;i<ckArr.length;i++){
    int Min=i;
    for(int j=i;j<ckArr.length;j++){
        if(ckArr[j]<ckArr[Min])Min=j;
    }
    int temp=ckArr[i];
    ckArr[i]=ckArr[Min];
    ckArr[Min]=temp;
}
System.out.println(Arrays.toString(ckArr));
        }
}