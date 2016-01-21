package com.company;

/**
 * Created by Max on 21.01.2016.
 */
public class Merge {
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        while (fstIndex + sndIndex != result.length-1) {
            if (fst[fstIndex] < snd[sndIndex]) {
                result[fstIndex + sndIndex] = fst[fstIndex++];
            } else {
                result[fstIndex + sndIndex] = snd[sndIndex++];
            }
        }

        System.out.println("Here Your result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.println("[" + result[i] + "]");
        }
        return result;
    }

}
