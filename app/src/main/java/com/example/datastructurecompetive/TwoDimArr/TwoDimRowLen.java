package com.example.datastructurecompetive.TwoDimArr;

//This code is to find len of each row of 2D Array.
//output
//length of row1: 3
//length of row2: 4
//length of row3: 1
public class TwoDimRowLen {
    public static void main(String[] args) {
        //create 2d array
        int[][] a = {{1, 2, 3}, {4, 5, 6, 9}, {7}};

        System.out.println("length of row1: "+a[0].length);
        System.out.println("length of row2: "+a[1].length);
        System.out.println("length of row3: "+a[2].length);

    }

}
