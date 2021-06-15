/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void average() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(100); arr.add(200); arr.add(1000); arr.add(300);
        Assertions.assertEquals(400, App.Average(arr));
    }

    @Test
    void minimum() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(100); arr.add(200); arr.add(1000); arr.add(300);
        Assertions.assertEquals(100, App.Minimum(arr));
    }

    @Test
    void maximum() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(100); arr.add(200); arr.add(1000); arr.add(300);
        Assertions.assertEquals(1000, App.Maximum(arr));
    }

    @Test
    void standardDeviation() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(100); arr.add(200); arr.add(1000); arr.add(300);
        Assertions.assertEquals(353.5533905932738, App.StandardDeviation(arr));
    }

    @Test
    void isADigit() {
        Assertions.assertTrue(App.IsADigit("1234"));
        Assertions.assertFalse(App.IsADigit("joe"));
    }
}