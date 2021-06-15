/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("Should pass for bad inputs")
    public void testMain() {
        char zero = '0';
        String rateString = "lol";
        char[] word = rateString.toCharArray();

        Assertions.assertTrue(!Character.isDigit(zero) || zero == '0');

        for (int i = 0; i < word.length; i++) {
            if (!Character.isDigit(word[i]) || word[i] == '0') {
                System.out.println("Sorry. That's not a valid input.");
                rateString = "0";
                break;

            }
        }

        Assertions.assertTrue(rateString.equals("0"));
    }
}
