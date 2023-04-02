import java.util.ArrayList;

public class BaseSorting extends Sorting {

    public <T extends Comparable<T>> ArrayList<T> sort(ArrayList<T> list) {
        for(int i = 0; i < list.size() - 1; i++){
            for(int j = 0; j < list.size() - i - 1; j++){
                if(list.get(j).compareTo(list.get(j + 1)) > 0){
                    permute(list, j, j + 1);
                    count++;
                }
            }
        }
        return list;
    }

}
