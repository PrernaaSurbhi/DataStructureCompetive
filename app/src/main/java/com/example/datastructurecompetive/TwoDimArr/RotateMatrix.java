package com.example.datastructurecompetive.TwoDimArr;

//This program is to rotate a matrix by 90" degree
///Input will be
//   1, 2,  3,
//    4, 5,  6,
//   7, 8,  9

//out will   7,4,1
//           8,5,2
//           9,6,3
//This can be done by transpose a matrix from row to column , and reverse the column element of matrix

public class RotateMatrix {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        int[][] arr = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};

        rotateMatrix(arr,n, m);
    }
    public static void rotateMatrix(int[][] arr, int n , int m){
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");

            }
            System.out.println();//new line
        }
    }

}
