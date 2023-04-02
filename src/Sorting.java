import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public abstract class Sorting {
    int count = 0;

    public int complexity(){
        return count;
    }

    public <T extends Comparable<T>>  void permute(ArrayList<T> list, int i, int j){
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public <T extends Comparable<T>> void permute(LinkedList<T> list, int i, int j){
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static <T extends Comparable<T>> ArrayList<T> generateList(int size, int min, int max) {
        ArrayList<T> list = new ArrayList<T>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add((T) Integer.valueOf(rand.nextInt(max - min) + min));
        }
        return list;
    }

    public static <T extends Comparable<T>> ArrayList<T> sub(ArrayList<T> list, int i, int j){
        ArrayList<T> out = new ArrayList<T>();
        for (i=i;i<j;i++){
            out.add(list.get(i));
        }
        return out;
    }



}
