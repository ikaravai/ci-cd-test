package com.solvd.ikaravai.cicdtest.insertionsort;

public class InsertionSort {

    public void insertionSort(int[] input) {
        int currValue;
        int checkForLesserNumberIndex;
        for (int i = 0; i < input.length; i++) {
            currValue = input[i];
            checkForLesserNumberIndex = i - 1;
            for (; checkForLesserNumberIndex >= 0; checkForLesserNumberIndex--) {
                if (currValue < input[checkForLesserNumberIndex]) {
                    input[checkForLesserNumberIndex + 1] = input[checkForLesserNumberIndex];
                } else break;
            }
            input[checkForLesserNumberIndex + 1] = currValue;
        }
    }
}
