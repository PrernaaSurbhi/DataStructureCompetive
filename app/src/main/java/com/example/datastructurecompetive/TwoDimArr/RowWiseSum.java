package com.example.datastructurecompetive.TwoDimArr;

// This program is to print row wise sum of 2d array
//output
// row sum is : 6
//row sum is : 15
//row sum is : 24

// This program is also to print largest row sum.
// largest row sum is 24.

public class RowWiseSum {
    public static void main(String[] args) {
        int max = 3;
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0 ;
        findRowWiseSum(arr,max,sum);
    }

    public static int findRowWiseSum(int[][] arr, int max, int sum){
        //traversing row-wise to find sum of each row
        int largestRowSum = 0;
        for(int i = 0 ; i < max; i++){
            for(int j = 0 ; j < max; j++){
                sum = sum + arr[i][j];
            }
            System.out.println("row sum is : "+sum);
            if(sum >= largestRowSum) {
                largestRowSum = sum;
            }
            sum = 0;
        }
        System.out.println("largest row sum is: "+largestRowSum);
        return largestRowSum;

    }
}
