/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("should return score based on password strength")
    public void testPasswordValidator() {
        String[] passwords = { "12345", "abcdef", "abc123xyz", "1337h@xor!" };

        for (int i = 0; i < passwords.length; i++) {
            int result = App.passwordValidator(passwords[i]);
            int expected = i + 1;

            Assertions.assertEquals(expected, result);
            System.out.println("Expected: " + expected + "\tResult: " + result);
        }

    }
}
