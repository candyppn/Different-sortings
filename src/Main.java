import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static <T extends Comparable<T>> LinkedList<T> cast(ArrayList<T> list) {
        LinkedList<T> linkedlist = new LinkedList<T>();
        for (T t : list) {
            linkedlist.add(t);
        }
        return linkedlist;
    }
    public static <T extends Comparable<T>> void main(String[] args) {


        System.out.println("Liste de taille 10 000, valeurs entre 0 et 100:" + " \n");

        ArrayList<T> list = Sorting.generateList(10000, 0, 100);
        ArrayList<T> bubblelist = (ArrayList<T>) list.clone();
        LinkedList<T> mergelist = (LinkedList<T>) cast(list);
        ArrayList<T> fastlist = (ArrayList<T>) list.clone();
        ArrayList<T> heaplist = (ArrayList<T>) list.clone();
        ArrayList<T> baselist = (ArrayList<T>) list.clone();


        System.out.println("Bubble Sorting");
        System.out.println(bubblelist);
        BubbleSorting bubble = new BubbleSorting();
        long startTimeBubble = System.nanoTime();
        System.out.println(bubble.sort(bubblelist));
        long endTimeBubble = System.nanoTime();
        long durationBubble = (endTimeBubble - startTimeBubble);
        double timeBubble = (double) durationBubble / 1_000_000;
        System.out.println("Nombres d'opérations: " + bubble.complexity() + "\nDurée: "+ timeBubble +"ms \n");


        System.out.println("Merge Sorting");
        System.out.println(mergelist);
        MergeSorting merge = new MergeSorting();
        long startTimeMerge = System.nanoTime();
        System.out.println(merge.sort(mergelist));
        long endTimeMerge = System.nanoTime();
        long durationMerge = (endTimeMerge - startTimeMerge);
        double timeMerge = (double) durationMerge / 1_000_000;
        System.out.println("Nombres d'opérations: " + merge.complexity() + "\nDurée: "+ timeMerge +"ms \n");


        System.out.println("Fast Sorting");
        System.out.println(fastlist);
        FastSorting fast = new FastSorting();
        long startTimeFast = System.nanoTime();
        System.out.println(fast.sort(fastlist));
        long endTimeFast = System.nanoTime();
        long durationFast = (endTimeFast - startTimeFast);
        double timeFast = (double) durationFast / 1_000_000;
        System.out.println("Nombres d'opérations: " + fast.complexity() + "\nDurée: "+ timeFast +"ms \n");


        System.out.println("Heap Sorting");
        System.out.println(heaplist);
        HeapSorting heap = new HeapSorting();
        long startTimeHeap = System.nanoTime();
        System.out.println(heap.sort(heaplist));
        long endTimeHeap = System.nanoTime();
        long durationHeap = (endTimeHeap - startTimeHeap);
        double timeHeap = (double) durationHeap / 1_000_000;
        System.out.println("Nombres d'opérations: " + heap.complexity() + "\nDurée: "+ timeHeap +"ms \n");



        System.out.println("Base Sorting");
        System.out.println(baselist);
        BaseSorting base = new BaseSorting();
        long startTimeBase = System.nanoTime();
        System.out.println(base.sort(baselist));
        long endTimeBase = System.nanoTime();
        long durationBase = (endTimeBase - startTimeBase);
        double timeBase = (double) durationBase / 1_000_000;
        System.out.println("Nombres d'opérations: " + base.complexity() + "\nDurée: "+ timeBase +"ms \n");

    }

}
