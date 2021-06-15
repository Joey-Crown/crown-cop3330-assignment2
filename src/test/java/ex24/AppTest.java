/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("Should show if two words are anagrams")
    public void shouldIsAnagram() {
        Assertions.assertTrue(App.isAnagram("note", "tone"));
        Assertions.assertFalse(App.isAnagram("flag", "tone"));
        Assertions.assertTrue(App.isAnagram("covert", "vector"));
    }
}
