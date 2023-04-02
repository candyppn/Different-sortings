
import java.util.ArrayList;
import java.util.LinkedList;

public class MergeSorting extends Sorting {

    public <T extends Comparable<T>> LinkedList<T> sort(LinkedList<T> list) {
        if (list.size() <= 1) {
            return list;
        }
        LinkedList<T> left = new LinkedList<T>();
        LinkedList<T> right = new LinkedList<T>();
        int middle = list.size() / 2;
        for (int i = 0; i < middle; i++) {
            left.add(list.get(i));
        }
        for (int i = middle; i < list.size(); i++) {
            right.add(list.get(i));
        }
        left = sort(left);
        right = sort(right);
        return merge(left, right);
    }

    public <T extends Comparable<T>> LinkedList<T> merge(LinkedList<T> left, LinkedList<T> right) {
        LinkedList<T> result = new LinkedList<T>();
        while (left.size() > 0 || right.size() > 0) {
            if (left.size() > 0 && right.size() > 0) {
                if (left.getFirst().compareTo(right.getFirst()) <= 0) {
                    result.add(left.removeFirst());
                } else {
                    result.add(right.removeFirst());
                }
                count++;
            } else if (left.size() > 0) {
                result.add(left.removeFirst());
            } else if (right.size() > 0) {
                result.add(right.removeFirst());
            }
        }
        return result;
    }

}
