/**
 * @author Verlygo Dmitry
 * @version 1.0
 */

package com.star;

public class Main {
    public static void main(String[] args) {
        NewArrayList<String> list = new NewArrayList<>();
        list.add("dadwas");
        list.add("dadva");
        list.add("gwas");
        list.add("3");
        list.add("vfsq");
        list.add("hgwefv");
        list.add("tfqe");
        Sort.sort(list);
        NewArrayList.NewIterator itt = list.createIterator();
        while(itt.hasNext()) {
            System.out.println(itt.next());
        }
    }
}


