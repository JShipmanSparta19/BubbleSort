package com.sparta.jas;

import java.util.Arrays;

public class BubbleSort {
    public void sort() {
        // write your code here
        int[] arrToSort = {3, 7, 6, 2, 5};
        System.out.println("Pass 0: " + Arrays.toString(arrToSort));
        BSortAlg sorting = new BSortAlg(arrToSort);
        sorting.doSort();
        System.out.println ("Final Result: " + Arrays.toString(arrToSort));
        System.out.print("After " + (sorting.passno - 1) + " passes");
    }
}
