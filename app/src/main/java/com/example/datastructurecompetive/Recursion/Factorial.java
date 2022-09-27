package com.example.datastructurecompetive.Recursion;

//This question is to find factorial of two number
//This is the base question for recursion.
//output
//120
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        fact(5);
        System.out.print(fact(5)+" : ");
    }

    public static int fact(int n){
        //base condition
        if(n == 1){
            return 1;
        }

        int smallprob = fact(n-1);
        return n*smallprob;
    }
}
