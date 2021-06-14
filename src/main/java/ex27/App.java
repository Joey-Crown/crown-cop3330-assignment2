/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex27;

import java.util.Scanner;

/* Exercise 27 - Validating Inputs
Large functions aren't very usable or maintainable. It makes a lot of sense to break down the logic of a program into
 smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid
 according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output

Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.
Or

Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.

Constraints

Create a function for each type of validation you need to write. Then create a validateInput function that takes in all
 of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.

Challenges

Use regular expressions to validate the input.
Implement this as a GUI application or web application that gives immediate feedback when the fields lose focus.
Repeat the process if the input is not valid.
*/
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input first name
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        // input last name
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        // input zip code
        System.out.print("Enter your zip code: ");
        String zipCode = input.nextLine();

        // input employee ID
        System.out.print("Enter your employee ID: ");
        String employeeID = input.nextLine();
    }

    public void validateInput(String firstName, String lastName, String zipCode, String employeeID) {
        if (validateFirstName(firstName) && validateLastName(lastName) && validateZipCode(zipCode) && validateEmployeeID(employeeID)) {
            System.out.println("There were no errors found.");
        }
    }

    public boolean validateFirstName(String firstName) {
        if (firstName.length() < 2) {
            System.out.println("The first name must be at least 2 characters long.");
            return false;
        }
        return true;
    }

    public boolean validateLastName(String lastName) {
        if (lastName.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.");
            if (lastName.isEmpty()) System.out.println("The last name must be filled in.");
            return false;
        }
        return true;
    }

    public boolean validateZipCode (String zipCode) {

        char[] zip = zipCode.toCharArray();

        for (int i = 0; i < zipCode.length(); i++) {
            if (!Character.isDigit(zip[i]) || zipCode.length() < 5) {
                System.out.println("The zipcode must be a 5 digit number.");
                return false;
            }
        }
        return true;
    }

    public boolean validateEmployeeID (String employeeID) {
        char[] ID = employeeID.toCharArray();
        boolean valid = true;
        if (!Character.isLetter(ID[0]) || !Character.isLetter(ID[1])) valid = false;
        if (ID[2] != '-') valid = false;
        for (int i = 3; i < ID.length; i++) {
            if (!Character.isDigit(ID[i])) valid = false;
        }
        if (!valid) {
            System.out.println("The zipcode must be a 5 digit number.");
        }
        return valid;
    }
}
