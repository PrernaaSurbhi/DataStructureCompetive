package com.example.datastructurecompetive.Array;

//This code is to Merge array with conditions
//output 1,2,2,3,5,6
public class MergeWithCond {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] brr = {2,5,6};
        int m = 3;
        int n = 3;
        int[] crr = new int[n + m];
        mergeEmptyArray(arr, m, brr, n, crr);
    }

    public static void mergeEmptyArray(int[] arr, int m, int[] brr, int n, int[] crr) {
        if (m == 0) {
            for (int x : brr) {
                System.out.print(" when m is 0 :" + x + "  ..");
            }
        }

        if (n == 0) {
            for (int y : arr) {
                System.out.print(" when n is 0 :" + y + "  ..");
            }
        }

        if( m !=0 && n!= 0){
            mergeArray(arr, m, brr, n, crr);
            print(crr);
        }
    }

    public static void mergeArray(int[] arr, int m, int[] brr, int n, int[] crr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while ( i < n && j < m) {
            if (arr[i] == 0) {
                crr[k++] = brr[j++];
            }
            if (brr[j] == 0) {
                crr[k++] = arr[i++];
            }

            if ((arr[i] < brr[j]) && (arr[i] != 0) && (brr[j] != 0)) {
                crr[k++] = arr[i++];
            } else if (brr[j] != 0) {
                crr[k++] = brr[j++];
            }
        }

        //copy longest array element to arr3 array
        while (i < n && (arr[i] != 0)) {
            crr[k++] = arr[i++];
        }
        while (j < m && (brr[j] != 0)) {
            crr[k++] = brr[j++];
        }
    }

    public static void print(int[] crr) {
        for (int e : crr) {
            System.out.print(e + " ");
        }
    }

}
