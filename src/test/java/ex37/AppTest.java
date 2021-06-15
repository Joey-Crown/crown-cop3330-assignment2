/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex37;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("test for password crtieria")
    void generatePassword() {

        for (int i = 0; i < 100; i++) {
            int minLength = 8, noOfSpec = 2, noOfNumbers = 2, counter = 0;
            int minChars = noOfNumbers + noOfSpec;
            String test = App.GeneratePassword(minLength, noOfSpec, noOfNumbers);
            Assertions.assertFalse(test.isEmpty());
            Assertions.assertTrue(test.length() >= minLength);

            char[] testArr = test.toCharArray();

            for (int j = 0; j < testArr.length; j++) {
                if(Character.isLetter(testArr[j])) {
                    counter++; }
                if (Character.isDigit(testArr[j])) {
                    noOfNumbers--; }
                if (!(Character.isDigit(testArr[j]) || Character.isLetter(testArr[j]))) {
                    noOfSpec--; }
            }

            Assertions.assertTrue(noOfNumbers == 0);
            Assertions.assertTrue(noOfSpec == 0);
            Assertions.assertTrue(counter >= minChars);
        }
    }
}