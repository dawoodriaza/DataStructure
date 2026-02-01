package com.ga.datastructures;

public class Exercise1 {

    public static void rotate(int[] arr,
                              int d,
                              int n) {
        d = d % n;

        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        rotate(arr1, 2, arr1.length);
        for (int x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println();

        int[] arr2 = {10, 20, 30, 40, 50, 60};
        rotate(arr2, 8, arr2.length);
        for (int x : arr2) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
