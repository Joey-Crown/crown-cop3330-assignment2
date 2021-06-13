/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex33;

import java.util.Scanner;

/* Exercise 33 - Magic 8 Ball
Arrays are great for storing possible responses from a program. If you combine that with a random number generator, you
can pick a random entry from this list, which works great for games.

Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again
later."

Example Output

What's your question?
> Will I be rich and famous?

Ask again later.

Constraint

The value should be chosen randomly using a pseudo random number generator. Store the possible choices in a list and
select one at random.

Challenges

Implement this as a GUI application.
If available, use native device libraries to allow you to “shake” the 8 ball.

 */
public class App {

    // array of possible responses
    static String[] arr = {"Yes", "No", "Maybe", "Ask again later."};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input question
        System.out.println("What's your question? ");
        String question = input.nextLine();

        // generate random number
        int rand = (int) Math.floor((Math.random() * 5));

        //output
        System.out.print("\n" + arr[rand]);
    }
}
