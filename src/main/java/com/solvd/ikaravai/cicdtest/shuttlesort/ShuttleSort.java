package com.solvd.ikaravai.cicdtest.shuttlesort;

public class ShuttleSort {

    public void shuttleSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            if (input[i] < input[i - 1]) {
                swap(input, i, i - 1);
                for (int j = i - 1; j > 0; j--) {
                    if (input[j] < input[j - 1]) {
                        swap(input, j, j - 1);
                    } else break;
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
