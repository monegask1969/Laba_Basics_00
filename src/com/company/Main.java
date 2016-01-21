package com.company;

import java.util.Scanner;

import static com.company.ArrayInverter.invert;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of Your array: ");
        int size = scanner.nextInt();
        System.out.println("Enter numbers of Your array: ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        invert(array);
    }
}
