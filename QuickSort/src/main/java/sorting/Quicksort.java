package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: seung-wongim
 * Date: 2013. 11. 21.
 * Time: 오후 3:24
 * To change this template use File | Settings | File Templates.
 */
public class Quicksort {
    private List<Integer> sortedList = new ArrayList<Integer>();
    public Quicksort(List<Integer> arrayList) {
        sortedList = Sort(arrayList);
    }

    public List<Integer> Sort(List<Integer> arrayList) {
        List<Integer> lessList = new ArrayList<Integer>();
        List<Integer> pivotList = new ArrayList<Integer>();
        List<Integer> greaterList = new ArrayList<Integer>();

        if (arrayList.size() <= 1) {
            return arrayList;
        }
        int pivot = arrayList.get(arrayList.size()-1);
        for (int e : arrayList) {
            if (e < pivot) lessList.add(e);
            else if (e > pivot) greaterList.add(e);
            else { }
        }
        pivotList.add(pivot);

        List<Integer> resultList = new ArrayList<Integer>();
        resultList.addAll(Sort(lessList));
        resultList.addAll(pivotList);
        resultList.addAll(Sort(greaterList));
        return resultList;
    }

    public Integer getLastObject() {
        return sortedList.get(sortedList.size()-1);
    }
}
