package com.solvd.ikaravai.cicdtest.mergesort;

public class MergeSort {

    private int[] merge(int[] a, int[] b) {
        if (a.length < 1) {
            return b;
        }
        if (b.length < 1) {
            return a;
        }
        if (a[0] < b[0]) {
            int[] c = new int[a.length - 1];
            System.arraycopy(a, 1, c, 0, a.length - 1);
            int[] d = new int[a.length + b.length];
            d[0] = a[0];
            System.arraycopy(merge(c, b), 0, d, 1, d.length - 1);
            return d;
        } else {
            int[] e = new int[b.length - 1];
            System.arraycopy(b, 1, e, 0, b.length - 1);
            int[] f = new int[a.length + b.length];
            f[0] = b[0];
            System.arraycopy(merge(e, a), 0, f, 1, f.length - 1);
            return f;
        }
    }

    public int[] mergeSort(int[] input, int length) {
        if (length == 1) {
            return input;
        }
        int middle = (int) Math.floor(length / 2);
        int[] leftHalf = new int[middle];
        System.arraycopy(input, 0, leftHalf, 0, middle);
        int[] rightHalf = new int[length - middle];
        System.arraycopy(input, middle, rightHalf, 0, length - middle);
        return merge(mergeSort(leftHalf, middle), mergeSort(rightHalf, length - middle));
    }
}
