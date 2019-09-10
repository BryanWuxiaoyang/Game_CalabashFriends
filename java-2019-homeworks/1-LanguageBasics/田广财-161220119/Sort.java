public class Sort {
    int []myarray;
    public Sort(int []array) {
        myarray=new int[array.length];
        for(int i=0;i<array.length;i++) {
            myarray[i]=array[i];
        }
    }
    public void BubbleSort() {
        for(int i=0;i<myarray.length;i++) {
            for (int j = i + 1; j < myarray.length; j++) {
                if (myarray[i] > myarray[j]) {
                    int t = myarray[j];
                    myarray[j] = myarray[i];
                    myarray[i]=t;
                }
            }
        }
    }
    public void PrintResult(){
        for(int i=0;i<myarray.length;i++){
            System.out.println(myarray[i]+" ");
        }
    }
    public static void main(String []args)
    {
        int []array={1,9,6,8,5,7,4,2,3,0};
        Sort sort=new Sort(array);
        sort.BubbleSort();
        sort.PrintResult();

    }

}
