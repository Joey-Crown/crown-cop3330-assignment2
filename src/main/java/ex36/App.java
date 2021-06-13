/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex36;

import java.util.ArrayList;
import java.util.Scanner;

/* Exercise 36 - Computing Statistics
Statistics is important in our field. When measuring response times or rendering times, it’s helpful to collect data so
you can easily spot abnormalities. For example, the standard deviation helps you determine which values are outliers
and which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until
the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time, and the population standard
deviation.

Example Output

Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55

Constraints

Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.

Challenges

Have the program read in numbers from an external file instead of prompting for the values.
*/
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        String str = "";
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // loop to generate numbers from user input
        for (int i = 0; !str.equals("done"); i++) {
            System.out.print("Enter a number: ");
            str = input.nextLine();

            if (str.equals("done")) {
                break;
            }

            // check if digit and add to array
            boolean isADigit = IsADigit(str);

            if (isADigit) {
                number = Integer.parseInt(str);
                arr.add(number);
            } else {
                System.out.println("Not a valid input. Try Again");
            }
        }

        // printing out numbers
        System.out.print("Numbers:");
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                System.out.print(" " + arr.get(i));
                break;
            }
            System.out.print(" " + arr.get(i) + ",");
        }

        // printing avg, min, max, std deviation
        System.out.printf("\nThe average is %.1f\n", Average(arr));
        System.out.println("The minimum is " + Minimum(arr));
        System.out.println("The maximum is " + Maximum(arr));
        System.out.printf("The standard deviation is %.2f\n", StandardDeviation(arr));
    }

    public static double Average(ArrayList<Integer> arr) {
        double sum = 0;
        // sum all elements of array and divide by size
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        double average = sum / arr.size();
        return average;
    }

    public static int Minimum(ArrayList<Integer> arr) {
        int min = arr.get(0);
        // loop finds smallest element of the array
        for (int i = 1; i < arr.size(); i++) {
            if (min > arr.get(i)) {
                min = arr.get(i);
            }
        }

        return min;
    }

    public static int Maximum(ArrayList<Integer> arr) {
        int max = arr.get(0);
        // loop finds largest element of the array
        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }

        return max;
    }

    public static double StandardDeviation(ArrayList<Integer> arr) {
        double sum = 0;
        double mean = 0;
        double std = 0;

        // calculation for standard deviation
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        mean = sum / arr.size();

        for (int i = 0; i < arr.size(); i++) {
            std += Math.pow(arr.get(i) - mean, 2);
        }

        std = Math.sqrt(std / arr.size());

        return std;
    }

    // converts string to character array and checks that each index is a digit
    public static boolean IsADigit(String str) {
        char[] digits =  str.toCharArray();
        boolean isADigit = true;
        for (int i = 0; i < digits.length; i++) {
            if (!Character.isDigit(digits[i])) {
                isADigit = false;
                break;
            }
        }
        return isADigit;
    }
}
