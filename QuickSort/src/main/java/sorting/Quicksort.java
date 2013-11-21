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

    /**
     * 퀵소트 정렬 알고리즘입니다.
     * @author seungwon
     * @param arrayList
     * @return 정렬 된 List
     */
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
        resultList.addAll(Sort(lessList));                      // 재귀적으로 남은 리스트들을 정렬하고 결과리스트에 삽입한다.
        resultList.addAll(pivotList);                           // lessList와 greaterList 사이에 pivot이 있는 List를 삽입.
        resultList.addAll(Sort(greaterList));                   // 마찬가지로 남은 리스트들을 재귀적으로 정렬하여 반환한 리스트를 결과리스트에 삽입.
        return resultList;
    }

    /**
     * 리스트의 마지막 값을 받아오는 메소드입니다.
     * @author seungwon
     * @return the last element of sorted list.
     */
    public Integer getLastObject() {
        return sortedList.get(sortedList.size()-1);
    }

    /**
     * 해당 인덱스의 리스트 값을 받아오는 메소드입니다.
     * @author seungwon
     * @param index
     * @return the element of index in sorted list.
     */
    public Integer getObjectOfIndex(int index) {
        return sortedList.get(index);
    }

    /**
     * 해당 인덱스의 리스트 값을 받아오는 메소드입니다.
     * @author seungwon
     * @param elem
     * @return the index of specific element in sorted list.
     */
    public int getIndexOfElements(Integer elem) {
        int index = -1;
        for (int i=0; i<sortedList.size(); i++) {
            if (sortedList.get(i).equals(elem)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
