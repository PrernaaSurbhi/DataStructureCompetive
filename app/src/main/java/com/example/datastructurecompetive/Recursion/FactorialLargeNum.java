package com.example.datastructurecompetive.Recursion;

import java.math.BigInteger;

//This program is to find factorial of larger number ,
// As basic data type not able to handle big int factorial value.
//output
//factorial of 50 is:30414093201713378043612608166064768844377641568960512000000000000

public class FactorialLargeNum {
    public static void main(String[] args) {
        int n = 50;
        //initializing the big integer value by 1
        BigInteger factorial = BigInteger.ONE;
        factorialBig(n,factorial);
    }

    public static void factorialBig(int n, BigInteger factorial){
        for(int i = n; i>=2; i--){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("factorial of 50 is:"+factorial);
    }

}
