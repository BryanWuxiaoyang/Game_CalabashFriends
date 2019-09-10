/*
    Sort Array
    This Java Example shows how to sort array in correct order
 */
public class SortArray{
    public  static void main(String[] args){
        //array of 10 numbers
        int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
        //bubble sort
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <numbers.length; j++){
                //swap number if front number > back number
                if (numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        //print sorted array
        System.out.print("The sorted Array is :");
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]);
            System.out.print(",");
        }
    }
}