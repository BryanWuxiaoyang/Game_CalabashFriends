import java.util.Comparator;
import java.util.List;

class Commands{
    public static <T> void sort(List<T> list, Comparator<T> comparator, SortStrategy<T> strategy){
        strategy.sort(list, comparator);
    }

    public static <T> String moveInfo(List<T> list, int indexFrom, int indexTo){
        return list.get(indexFrom) + ": " + indexFrom + "->" + indexTo;
    }
}
