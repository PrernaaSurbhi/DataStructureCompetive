package com.example.datastructurecompetive.Array;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {9,3,4,6,8};
        int[] brr = {9,8,8};
        System.out.println("max of array is "+printMax(arr));
           System.out.println("min of array is "+printMin(brr));
    }

    public static int printMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int printMin(int[] brr){
        int min = Integer.MAX_VALUE;

        for (int j : brr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
