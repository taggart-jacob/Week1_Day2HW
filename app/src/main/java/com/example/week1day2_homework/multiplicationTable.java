package com.example.week1day2_homework;

import java.util.*;

public class multiplicationTable {
    //main method calls the printTables() method
    public static void main(String[] args) {
        printTables();
    }
    //printTables() creates a multiplication table from 1-10
    public static void printTables(){
        //declares a 10x10 table via a multidimensional array
        int[][] mult = new int[10][10];
        //outer for loop to deal with rows
        for (int i = 0; i < 10; i++){
            //inner for loop to deal with columns
            for (int j = 0; j < 10; j++){
                //equation to ensure each spot populated provides a correct value
                mult[i][j] = (i+1) * (j + 1);
                //Formats the array as a string and outputs it
                System.out.printf("%s", mult[i][j]);
            }
            //creates a new line for the next row's values
            System.out.println();
        }
    }
}
