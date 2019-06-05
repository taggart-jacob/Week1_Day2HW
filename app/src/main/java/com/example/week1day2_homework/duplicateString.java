package com.example.week1day2_homework;

import java.util.*;

    public class duplicateString {
        //main function
        public static void main(String[] args) {
            //creates a list of strings
            List<String> words = new ArrayList<>();
            //adds unique words with a couple duplicates
            words.add("hello");
            words.add("great");
            words.add("hey");
            words.add("no");
            words.add("hello");
            words.add("hello");
            words.add("no");
            //function for checking for duplicates using the words list as an argument
            findDuplicates(words);
        }

        public static void findDuplicates(List<String> words) {
            List<String> duplicates = new ArrayList<>();
            //for loop to run through the first value to the final value
            for (int i = 0; i < words.size(); i++) {
                //another for loop to ensure that the outer loop's counter sticks at the first value when comparing the inner loop's value
                for (int n = i+1; n < words.size(); n++) {
                    //if the first word equals the next word incremented one at a time
                    if (words.get(i).equals(words.get(n))) {
                        //if there are multiple iterations of the duplicate word
                        if (duplicates.contains(words.get(i))) {
                            //then the inner for loop breaks
                            break;
                            //otherwise,
                        } else {
                            //gets the word that is a duplicate (no matter how many times) and stores it to a string
                            String s = words.get(i);
                            duplicates.add(s);
                        }
                    }
                }
            }
            //prints out the starting phrase
            System.out.println("All duplicate words:");
            //for each element of the duplicates array
            for (String a: duplicates){
                //prints out the element and goes to another line
                System.out.println(a);
            }
        }
    }