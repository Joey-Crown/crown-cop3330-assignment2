/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex37;

import java.util.ArrayList;
import java.util.Scanner;

/* Exercise 37 - Password Generator
Coming up with a password that meets specific requirements is something your computer can do. And it will give you
practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password. Prompt the user for the minimum length, the number of special
characters, and the number of numbers. Then generate a password for the user using those inputs.

Example Output

What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#

Constraints

Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.

Challenges

Randomly convert vowels to numbers, such as 3 for E and 4 for A.
Have the program present a few options rather than a single result.
Place the password on the user’s clipboard when generated.
*/
public class App {

    char[] specialChars = { '@', '#', '$', '%', '^', '&', '*' };
    char[] numberChars = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
    char[] alphaChars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                          'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get inputs from users
        System.out.print("What's the minimum length? ");
        int minLength = input.nextInt();

        System.out.print("How many special characters? ");
        int noOfSpec = input.nextInt();

        System.out.print("How many numbers? ");
        int noOfNumbers = input.nextInt();

    }

    public static String GeneratePassword(int minLength, int noOfSpec, int noOfNumbers) {
        ArrayList<Character> charPassword = new ArrayList<Character>();


    }
}
