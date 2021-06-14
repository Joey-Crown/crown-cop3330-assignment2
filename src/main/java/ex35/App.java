/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex35;

import java.util.ArrayList;
import java.util.Scanner;

/* Exercise 35 - Picking a Winner
Arrays don’t have to be hard-coded. You can take user input and store it in an array and then work with it.

Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user
leaves the entry blank. Then randomly select a winner.

Example Output

Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.

Constraints

Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time. You may need to find another data
structure, like an ArrayList.

Challenges

When a winner is chosen, remove the winner from the list of contestants and allow more winners to be chosen.
Make a GUI program that shows the array of names being shuffled on the screen before a winner is chosen.
Create a separate contest registration application. Use this program to pull in all registered users and pick a winner.
*/
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        // add first entry
        System.out.print("Enter a name: ");
        String newName = input.nextLine();
        if (!newName.equals("")) {
            names.add(newName);
        }

        // loop that will add names until user inputs a blank entry
        for (int i = 0; !newName.equals("") ; i++) {
            System.out.print("Enter a name: ");
            newName = input.nextLine();
            if (!newName.equals("")) {
                names.add(newName);
            }
        }

        // generate random number to find winner
        int winner = (int) Math.floor(Math.random() * names.size() );

        // output
        System.out.println("The winner is... " + names.get(winner) + ".");
    }
}
