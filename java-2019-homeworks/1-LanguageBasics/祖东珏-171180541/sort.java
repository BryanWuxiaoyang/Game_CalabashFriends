public class sort {
    public static void main(String []args) {
        int[] num = {3,6,3,8,11,55,100,99,6};
        int len = num.length;
        for(int i = 0; i < len - 1; i++) {
            for(int j = 0; j < len - 1 - i; j++) {
                if(num[j] > num[j+1]) {
                    int tmp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tmp;
                }
            }
        }
        for(int k = 0; k < len; k++)
            System.out.println(num[k]);
    }
}