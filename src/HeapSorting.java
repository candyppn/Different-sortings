import java.util.ArrayList;

public class HeapSorting extends Sorting{
    public <T extends Comparable<T>> ArrayList<T> sort(ArrayList<T> list){
        for(int i = list.size()/2 - 1; i >= 0; i--){
            heapify(list, list.size(), i);
        }
        for(int i = list.size() - 1; i >= 0; i--){
            permute(list, 0, i);
            heapify(list, i, 0);
        }
        return list;
    }

    public <T extends Comparable<T>> int heapify(ArrayList<T> list, int size, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < size && list.get(left).compareTo(list.get(largest)) > 0){
            largest = left;
        }
        if(right < size && list.get(right).compareTo(list.get(largest)) > 0){
            largest = right;
        }
        if(largest != i){
            permute(list, i, largest);
            count++;
            heapify(list, size, largest);
        }
        return count;
    }
}
