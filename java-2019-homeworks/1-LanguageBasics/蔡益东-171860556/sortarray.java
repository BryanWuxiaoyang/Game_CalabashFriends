public class sortarray {
    public static void main(String[] args) {
        int data[] = new int[]{21,4,42,41,8,18,1,81,84,5};
        for (int i=0;i<data.length;i++)
            for (int j=i+1;j<data.length;j++) {
                if (data[i]>data[j]) {
                    int tmp=data[i];
                    data[i]=data[j];
                    data[j]=tmp;
                }
            }
        //Bubble-sort
        for (int i=0;i<data.length;i++)
            System.out.print(data[i]+" ");
        //System.out.println();
    }
}
