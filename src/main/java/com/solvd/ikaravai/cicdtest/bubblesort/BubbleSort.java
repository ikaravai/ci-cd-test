package com.solvd.ikaravai.cicdtest.bubblesort;

public class BubbleSort {

    public void bubbleSort(int[] input) {
        boolean needIterations = true;
        while (needIterations) {
            needIterations = false;
            for (int i = 1; i < input.length; i++) {
                if (input[i] < input[i - 1]) {
                    swap(input, i-1, i);
                    needIterations = true;
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
