package com.star;

import java.util.Comparator;

/**
 * class for quicksort
 */
public class Sort {
    public static <T extends  Comparable<T>> void sort(NewArrayList<T> list) {
        quickSort(list, 0, list.size()-1);
    }

    /**
     * Sort collection
     * @param list collection to sort
     * @param start index of the first object to sort
     * @param end index of the last object to sort
     * @param <T> generic type
     */
    public static <T extends Comparable<T>> void quickSort(NewArrayList<T> list, int start, int end) {
        if (start >= end)
            return;
        int cur = start;
        int i = start+1, j = end;
        do {

            while (i < j && ( list.get(i).compareTo(list.get(cur))<=0)) {
                i++;
            }
            while (i < j && ( list.get(cur).compareTo(list.get(j))<=0)) {
                j--;
            }
            if (i < j) {
                swap(list, i, j);
            }
            else if(i==j) {
                if(list.get(cur).compareTo(list.get(i))<=0) {
                    swap(list, cur, i - 1);
                    cur=i-1;
                }
                else {
                    swap(list, cur, i);
                    cur=i;
                }
            }
        } while (i < j);

        quickSort(list, start, cur-1);
        quickSort(list,cur+1, end);

    }

    /**
     * Swap two objects from collection
     * @param list collection
     * @param a index of first object
     * @param b index of second object
     * @param <T> generic type
     */
    private static <T extends  Comparable<T>> void swap (NewArrayList<T> list, int a, int b) {
        T temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
