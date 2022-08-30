package com.solvd.ikaravai.cicdtest.selectionsort;

public class SelectionSort {

    public void selectionSort(int[] input) {
        int posMin;
        for (int i = 0; i < input.length; i++) {
            posMin = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[posMin]) {
                    posMin = j;
                }
            }
            if (posMin != i) {
                swap(input, i, posMin);
            }
        }
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        array[firstIndex] = array[firstIndex] + array[secondIndex];
        array[secondIndex] = array[firstIndex] - array[secondIndex];
        array[firstIndex] = array[firstIndex] - array[secondIndex];
    }
}
