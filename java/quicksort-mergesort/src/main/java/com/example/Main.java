package com.example;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.example.strategy.QuickSort;
import com.example.strategy.Sorter;

public class Main {
    public static void main(String[] args) {
        testSearch();
    }
    
    
    static void testQuick() {
        int[] vetor = { 152, 389, 75, 218, 301, 47, 377, 99, 215, 367 };
        
        QuickSort quickSort = new QuickSort(vetor);
        Sorter sorter = new Sorter(quickSort);
        sorter.sort(0, vetor.length-1);
        
        System.out.print("[" + Arrays.stream(quickSort.getV())
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" ")) + "]");
    }

    static void testSearch() {
        int[] vetor = { 15, 72, 145, 198, 205, 267, 310, 365, 400, 417 };
        
        BinarySearch binary = new BinarySearch(vetor);
        int result = binary.search(145, 0, vetor.length-1);
        System.out.println(result);
    }
}