package com.example.strategy;

public class MergeSort implements Sort, Swap {

    private int[] v;

    public MergeSort() {
    }

    public MergeSort(int[] v) {
        this.v = v;
    }

    @Override
    public void sort(int low, int high) {
        if (low < high-1) {
            int pivot = (low + high) / 2;

            sort(low, pivot);
            sort(pivot, high);
            intercala(low, pivot, high);
        }
    }

    private void intercala(int low, int pivot, int high) {
        int i = low;
        int j = pivot;
        int k = 0;
        int w[] = new int[high-low];

        while (i < pivot && j < high) {
            if (v[i] >= v[j]) w[k++] = v[i++];
            else w[k++] = v[j++];
        }
        while (i < pivot) w[k++] = v[i++];
        while (j < high) w[k++] = v[j++];

        for (i = low; i < high; i++) v[i] = w[i - low]; 
    }

    @Override
    public void swap(int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    public int[] getV() {
        return v;
    }

    public void setV(int[] v) {
        this.v = v;
    }   

}
