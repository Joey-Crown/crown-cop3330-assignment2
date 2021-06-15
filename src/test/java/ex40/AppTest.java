/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void createMap() {
        Map<String, String> map = new HashMap<String, String>();
        App.createMap(new Employee("John", "Johnson", "Manager", "2016-12-31"), map);
        Assertions.assertFalse(map.get("First Name").isEmpty());
        Assertions.assertFalse(map.get("Last Name").isEmpty());
        Assertions.assertFalse(map.get("Position").isEmpty());
        Assertions.assertFalse(map.get("Separation Date").isEmpty());
    }

    @Test
    void compareStrings() {
        List<Map<String, String>> records = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();
        Map<String, String> map1 = new HashMap<String, String>();
        records.add(App.createMap(new Employee("Jake", "Jacobson", "Programmer", ""), map));
        records.add(App.createMap(new Employee("Jacquelyn", "Jackson", "DBA", ""), map1));

        char[] searching = "Jac".toCharArray();

        App.compareStrings(searching);
    }
}