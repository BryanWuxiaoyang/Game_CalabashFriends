import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortStragegies{
    static class DefaultSort<T> implements SortStrategy<T>{
        @Override
        public void sort(List<T> list, Comparator<T> comparator) {
            list.sort(comparator);
        }
    }

    static class BubbleSort<T> implements SortStrategy<T>{
        List<T> list;
        Comparator<T> comparator;
        @Override
        public void sort(List<T> list, Comparator<T> comparator) {
            this.list = list;
            this.comparator = comparator;
            sortWithIndex();
        }


        private void sortWithIndex(){
            for(int i = 0; i < list.size(); i++){
                for(int j = i + 1; j < list.size(); j++){
                    testAndExchange(i, j);
                }
            }
        }

        private void sortWithIterator(){
            throw new UnsupportedOperationException();
        }

        private void testAndExchange(int index1, int index2){
            int compResult = comparator.compare(list.get(index1), list.get(index2));
            if(compResult > 0){
                System.out.print(Commands.moveInfo(list, index1, index2) + "   ");
                System.out.println(Commands.moveInfo(list, index2, index1));
                T elem1 = list.get(index1);
                T elem2 = list.get(index2);
                list.set(index1, elem2);
                list.set(index2, elem1);
            }
        }
    }

    static class MergeSort<T> implements SortStrategy<T>{
        List<T> list;
        Comparator<T> comparator;
        @Override
        public void sort(List<T> list, Comparator<T> comparator) {
            this.list = list;
            this.comparator = comparator;
            sortWithIndex();
        }

        private void sortWithIndex(){
            mergeSort(0, list.size());
        }

        private void sortWithIterator(){

        }

        private void mergeSort(int indexFrom, int indexTo){
            if(indexFrom + 1 >= indexTo){
                return;
            }

            int indexMid = (indexFrom + indexTo) / 2;
            mergeSort(indexFrom, indexMid);
            mergeSort(indexMid, indexTo);

            merge(indexFrom, indexMid, indexTo, null);
        }

        private void merge(int indexFrom, int indexMid, int indexTo, List<T> bufferList){
            if(bufferList == null){
                bufferList = new ArrayList<>(indexTo - indexFrom);
            }
            else{
                bufferList.clear();
            }

            System.out.println("merging list " + indexFrom + "--" + indexTo);

            int index1 = indexFrom;
            int index2 = indexMid;

            while(index1 < indexMid && index2 < indexTo){
                T elem1 = list.get(index1);
                T elem2 = list.get(index2);
                if(comparator.compare(elem1, elem2) < 0){
                    if(index1 != indexFrom + bufferList.size())
                        System.out.print(Commands.moveInfo(list, index1, indexFrom + bufferList.size()) + "    ");
                    bufferList.add(elem1);
                    index1++;
                }
                else{
                    if(index2 != indexFrom + bufferList.size())
                        System.out.print(Commands.moveInfo(list, index2, indexFrom + bufferList.size()) + "    ");
                    bufferList.add(elem2);
                    index2++;
                }
            }

            if(index1 < indexMid) {
                for(int i = index1; i < indexMid; i++){
                    int destIndex = indexFrom + bufferList.size() + i - index1;
                    if(i != destIndex) {
                        System.out.print(Commands.moveInfo(list, i, destIndex) + "    ");
                    }
                }
                bufferList.addAll(list.subList(index1, indexMid));
            }
            else if(index2 < indexTo) {
                for(int i = index2; i < indexTo; i++){
                    int destIndex = indexFrom + bufferList.size() + i - index2;
                    if(i != destIndex) {
                        System.out.print(Commands.moveInfo(list, i, destIndex) + "    ");
                    }
                }
                bufferList.addAll(list.subList(index2, indexTo));
            }
            System.out.println();

            Collections.copy(list.subList(indexFrom, indexTo), bufferList);
        }
    }
}
