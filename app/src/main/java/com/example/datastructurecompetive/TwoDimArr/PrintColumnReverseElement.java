package com.example.datastructurecompetive.TwoDimArr;

//This program is to traverse column-wise reverse element.
//   1 2  3  4
//   5 6  7  8
//   9 10 11 12
//  13 14 15 16

//output
//13 9 5 1 14 10 6 2 15 11 7 3 16 12 8 4

public class PrintColumnReverseElement {
    public static void main(String[] args) {
        int max = 4;
        int[][] arr = {{1, 2, 3,4}, {5, 6,7,8}, {9,10,11,12},{13,14,15,16}};
        printColRevEle(arr,max);
    }

    public static void printColRevEle(int[][]arr , int max){
        for(int i = 0 ; i<max; i++){
            for(int j = arr.length - 1 ; j >= 0; j--){
                System.out.print(arr[j][i]+" ");
            }
        }
    }
}
