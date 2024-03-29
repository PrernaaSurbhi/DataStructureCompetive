package com.example.datastructurecompetive.TwoDimArr;

//This program is to print row and column major matrix.
//output
//1 2 3 4 5 6 7 8 9 i am going to print the column major below
//1 4 7 2 5 8 3 6 9.
//this program is to find target element at matrix.
//output
//element found
public class PrintRowColWIseElement {
    public static void main(String[] args) {
        int max = 3;
        int[][] arr = {{1, 2, 3} , {4, 5, 6} , {7, 8, 9}};
        rowMajor(arr,max);
        System.out.println("i am going to print the column major below");
        columnMajor(arr,max);
        searchElement(arr,max,2);

    }

    public static void rowMajor(int[][] arr, int max){
        for(int i = 0; i < max ; i++) {
            for(int j = 0; j < max ; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void columnMajor(int[][] arr, int max){
        for(int i = 0 ; i<max; i++){
            for(int j = 0 ; j< max; j++){
                System.out.print(arr[j][i]+" ");
            }
        }
    }

    public static boolean searchElement(int[][] arr, int max,int target){
        for(int i = 0; i<max; i++){
            for(int j= 0 ; j< max;j++){
                if(arr[i][j] == target){
                    System.out.println("element found: ");
                    return true;
                }
            }
        }

        return false;
    }


}
