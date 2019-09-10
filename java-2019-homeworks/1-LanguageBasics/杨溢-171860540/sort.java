import java.util.Scanner;
//首先输入数字的数量，然后输入整型数字
public class sort {
    int data[];
    int lenth;
    public static void main(String[] args){
        sort s = new sort();
        s.scan();
    }
    public void scan(){
        Scanner in = new Scanner(System.in);
        lenth = in.nextInt();
        data = new int[lenth];
        for(int i=0; i<= lenth-1; i++){
            data[i] = in.nextInt();
        }
        merge_sort(0,lenth-1);
        for(int i=0; i<= lenth-1; i++){
            System.out.print(data[i]);
            System.out.print(' ');
        }
        System.out.print('\n');
    }
    public void merge_sort(int s, int e){
        if(s>=e)
            return;
        int m = (s+e)/2;
        merge_sort(s,m);
        merge_sort(m+1,e);
        merge(s,e);
    }
    public void merge(int s, int e){
        int m = (s+e)/2;
        int a[] = new int[m-s+1];
        int b[] = new int[e-m];
        for(int i=s;i<=m;++i)
            a[i-s] = data[i];
        for(int i=m+1;i<=e;++i)
            b[i-m-1] = data[i];
        int x=0;
        int y=0;
        int z=s;
        while(x<=m-s&&y<=e-m-1){
            if(a[x]<=b[y]){
                data[z] = a[x];
                ++x;++z;
            }
            else{
                data[z] = b[y];
                ++y;++z;
            }
        }

        if (x > m - s) {
            for (; z <= e; ++z) {
                data[z] = b[y];
                ++y;
            }
        } else if (y > e - m - 1) {
            for (; z <= e; ++z) {
                data[z] = a[x];
                ++x;
            }
        }

    }
}
