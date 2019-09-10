
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.nio.charset.*;
import java.util.*;
import java.lang.reflect.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.*;
import java.util.stream.Stream;

/*Toggle Button
* CheckBox
* Radio Button
* ButtonGroup
* ICon
 */
interface SortStrategy{
    public void sort(List<? extends Comparable> list);
}

class NormalSort implements SortStrategy{
    @Override
    public void sort(List<? extends Comparable> list) {
        Collections.sort(list);
    }
}

class QuickSort implements SortStrategy{
    @Override
    public void sort(List<? extends Comparable> list) {
        myList = list;
        recurSort(0, list.size());
    }

    private List myList;

    private void recurSort(int fromIndex, int toIndex){
        if(fromIndex + 1 >= toIndex){
            return;
        }
        int splitPointer = split(fromIndex, toIndex, getPivotIndex(fromIndex, toIndex));
        recurSort(fromIndex, splitPointer);
        recurSort(splitPointer + 1, toIndex);
    }

    private int split(int fromIndex, int toIndex, int pivotIndex){
        int smallerIndex = fromIndex;
        int checkIndex = fromIndex;
        Comparable pivot = (Comparable)myList.get(pivotIndex);

        while(checkIndex < toIndex){
            if(((Comparable)myList.get(checkIndex)).compareTo(pivot) < 0){
                if(smallerIndex == pivotIndex)
                    pivotIndex = checkIndex;
                else if(checkIndex == pivotIndex)
                    pivotIndex = smallerIndex;
                exchange(smallerIndex, checkIndex);
                ++smallerIndex;
            }
            ++checkIndex;
        }
        exchange(pivotIndex, smallerIndex);
        return smallerIndex;
    }

    private int getPivotIndex(int fromIndex, int toIndex){
        return fromIndex;
    }

    private void exchange(int index1, int index2){
        Object comp1 = myList.get(index1);
        Object comp2 = myList.get(index2);
        myList.set(index1, comp2);
        myList.set(index2, comp1);
    }

    private void exchange(ListIterator it1, ListIterator it2){

    }
}
public class Main{
    public static void doSort(List list, SortStrategy sortStrategy){
        sortStrategy.sort(list);
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int size = scanner.nextInt();
        while(size-- > 0){
            array.add(scanner.nextInt());
        }
        doSort(array, new NormalSort());
        for(Integer integer : array){
            System.out.printf("%d ", integer);
        }
        System.out.println();
    }
}
