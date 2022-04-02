package com.star;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void sort() {
        NewArrayList<Integer> list = new NewArrayList<>();
        list.add(54);
        list.add(36);
        list.add(71);
        list.add(65);
        list.add(67);
        list.add(51);
        list.add(31);
        NewArrayList<Integer> list2 = new NewArrayList<>();
        list2.add(31);
        list2.add(36);
        list2.add(51);
        list2.add(54);
        list2.add(65);
        list2.add(67);
        list2.add(71);
        Sort.sort(list);
        for(int i=0; i<7;i++) {
            Assert.assertEquals(list2.get(i), list.get(i));
        }
    }
}