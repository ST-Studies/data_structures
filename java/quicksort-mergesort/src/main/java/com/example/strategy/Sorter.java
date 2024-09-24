package com.example.strategy;

public class Sorter {
    private Sort sortingStrategy;
    
    public Sorter() {
    }

    public Sorter(Sort sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int low, int high) {
        if (sortingStrategy != null) {
            sortingStrategy.sort(low, high);
        } else {
            throw new IllegalStateException("Sorting strategy not set.");
        }
    }

    public Sort getSortingStrategy() {
        return sortingStrategy;
    }
    
    public void setSortingStrategy(Sort sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
}
