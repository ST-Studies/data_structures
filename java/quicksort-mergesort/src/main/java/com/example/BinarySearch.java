package com.example;

public class BinarySearch {
    
    private int[] v;

    public BinarySearch() {
    }

    public BinarySearch(int[] v) {
        this.v = v;
    }

    public int search(int x, int low, int high) {
        if (low <= high) {
            int middle = (low + high) / 2;
            int pivot = v[middle];

            if (x < pivot) return search(x, low, middle - 1);
            else if (x > pivot) return search(x, middle + 1, high);
            return pivot;
        }
        return -1;
    } 
}
