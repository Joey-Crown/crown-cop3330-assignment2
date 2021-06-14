/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex38;

import java.util.ArrayList;
import java.util.Scanner;

/* Exercise 38 - Filtering Values
Sometimes input you collect will need to be filtered down. Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces. Have the program print out a new list
containing only the even numbers.

Example Output

Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.

Constraints

Convert the input to an array. Many languages can easily convert strings to arrays with a built-in function that splits
apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the old array and
returns the new array.

Challenge

Instead of prompting for numbers, read in lines from any text file and print out only the even-numbered lines.
 */
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input length and split string into array
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String[] listOfNumbers = input.nextLine().split(" ");

        // use filterEvenNumbers to get new array
        ArrayList<Integer> evenNumbers = filterEvenNumbers(listOfNumbers);

        //output
        System.out.print("The even numbers are ");
        for (int i = 0; i < evenNumbers.size(); i++) {
            if (i == evenNumbers.size() - 1) {
                System.out.print(evenNumbers.get(i) + ".");
            } else {
                System.out.print(evenNumbers.get(i) + " ");
            }
        }
    }

    public static ArrayList<Integer> filterEvenNumbers (String[] arr) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        // loop goes through array and parses integers, then adds even numbers to new array
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) % 2 == 0) {
                    newArray.add(Integer.parseInt(arr[i]));
            }
        }
        return newArray;
    }
}
