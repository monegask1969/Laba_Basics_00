package com.company;

import java.util.Scanner;

import static com.company.ArrayInverter.invert;
import static com.company.Merge.merge;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of Your 1 array: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter numbers of Your 1 array: ");
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter length of Your 2 array: ");
        int size2 = scanner.nextInt();
        System.out.println("Enter numbers of Your 2 array: ");
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }
        merge(array1,array2);
        // invert(array1);       // инвертирование массива


    }
}
