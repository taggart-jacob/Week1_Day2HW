package com.example.week1day2_homework;

import java.util.*;

public class divisibles {
    //main method
    public static void main(String[] args) {
        //declares/initializes various integers, which will show all possible results when passed as an argument through checkDivis
        int first = 3;
        int second = 5;
        int third = 15;
        int fourth = 22;
        //calls the function to check divisibility for each int
        checkDivisibility(first);
        checkDivisibility(second);
        checkDivisibility(third);
        checkDivisibility(fourth);
    }
    //checkDivisibility method to print words based on divisiblity
    public static void checkDivisibility(int num){
        //if there's no remainder when divided by 3 and when divided by 5
        if ((num % 3 == 0) && (num % 5 == 0)){
            //print out "fizzbuzz"
            System.out.println("fizzbuzz");
        }
        //if there's no remainder when divided by 3 but there is when divided by 5
        if ((num % 3 == 0) && (num % 5 != 0)){
            //print out "fizz"
            System.out.println("fizz");
        }
        //if there's no remainder when divided by 5 but there is a remainder when divided by 3
        if ((num % 3 != 0) && (num % 5 == 0)){
            //print "buzz"
            System.out.println("buzz");
        }
        //if there's a remainder when divided by both 5 and 3
        if ((num % 3 !=0) && (num % 5 != 0)){
            //prints out that neither number is divisible by 3 or 5
            System.out.println("This number is not divisible by 3 or 5");
        }
    }
}
