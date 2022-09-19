package com.example.datastructurecompetive.TwoDimArr;

//This program is to print wave,
//even index - top to bottom
//odd index - bottom to up.
//It will be column wise traversal
//    1, 2,  3,  4
//    5, 6,  7,   8
//    9, 10, 11, 12
//    13, 14, 15, 16
//    17, 18, 19, 20

//output
// 1 5 9 13 17 18 14 10 6 2 3 7 11 15 19 20 16 12 8 4

public class PrintWave {
    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        int[][] arr = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                       { 13, 14, 15, 16 },
                       { 17, 18, 19, 20 } };

        printWave(arr,m,n);
    }

    public static void printWave(int[][] arr , int m, int n){
        // Loop to traverse matrix
        for (int j = 0; j < n; j++) {
            //even column
            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            //odd number of column
            else {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
