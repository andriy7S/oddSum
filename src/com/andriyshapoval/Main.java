package com.andriyshapoval;

        /*Exercise 6-7.
        Write a recursive method named oddSum that takes a positive odd integer n and
        returns the sum of odd integers from 1 to n. Start with a base case, and use temporary
        variables to debug your solution. You might find it helpful to print the value of n each
        time oddSum is invoked.*/


public class Main {

    public static int oddSum(int n){
        if (n == 1) {
            return 1;
        } else {
            return (n % 2 != 1) ? oddSum(n - 1) : oddSum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        int n = 9;
        int sum = oddSum(n);
        System.out.println("The sum of odd numbers within range of 1 to " + n + " is " + sum);
    }
}
