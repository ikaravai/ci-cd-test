package com.solvd.ikaravai.cicdtest.quicksort;

public class QuickSortPivotFirst {

    public void quickSort(int[] input, int low, int high) {
        if (low < high) {
            int pivot = partition(input, low, high);
            quickSort(input, low, pivot - 1);
            quickSort(input, pivot + 1, high);
        }
    }
//
    private int partition(int[] input, int low, int high) {
        // Pivot - we take first number
        int pivotTargetIndex = low;
        for (int j = low + 1; j <= high; j++) {
            if (input[j] < input[low]) {
                ++pivotTargetIndex;
                if (pivotTargetIndex != j) {
                    swap(input, pivotTargetIndex, j);
                }


            }
        }
        if (low != pivotTargetIndex) {
            swap(input, low, pivotTargetIndex);
        }
        return pivotTargetIndex;
    }

//    private void swap(int[] arr, int low, int pivot){
//        int tmp = arr[low];
//        arr[low] = arr[pivot];
//        arr[pivot] = tmp;
//    }
//         NOT THREAD SAFE LOL ???
    private void swap(int[] array, int firstIndex, int secondIndex) {
        array[firstIndex] = array[firstIndex] + array[secondIndex];
        array[secondIndex] = array[firstIndex] - array[secondIndex];
        array[firstIndex] = array[firstIndex] - array[secondIndex];
    }
}
