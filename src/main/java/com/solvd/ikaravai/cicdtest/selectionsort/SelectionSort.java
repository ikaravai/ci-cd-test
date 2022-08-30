package com.solvd.ikaravai.cicdtest.selectionsort;

public class SelectionSort {

    public void selectionSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if (input[j] < input[i]) {
                    swap(input, i, j);
                }
            }
        }
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        array[firstIndex] = array[firstIndex] + array[secondIndex];
        array[secondIndex] = array[firstIndex] - array[secondIndex];
        array[firstIndex] = array[firstIndex] - array[secondIndex];
    }
}
