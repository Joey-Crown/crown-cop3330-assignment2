/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {


    @Test
    @DisplayName("should return true when length of first name > 2")
    void validateFirstName() {
        Assertions.assertTrue(App.validateFirstName("Joseph"));
        Assertions.assertFalse(App.validateFirstName("o"));
    }

    @Test
    @DisplayName("should return true when length of last name > 2")
    void validateLastName() {
        Assertions.assertTrue(App.validateLastName("Crown"));
        Assertions.assertFalse(App.validateLastName(""));
        Assertions.assertFalse(App.validateLastName("o"));
    }

    @Test
    @DisplayName("should return true when zip code is a 5 digit number")
    void validateZipCode() {
        Assertions.assertTrue(App.validateZipCode("32601"));
        Assertions.assertFalse(App.validateZipCode("352"));
        Assertions.assertFalse(App.validateZipCode("lol"));
    }

    @Test
    @DisplayName("should return true when ID is in format AA-1234")
    void validateEmployeeID() {
        Assertions.assertTrue(App.validateEmployeeID("AA-1234"));
        Assertions.assertFalse(App.validateEmployeeID("12-3456"));
        Assertions.assertFalse(App.validateEmployeeID("AA-12A"));

    }
}
