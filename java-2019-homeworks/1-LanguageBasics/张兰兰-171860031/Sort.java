package Sort;
public class Sort {


    public void bubble_sort(int []a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public void show(int []a){

        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args){
        Sort MySort=new Sort();
        int []a={108,34,9,65,23,77};
        System.out.println("排序前数字是：\n");
        MySort.show(a);
        MySort.bubble_sort(a);
        System.out.println("排序后结果是：\n");
        MySort.show(a);
        System.out.println("\n");
    }
}
