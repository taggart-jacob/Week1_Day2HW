package com.example.week1day2_homework;

import java.util.*;

public class palindrome {
    //main method
    public static void main(String[] args) {
        //declaring a word that is a palindrome
        String palindrome = "hannah";
        //declaring a non-palindrome
        String nopal = "john";
        //prints out the result of the boolean returned from checkPalindrome() depending on the arg passed
        System.out.println(checkPalindrome(palindrome));
        System.out.println(checkPalindrome(nopal));
    }
    //checkPalindrome() method
    public static boolean checkPalindrome(String word) {
        //converts the string argument into a charArray
        char[] charArray = word.toCharArray();
        //declares/initializes a new empty charArray set to the same memory space as the other charArray
        char[] charArray2 = new char[charArray.length];
        //for loop to run through the elements of the first charArray and set each element to the other charArray's opposite position
        for (int i = 0; i < charArray.length; i++){
            //this equation flips the first charArray around and assigns it to the empty charArray
            charArray2[charArray2.length - (i+1)] = charArray[i];
        }
        //if the first charArray is equal to itself backwards (charArray2), then
        if (Arrays.equals(charArray, charArray2)){
            //returns as true
            return true;
            //else
        } else {
            //return false
            return false;
        }
    }

}
