package org.example;

import java.util.Arrays;

public class ArraySorter {
    public void isSorted(int[] array) {
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("Please, try again");
                return;
            }
        }
        System.out.println("OK");
    }

    public int[] swapFL(int[] array) {
        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;
        return array;
    }

    public int firstUnique(int[] array) {
        int count = 0;
        for (int unique : array) {
            for (int i : array) {
                if (i == unique) {
                    count++;
                    if (count > 1) {
                        count = 0;
                        break;
                    }
                }
            }
            if (count == 1) {
                return unique;
            }
        }
        return -1;
    }

    public int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        left = mergeSort(left);
        right = mergeSort(right);
        int l=0, r=0;
        for (int i=0; i<array.length; i++) {
            if (l == left.length) {
                array[i] = right[r];
                r++;
                continue;
            }
            if (r == right.length) {
                array[i] = left[l];
                l++;
                continue;
            }
            if (left[l] < right[r]) {
                array[i] = left[l];
                l++;
            } else {
                array[i] = right[r];
                r++;
            }
        }
        return array;
    }
}
