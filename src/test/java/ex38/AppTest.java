/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex38;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("should filter even numbers")
    void filterEvenNumbers() {

        // generates array and then creates new list of even numbers
        for (int i = 0; i < 50; i++) {
            String[] arr = new String[10];

            for (int j = 0; j < 10; j++) {
                arr[j] = String.valueOf((int) Math.floor(Math.random() * 100));
            }

            ArrayList<Integer> arrEven = App.filterEvenNumbers(arr);

            for (Integer k : arrEven) {
                Assertions.assertTrue(k % 2 == 0);
            }
        }


    }
}