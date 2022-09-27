package com.example.datastructurecompetive.Recursion;
//Given an integer n, return the number of trailing zeroes in factorial of n
//if trailing exist then return 1 , otherwise return 0.
//logic used here is modVal = n % 10   && number = n/10;
// output
//trailing zero is : 2

public class FactorialTrailingZero {
    public static void main(String[] args) {
        int n = 10;
        facto(n);
        findTrailing(facto(n));
        System.out.println("trailing zero is : "+findTrailing(facto(n)));
    }

    public static int facto(int n){
        //base condition
        if(n == 1){
            return 1;
        }
        int smallprob = facto(n-1);
        return n*smallprob;
    }

    public static int findTrailing(int n){
        int count  = 0;
        int modVal = 0;
        int number;
        //base condition
        if(modVal != 0){
            return 0;
        }
        while(n!= 0){
            modVal = n % 10;
            number = n/10;
            if(modVal == 0){
                count++;
            }
            n= number;
        }
        return count;
    }
}
