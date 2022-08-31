package com.solvd.ikaravai.cicdtest;

import com.solvd.ikaravai.cicdtest.bubblesort.BubbleSort;
import com.solvd.ikaravai.cicdtest.insertionsort.InsertionSort;
import com.solvd.ikaravai.cicdtest.insertionsort.InsertionSortRecursive;
import com.solvd.ikaravai.cicdtest.mergesort.MergeSort;
import com.solvd.ikaravai.cicdtest.mergesort.MergeSortJava;
import com.solvd.ikaravai.cicdtest.quicksort.QuickSortPivotFirst;
import com.solvd.ikaravai.cicdtest.selectionsort.SelectionSort;
import com.solvd.ikaravai.cicdtest.shuttlesort.ShuttleSort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class CiCdTestApplication {

    @PostConstruct
    public void method() {
        log.info("--- App constructed ---");
    }

    public static void main(String[] args) {
        log.info("--- App execution starting ---");
        SpringApplication.run(CiCdTestApplication.class, args);
    }

    @Bean
    public CommandLineRunner test() {
        return (args) -> {
            // Scuffed merge freestyle
            MergeSort myScuffedSortAlg = new MergeSort();
            int[] myInput = {112, 540, 778, 760, 217, 601, 918, 513, 83, 767, 468, 279, 445, 854, 161, 320, 552, 97, 442, 527};
            log.info("--- Scuffed merge ---");
            log.info(Arrays.toString(myScuffedSortAlg.mergeSort(myInput, myInput.length)));
            // Java merge ok
            int[] anotherInput = {65, 234, 803, 83, 981, 412, 128, 779, 967, 769, 543, 501, 631, 811, 906, 971, 163, 88, 358, 727};
            MergeSortJava.mergeSort(anotherInput, anotherInput.length);
            log.info("--- Ok merge ---");
            log.info(Arrays.toString(anotherInput));
            // Bubble sort
            BubbleSort bubbleSort = new BubbleSort();
            int[] bubbleInput = {928, 31, 942, 84, 1, 52, 783, 52, 138, 52, 436, 120, 440, 186, 54, 738, 129, 652, 54, 944};
            bubbleSort.bubbleSort(bubbleInput);
            log.info("--- Bubble sort ---");
            log.info(Arrays.toString(bubbleInput));
            // Selection Sort
            SelectionSort selectionSort = new SelectionSort();
            int[] selectionInput = {840, 263, 427, 963, 895, 813, 292, 596, 449, 302, 268, 717, 569, 34, 966, 128, 991, 658, 609, 615};
            selectionSort.selectionSort(selectionInput);
            log.info("--- Selection sort ---");
            log.info(Arrays.toString(selectionInput));
            // Insertion sort
            InsertionSort insertionSort = new InsertionSort();
            int[] insertionInput = {512, 14, 536, 659, 278, 836, 942, 542, 396, 133, 184, 125, 265, 23, 595, 950, 716, 835, 177, 794};
            insertionSort.insertionSort(insertionInput);
            log.info("--- Insertion sort ---");
            log.info(Arrays.toString(insertionInput));
            // Insertion sort recursive
            InsertionSortRecursive insertionSortRecursive = new InsertionSortRecursive();
            int[] insertionRecursiveInput = {512, 14, 536, 659, 278, 836, 942, 542, 396, 133, 184, 125, 265, 23, 595, 950, 716, 835, 177, 794};
            insertionSortRecursive.insertionSortRecursive(insertionRecursiveInput, insertionRecursiveInput.length);
            log.info("--- Insertion Recursive sort ---");
            log.info(Arrays.toString(insertionRecursiveInput));
            // Shuttle sort
            ShuttleSort shuttleSort = new ShuttleSort();
            int[] shuttleSortInput = {14, 892, 146, 111, 705, 343, 747, 768, 662, 245, 41, 101, 390, 431, 958, 928, 29, 413, 335, 84};
            shuttleSort.shuttleSort(shuttleSortInput);
            log.info("--- Shuttle sort ---");
            log.info(Arrays.toString(shuttleSortInput));
            // Quick sort
            QuickSortPivotFirst quickSortPivotFirst = new QuickSortPivotFirst();
            int[] quickSortInput = {291, 632, 821, 447, 749, 67, 245, 304, 462, 879, 290, 42, 274, 133, 641, 891, 242, 417, 734, 603};
            quickSortPivotFirst.quickSort(quickSortInput, 0, quickSortInput.length - 1);
            log.info("--- Quick sort ---");
            log.info(Arrays.toString(quickSortInput));
            // Quick sort 2
            QuickSortPivotFirst quickSortPivotFirstTwo = new QuickSortPivotFirst();
            int[] quickSortInputTwo = {40, 20, 30, 10};
            quickSortPivotFirstTwo.quickSort(quickSortInputTwo, 0, quickSortInputTwo.length - 1);
            log.info("--- Quick sort ---");
            log.info(Arrays.toString(quickSortInputTwo));
        };
    }
}
