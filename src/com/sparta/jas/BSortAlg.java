package com.sparta.jas;

import java.util.Arrays;

class BSortAlg {
    private int[] BSortArr;

    BSortAlg(int[] arr) {
        BSortArr = arr;
    }

    private String change;

    int passno = 0;

    void doSort() {
        do {
            change = "n";
            passno++;

            for (int i = 0; i < BSortArr.length - 1; i++) {
                if (BSortArr[i] > BSortArr[i + 1]) {
                    int temp = BSortArr[i];
                    BSortArr[i] = BSortArr[i + 1];
                    BSortArr[i + 1] = temp;
                    change = "y";
                }
            }
            if(change.equals("y")) {
                System.out.println("Pass " + passno + ": " + Arrays.toString(BSortArr));
            }
        } while (change.equals("y"));
    }
}
