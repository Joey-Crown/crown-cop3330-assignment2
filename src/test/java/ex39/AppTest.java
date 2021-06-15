/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex39;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
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

}