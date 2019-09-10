public class sort{
    /*从大到小排序*/
    public static void main(String[] args){
        int[] sortArray={1,2,3,4,5,6,7,8};
        int current,now,temp;
        /*排序*/
        for(int i=0;i<8;i++){
            current=sortArray[i];
            now=i;
            for(int j=i+1;j<8;j++){
                if(sortArray[j]>current){
                    current=sortArray[j];
                    now=j;
                }
            }
            temp=sortArray[now];
            sortArray[now]=sortArray[i];
            sortArray[i]=temp;
        }
        /*输出*/
        for(int i=0;i<8;i++){
            System.out.println(sortArray[i]);
        }
    }
}

