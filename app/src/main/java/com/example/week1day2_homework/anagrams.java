package com.example.week1day2_homework;

import java.util.*;

public class anagrams {
    //main method
    public static void main(String[] args) {
        //declares and initializes 2 words that are an anagram with each other and one that is not
        String one = "restful";
        String two = "fluster";
        String three = "mister";
        //prints out the result of the checkAnagrams()
        System.out.println(checkAnagrams(one, two));
        System.out.println(checkAnagrams(one, three));
        System.out.println(checkAnagrams(two, three));
    }
    //checks to ensure the two arguments are or are not anagrams
    public static boolean checkAnagrams(String word1, String word2){
        //converts both arguments to charArray
        char[] charArray = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        //sorts charArrays to make the first element the lowest alphabetical value (i.e. "a", "b", "c"...")
        Arrays.sort(charArray);
        Arrays.sort(charArray2);
        //after sorted, if the lengths are equal and the arrays are equivalent to each other
        if ((charArray.length == charArray2.length) && (Arrays.equals(charArray, charArray2))){
            //return true
            return true;
        }   else {
            //false
            return false;
        }
    }
}
