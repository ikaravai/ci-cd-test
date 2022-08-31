package com.solvd.ikaravai.cicdtest.insertionsort;

public class InsertionSortRecursive {

    public void insertionSortRecursive(int[] input, int checkingIndexes) {
        if (checkingIndexes < 2) {
            return;
        }

        insertionSortRecursive(input, checkingIndexes -1);

        int currentValue = input[checkingIndexes - 1];
        int currentSortedIndex = checkingIndexes - 2;
        while (currentSortedIndex >= 0 && input[currentSortedIndex] > currentValue) {
            input[currentSortedIndex + 1] = input[currentSortedIndex];
            currentSortedIndex--;
        }
        input[currentSortedIndex + 1] = currentValue;
    }

}
