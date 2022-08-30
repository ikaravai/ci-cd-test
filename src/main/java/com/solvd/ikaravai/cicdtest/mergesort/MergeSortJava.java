package com.solvd.ikaravai.cicdtest.mergesort;

public class MergeSortJava {

    public static void mergeSort(int[] input, int length) {
        if (length < 2) {
            return;
        }
        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];
        for (int i = 0; i < middle; i++) {
            left[i] = input[i];
        }
        for (int i = middle; i < length; i++) {
            right[i - middle] = input[i];
        }

        mergeSort(left, middle);
        mergeSort(right, length - middle);

        merge(input, left, right, middle, length - middle);
    }

    public static void merge(int[] input, int[] left, int[] right, int leftLength, int rightLength) {
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                input[k++] = left[i++];
            } else {
                input[k++] = right[j++];
            }
        }
        while (i < leftLength) {
            input[k++] = left[i++];
        }
        while (j < rightLength) {
            input[k++] = right[j++];
        }
    }
}
