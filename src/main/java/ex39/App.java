/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex39;

import java.util.*;

/* Exercise 39 - Sorting Records
When you’re looking at results, you’ll want to be able to sort them so you can find what you’re looking for quickly or
do some quick visual comparisons.

Given the following data set, create a program that sorts all employees by last name and prints them to the screen in a
tabular format.

Example Output
Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
John Johnson        | Manager           | 2016-12-31
Michaela Michaelson | District Manager  | 2015-12-19
Sally Weber         | Web Developer     | 2015-12-18
Tou Xiong           | Software Engineer | 2016-10-05

Constraint

Store the data using a list of maps.

Challenges

Prompt for how the records should be sorted. Allow sorting by separation date, position, or last name.
Use a database such as MySQL, or a key-value store such as Redis, to store the employee records. Retrieve the records
from the data store.
 */
public class App {

    static List<Map<String, String>> records = new ArrayList<Map<String, String>>();

    public static void main(String[] args) {

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

        // use comparator method to sort list of maps by last name
        Comparator<Map<String, String>> mapCompare = new Comparator<Map<String, String>>() {
            public int compare(Map<String, String> o1, Map<String, String> o2) {
                return o1.get("Last Name").compareTo(o2.get("Last Name"));
            }
        }; Collections.sort(records, mapCompare);

        //output
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        for (int i = 0; i < records.size(); i++) {
            printRecords(records.get(i));
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
