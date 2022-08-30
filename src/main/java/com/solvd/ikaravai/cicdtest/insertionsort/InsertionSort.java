package com.solvd.ikaravai.cicdtest.insertionsort;

public class InsertionSort {

    public void insertionSort(int[] input) {
        int currValue;
        int lastLesserNumberIndex;
        for (int i = 0; i < input.length; i++) {
            currValue = input[i];
            lastLesserNumberIndex = i - 1;
            for (; lastLesserNumberIndex >= 0; lastLesserNumberIndex--) {
                if (currValue < input[lastLesserNumberIndex]) {
                    input[lastLesserNumberIndex + 1] = input[lastLesserNumberIndex];
                } else break;
            }
            input[lastLesserNumberIndex + 1] = currValue;
        }
    }
}
