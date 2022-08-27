package test.tech.javacore;

import java.util.*;
public class qs {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = {7, -5, 3, 2, 1, 0, 45};
        int n = nums.length;
        quicksort(nums, 0, n - 1);
        System.out.println("Sorted Array: ");
        output(nums, n);
    }
//    (a, b, c) swap to ( ) with j as pivot
    static void swap1(int[] arr, int i, int j) {
        int hold = arr[i];
        arr[i] = arr[j];
        arr[j] = hold;
    }

    static int partition1(int[] arr, int first, int last) {
        int pivot = arr[last];
        int j = first;
        for (int i = first; i < last; i++) {
            if (arr[i] < pivot) {
                swap1(arr, i, j);
                j++;
            }
        }
        swap1(arr, j, last);
        return j;
    }
    static void quicksort(int[] arr, int lo, int hi){
        if(lo < hi){
            int pivot = partition1(arr, lo, hi);
            quicksort(arr, lo, pivot - 1);
            quicksort(arr, pivot + 1, hi);
        }
    }
    static void output(int arr[], int count){
        for(int i = 0; i < count; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
