/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex37;

import java.util.ArrayList;
import java.util.List;
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

    static List<Character> specialChars =  List.of( '@', '#', '$', '%', '^', '&', '*' );
    static List<Character> numberChars = List.of( '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' );
    static List<Character> alphaChars = List.of( 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                                 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' );

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input length
        System.out.print("What's the minimum length? ");
        int minLength = input.nextInt();

        // input how many special characters
        System.out.print("How many special characters? ");
        int noOfSpec = input.nextInt();

        // input how many numbers
        System.out.print("How many numbers? ");
        int noOfNumbers = input.nextInt();

        // generate password and output result
        String password = GeneratePassword(minLength, noOfSpec, noOfNumbers);
        System.out.println("Your password is " + password);
        System.out.println("The length of the password is " + password.length());

    }

    public static String GeneratePassword(int minLength, int noOfSpec, int noOfNumbers) {
        StringBuilder password = new StringBuilder();

        int maxLength = (noOfNumbers + noOfSpec) * 2;

        // generates random password of minimum length or max length (special chars & numbers * 2)
        // or number of letters equals twice # of number and special characters
        while ((password.length() < minLength || password.length() < maxLength) || !(noOfNumbers == 0 && noOfSpec == 0)) {
            // generates random number 0-2
            int rand = (int) Math.floor(Math.random() * 3);

            // takes random number and adds a letter, number, or special character to string
            // decrements the user given number of special chars and numbers to keep track of how many have been added
            if (rand == 0 && noOfSpec > 0) {
                password.append(specialChars.get((int) Math.floor(Math.random() * specialChars.size())));
                noOfSpec--;
            }
            if (rand == 1 && noOfNumbers > 0) {
                password.append(numberChars.get((int) Math.floor(Math.random() * numberChars.size())));
                noOfNumbers--;
            }
            if (rand == 2) {
                password.append(alphaChars.get((int) Math.floor(Math.random() * alphaChars.size())));
            }
        }

        // converts StringBuilder object to string and returns it
        return password.toString();
    }
}
