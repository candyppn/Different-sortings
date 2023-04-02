import java.util.ArrayList;
public class BubbleSorting extends Sorting{

    public <T extends Comparable<T>> ArrayList<T> sort(ArrayList<T> list) {
        boolean test = true;
        while(test){
            test = false;
            for(int i = 0; i < list.size() - 1; i++){
                if(list.get(i).compareTo(list.get(i + 1)) > 0){
                    permute(list, i, i + 1);
                    test = true;
                    count++;
                }
            }
        }
        return list;
    }
}
