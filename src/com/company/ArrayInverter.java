package com.company;

/**
 * Created by Max on 21.01.2016.
 */
public class ArrayInverter {
    public static void invert(int[] arr) {
        for (int k =arr.length / 2; k != -1 ; k--) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
        System.out.println("Here Your array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + arr[i] + "]");
        }
    }

}
