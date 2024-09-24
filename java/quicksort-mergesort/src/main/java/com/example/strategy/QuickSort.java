package com.example.strategy;


public class QuickSort implements Sort, Swap {
    
    // Fazer uma classe Vetor, que nela tem uma lógica e para verificar qual a melhor opção de sort de acordo com os valores nela

    private int[] v;

    public QuickSort(int[] v) {
        this.v = v;
    }

    @Override
    public void sort(int low, int high) {
        int i = low;
        int j = high;
        int pivot = v[(low + high) / 2];

        while (i <= j) {
            while (i < high && v[i] > pivot) i++;
            while (j > low && v[j] < pivot) j--;
            
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j) sort(low, j);
        if (i < high) sort(i, high);
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
