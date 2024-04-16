package conc.callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer>listToSort;
    MergeSorter(List<Integer> listToSort){
        this.listToSort = listToSort;
    }
    @Override
    public List<Integer> call() throws Exception {
        int n = listToSort.size();
        if(n <= 1) return  listToSort;
        List<Integer> leftHalf = new ArrayList<>();
        List<Integer> rightHalf = new ArrayList<>();
        for(int i = 0; i < n/2; i++){
            leftHalf.add(listToSort.get(i));
        }
        for(int i = n/2; i < n; i++){
            rightHalf.add(listToSort.get(i));
        }

        MergeSorter leftSorter = new MergeSorter(leftHalf);
        MergeSorter rightSorter = new MergeSorter(rightHalf);
        ExecutorService es = Executors.newCachedThreadPool();
        List<Integer> leftSorted =  es.submit(leftSorter).get();
        List<Integer> rightSorted = es.submit(rightSorter).get();

        int j=0, i =0;
        List<Integer> sortedList = new ArrayList<>();
        while(i< leftSorted.size() && j <rightSorted.size()){

        }
        return sortedList;
    }
}
