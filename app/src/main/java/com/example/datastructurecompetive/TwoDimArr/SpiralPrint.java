package com.example.datastructurecompetive.TwoDimArr;

//This program is to print spiral in 2D array
//printed first row and last column of the array.
//first row , last column , last row .
//out  1 2 3 6 9 8 7    -
public class SpiralPrint {
    public static void main(String[] args) {
        int max = 3;
        int[][] arr = {{1, 2, 3,}, {4,5, 6}, {7,8,9}};
        spiralPrint(arr,max);
    }

    public static void spiralPrint(int[][] arr,int max){
        int n = arr.length -1;
             for(int i = 0;i< max;i++){
                 for(int j = 0 ; j< max; j++){
                     if(i == 0){
                         System.out.print(arr[i][j] + " ");
                     }
                     if((i == n) && (j == n-1 )){
                         for(int k = n-1; k>= 0; k--){
                             System.out.print(arr[i][k] + " ");
                         }
                     }
                     if((i == 1) && (j == n)){
                         for(int k = 1; k< max ;k++){
                             System.out.print(arr[k][n] + " ");
                         }
                     }

//                     if((i == 1) && (j == 0 )){
//                         for(int k = 0; k<n; k++){
//                             System.out.print(arr[i][k] + " ");
//                         }
//                     }

                 }

             }
    }
}
