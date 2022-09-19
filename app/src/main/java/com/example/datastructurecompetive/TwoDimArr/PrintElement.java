package com.example.datastructurecompetive.TwoDimArr;
//This prg is to print all element of 2d array in java.
public class PrintElement {
    public static void main(String[] args) {
        //create 2d array
        int[][] a = {{1, 2, 3,4}, { 5, 6,7,8}, {9,10,11,12}};
        printEachElement(a);

    }

    public static  void printEachElement(int[][] a){
        for(int[] list :a){
            for(int e:list){
                System.out.println(e);
            }
        }
    }



}
