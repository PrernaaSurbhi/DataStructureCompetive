package com.example.datastructurecompetive.Recursion;
//This program is to print number from n to 1 using recursion.
public class PrintNumber {
    public static void main(String[] args) {
        int n = 8;
        printNum(n);
    }

    public static void printNum(int n){
        //base condition
        if( n == 0){
            return;
        }

        System.out.print(n+" ");
        printNum(n-1);
    }
}
