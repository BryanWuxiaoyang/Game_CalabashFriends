
public class Sort {
    private static void sort(int[] lst){
        for(int i=0;i<lst.length-1;i++){
            int t=i;
            for(int j=i+1;j<lst.length;j++)
                if(lst[j]<lst[t])
                    t=j;
            int tmp=lst[t];
            lst[t]=lst[i];
            lst[i]=tmp;
        }
    }
    public static void main(String[] args){
        int[] lst={866,245,765,234,7887,355,32,654,1234,456};
        sort(lst);
        for (int value : lst)
            System.out.print(value + " ");
    }
}
