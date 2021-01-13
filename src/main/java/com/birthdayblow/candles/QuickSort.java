package com.birthdayblow.candles;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] arr, int start, int end){
        if (start < end) {
            int pi = partition(arr, start, end);
            sort(arr, start, pi -1 );
            sort(arr, pi + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i, j;
        j = -1;
        for (i = 0; i < end; i++) {
            if (arr[i] <= pivot) {
                j++;
                swap(arr, j, i);
            }
        }
        int temp = arr[j + 1];
        arr[j+1] = pivot;
        arr[end] = temp;
        return ++j;
    }


    private static void swap(int[] arr, int index1, int index2) throws IllegalStateException{
        if (index1 >= arr.length || index2 >= arr.length) {
            throw new IllegalStateException("Invalid index");
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
