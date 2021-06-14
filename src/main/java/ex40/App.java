/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex40;

import java.util.*;

/* Exercise 40 - Filtering Records
Sorting records is helpful, but sometimes you need to filter down the results to find or display only what you’re
looking for.

Given the following data set create a program that lets a user locate all records that match the search string by
comparing the search string to the first or last name field.

Example Output

Enter a search string: Jac

Results:

Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |

Constraint

Store the data using a list of maps.

Challenges

Make the search case insensitive.
Add the option to search by position.
Add the option to find all employees where their separation date is six months ago or more.
Read in the data from a file.
 */
public class App {

    static List<Map<String, String>> records = new ArrayList<Map<String, String>>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // generate series of maps and use creatMap function to populate them
        Map<String, String> map1 = new HashMap<String, String>();
        Map<String, String> map2 = new HashMap<String, String>();
        Map<String, String> map3 = new HashMap<String, String>();
        Map<String, String> map4 = new HashMap<String, String>();
        Map<String, String> map5 = new HashMap<String, String>();
        Map<String, String> map6 = new HashMap<String, String>();
        createMap(new Employee("John", "Johnson", "Manager", "2016-12-31"), map1);
        createMap(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"), map2);
        createMap(new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"), map3);
        createMap(new Employee("Jake", "Jacobson", "Programmer", ""), map4);
        createMap(new Employee("Jacquelyn", "Jackson", "DBA", ""), map5);
        createMap(new Employee("Sally", "Webber", "Web Developer", "2015-12-18"), map6);

        System.out.print("Enter a search string: ");
        char[] searching = input.nextLine().toCharArray();

        //comparing strings and outputting them
        System.out.println("\nResults:\n");
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        compareStrings(searching);

    }

    private static void compareStrings(char[] searching) {
        for (int i = 0; i < records.size(); i++) {
            char[] searched = records.get(i).get("First Name").toCharArray();
            int counter = 0;

            // loop through characters of the first name for a match
            for (int j = 0; j < searching.length; j++) {
                if (searching[j] == searched[j]) {
                    counter++;
                    continue;
                }
            }
            if (counter == searching.length) { // if the counter equals the length of searching, it prints the record
                printRecords(records.get(i));
            } else counter = 0;

            searched = records.get(i).get("Last Name").toCharArray();

            // repeat process to check last name
            for (int j = 0; j < searching.length; j++) {
                if (searching[j] == searched[j]) {
                    counter++;
                }
            }
            if (counter == searching.length) {
                printRecords(records.get(i));
            }
        }
    }

    public static Map<String, String> createMap(Employee obj, Map<String, String> m) {
        m.put("First Name", obj.firstName);
        m.put("Last Name", obj.lastName);
        m.put("Position", obj.position);
        m.put("Separation Date", obj.separationDate);

        // add maps to records
        records.add(m);
        return m;
    }

    // function that prints data from map
    public static void printRecords(Map<String, String> map ) {
        System.out.println( map.get("First Name") +  " " + map.get("Last Name") + "\t\t| " + map.get("Position") + "\t\t| " + map.get("Separation Date") );
    }

}
