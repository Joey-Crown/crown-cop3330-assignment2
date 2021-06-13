/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex24;
/* Exercise 24 - Anagram Checker
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt
for both input strings and display the output as shown in the example that follows.

Example Output

Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

Constraints

Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or
false. Invoke this function from your main program.
Check that both words are the same length.

Challenge

Complete this program without using built-in language features. Use selection or repetition logic instead and develop
your own algorithm.
*/
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        // input first string
        System.out.print("Enter the first string: ");
        String word1 = input.nextLine();

        // input second string
        System.out.print("Enter the second string: ");
        String word2 = input.nextLine();

       boolean result = isAnagram(word1, word2);

       //output
        if (result) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }
    }

    public static boolean isAnagram (String word1, String word2) {

        // convert strings to character arrays
        char[] string1 = word1.toCharArray();
        char[] string2 = word2.toCharArray();

        // sort character arrays
        Arrays.sort(string1);
        Arrays.sort(string2);

        // compares sorted words and returns boolean value
        return Arrays.equals(string1, string2);
    }
}
