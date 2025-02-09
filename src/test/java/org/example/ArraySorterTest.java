package org.example;

import org.junit.jupiter.api.Test;

public class ArraySorterTest {

    @Test
    public void isSorted() {
        ArraySorter sorter = new ArraySorter();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 4, 3, 5};
        sorter.isSorted(a);
        sorter.isSorted(b);
    }

    @Test
    public void swapFL() {
        ArraySorter sorter = new ArraySorter();
        int[] a = {1, 2, 3, 4, 5};
        a = sorter.swapFL(a);
        for (int i : a) {
            System.out.print(i);
        }
    }

    @Test
    public void firstUnique() {
        ArraySorter sorter = new ArraySorter();
        int[] a = {1, 2, 3, 1, 2, 4};
        System.out.println(sorter.firstUnique(a));
    }

    @Test
    public void mergeSort() {
        ArraySorter sorter = new ArraySorter();
        int[] a = {4, 2, 5, 3, 1};
        a = sorter.mergeSort(a);
        for (int i : a) {
            System.out.print(i);
        }
    }
}
