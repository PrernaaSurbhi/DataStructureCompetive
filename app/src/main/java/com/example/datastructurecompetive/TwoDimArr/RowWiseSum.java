package com.example.datastructurecompetive.TwoDimArr;

// This program is to print row wise sum of 2d array
public class RowWiseSum {
    public static void main(String[] args) {
        int max = 3;
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0 ;
        findRowWiseSum(arr,max,sum);
    }

    public static void findRowWiseSum(int[][] arr, int max, int sum){
        //traversing rowwise to find sum of each row
        for(int i = 0 ; i < max; i++){
            for(int j = 0 ; j < max; j++){
                sum = sum + arr[i][j];
            }
            System.out.println("row sum is : "+sum);
            sum = 0;
        }
    }
}
