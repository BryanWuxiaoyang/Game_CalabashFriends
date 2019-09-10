import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        ArrayList<Calabash> calabashes = new ArrayList<>(Arrays.asList(Calabash.values()));
        System.out.println("原始序列：" + calabashes);

        Collections.shuffle(calabashes);
        System.out.println("打乱序列：" + calabashes);

        Commands.sort(calabashes, Calabash.FROM_OLD_TO_YOUNG, new SortStragegies.BubbleSort<>());
        System.out.println("排序序列（冒泡算法）: " + calabashes);

        Collections.shuffle(calabashes);
        System.out.println("打乱序列： " + calabashes);

        Commands.sort(calabashes, Calabash.FROM_RED_TO_PURPLE, new SortStragegies.MergeSort<>());
        System.out.print("排序序列（归并算法）： ");
        System.out.print("[");
        for(Calabash calabash : calabashes){
            System.out.print(calabash.color + ", ");
        }
        System.out.println("]");
        Collections.sort(calabashes);
        calabashes.toArray();
    }
}

