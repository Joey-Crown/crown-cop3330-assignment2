/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex25;
/* Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.

Example Output

The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints

Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to
 determine the password strength. Do not have the function return a string—you may need to support multiple languages
 in the future.
Use a single output statement.

Challenge

Create a GUI application or web application that displays graphical feedback as well as text feedback in real time. As
 someone enters a password, determine its strength and display the result
*/
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] howStrong = {"very weak", "weak", "strong", "very strong"};

        // input password
        System.out.print("Enter the password: ");
        String password = input.nextLine();

        int strength = passwordValidator(password);

        System.out.println("The password '" + password + "' is a " + howStrong[strength - 1] + " password");

    }

    public static int passwordValidator(String password) {

        int score = 0;
        boolean hasDigits = false;
        boolean hasChars = false;
        boolean hasSpecial = false;
        boolean length = false;
        char[] passwordArray = password.toCharArray();

        // checking for password characteristics
        for (int i = 0; i < passwordArray.length; i++) {

            if (Character.isDigit(passwordArray[i])) {
                hasDigits = true;
            }

            if (Character.isLetter(passwordArray[i])) {
                hasChars = true;
            }

            if (!Character.isLetter(passwordArray[i]) && !Character.isDigit(passwordArray[i])) {
                hasSpecial = true;
            }
        }

        // checking length
        if (password.length() >= 8) {
            length = true;
        }

        // giving a score based on strength
        if (!hasChars && hasDigits && !length) {
            score = 1;
        } else if (hasChars && hasDigits && !length) {
            score = 2;
        } else if (hasChars && hasDigits && length && !hasSpecial) {
            score = 3;
        } else if (hasChars && hasDigits && length && hasSpecial) {
            score = 4;
        }

        return score;
    }
}