/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex34;

import java.util.Scanner;

/* Exercise 34 - Employee List Removal
Sometimes you have to locate and remove an entry from a list based on some criteria. You may have a deck of cards and
need to discard one so it’s no longer in play, or you may need to remove values from a list of valid inputs once
they’ve been used. Storing the values in an array makes this process easier. Depending on your language, you may find
it safer and more efficient to create a new array instead of modifying the existing one.

Create a small program that contains a list of employee names. Print out the list of names when the program runs the
first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining
employees, each on its own line.

Example Output

There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin

Constraint

Use an array or list to store the names.

Challenges

If the user enters a name that’s not found, print out an error message stating that the name does not exist.
Read in the list of employees from a file, with each employee on its own line.
Write the output to the same file you read in.
 */
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = { "John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin" };


        // printing the array of names
        System.out.println("There are " + names.length + " employees:");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //input name to be removed
        System.out.print("\nEnter an employee name to remove: ");
        String removedName = input.nextLine();

        // create new array with remaining employees
        String[] newNames = new String[names.length - 1];
        int pos = 0;

        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals(removedName)) {
                newNames[pos] = names[i];
                pos++;
            }
        }

        //outputting fixed array
        System.out.println("\nThere are " + newNames.length + " employees:");

        for (int i = 0; i < newNames.length; i++) {
            System.out.println(newNames[i]);
        }

    }
}
