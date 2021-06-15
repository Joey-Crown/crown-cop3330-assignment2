/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Checks that the multiplication is handled correctly")
    void main() {

        int test1 = 1;
        int test2 = 1;

        for (int i = 1; i <= 12; i++) {

            for (int j = 1; j <= 12; j++) {
                Assertions.assertEquals(test1 * test2, i * j);
                test2++;
            }
            test1++;
            test2 = 1;
        }
    }
}