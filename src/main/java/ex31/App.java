/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex31;

import java.util.Scanner;

/* Exercise 31 - Karvonen Heart Rate
When you loop, you can control how much you increment the counter; you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself.
The Karvonen heart rate formula is one method you can use to determine your rate. Create a program that prompts for
your age and your resting heart rate. Use the Karvonen formula to determine the target heart rate based on a range of
intensities from 55% to 95%. Generate a table with the results as shown in the example output. The formula is

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm

Constraints

Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid
inputs.
Display the results in a tabular format.

Challenge

Implement this as a GUI program that allows the user to use a slider control for the intensity, and update the
interface in real time as the slider moves.
*/
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input age
        System.out.print("What is your age? ");
        int age = input.nextInt();

        // input resting heart rate
        System.out.print("What is your resting heart rate? ");
        int restingHR = input.nextInt();

        // output
        System.out.println("Resting Pulse: 65        Age: 22\n");
        System.out.println("Intensity\t | Rate");
        System.out.println("-------------|--------");

        // loop to calculate target heart rate and output
        for (double i = 0.55; i < 1; i = i + .05) {
            double bpm = (((220 - age) - restingHR) * i) + restingHR;
            System.out.printf("%.0f%%\t\t\t | %.0f bpm\n", i * 100, bpm);
        }
    }
}
