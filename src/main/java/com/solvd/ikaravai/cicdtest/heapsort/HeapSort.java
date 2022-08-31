package com.solvd.ikaravai.cicdtest.heapsort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class HeapSort {

    public void heapSort(int[] input) {
        // Building Max Heap Tree
        for (int i = input.length / 2 - 1; i >= 0; i--) {
            heapify(input, input.length, i);
        }
        for (int i = input.length - 1; i > 0; i--) {
            log.info("Received Max Heap : {}", Arrays.toString(input));
            swap(input, 0, i); // Move root (MAX) to the end
            log.info("Moved max value to the right : {}", Arrays.toString(input));
            heapify(input, i, 0); // Rebuild Max Heap tree for the remaining elements
        }
    }

    private void heapify(int[] input, int arrayLength, int i) { // Change var names
        int maxElementIndex = i; // init as root aka supposed to be the largest
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;

        if (leftChildIndex < arrayLength && input[leftChildIndex] > input[maxElementIndex]) {
            maxElementIndex = leftChildIndex; // if left child > root -> SWAP
        }
        if (rightChildIndex < arrayLength && input[rightChildIndex] > input[maxElementIndex]) {
            maxElementIndex = rightChildIndex; // if right child > root -> SWAP
        }
        if (maxElementIndex != i) {
            swap(input, maxElementIndex, i);
            heapify(input, arrayLength, maxElementIndex); // repeat until largest element in da heap is found
        }
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        array[firstIndex] = array[firstIndex] + array[secondIndex];
        array[secondIndex] = array[firstIndex] - array[secondIndex];
        array[firstIndex] = array[firstIndex] - array[secondIndex];
    }
}
