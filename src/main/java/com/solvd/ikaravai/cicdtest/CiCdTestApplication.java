package com.solvd.ikaravai.cicdtest;

import com.solvd.ikaravai.cicdtest.mergesort.MergeSort;
import com.solvd.ikaravai.cicdtest.mergesort.MergeSortJava;
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
            MergeSort myScuffedSortAlg = new MergeSort();
            int[] myInput = {112, 540, 778, 760, 217, 601, 918, 513, 83, 767, 468, 279, 445, 854, 161, 320, 552, 97, 442, 527};
            log.info(Arrays.toString(myScuffedSortAlg.mergeSort(myInput, myInput.length)));

            int[] anotherInput = {65, 234, 803, 83, 981, 412, 128, 779, 967, 769, 543, 501, 631, 811, 906, 971, 163, 88, 358, 727};
            MergeSortJava.mergeSort(anotherInput, anotherInput.length);
            log.info(Arrays.toString(anotherInput));
        };
    }
}
