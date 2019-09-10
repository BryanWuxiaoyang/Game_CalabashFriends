import java.util.Comparator;
import java.util.List;

interface SortStrategy<T>{
    void sort(List<T> list, Comparator<T> comparator);
}
