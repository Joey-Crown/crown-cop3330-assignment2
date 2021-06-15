/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Equation should work as expected")
    void main() {
        int age = 22;
        int restingHR = 65;

        for (double i = 0.55; i < 1; i = i + .05) {
            double bpm = (((220 - age) - restingHR) * i) + restingHR;
            Assertions.assertEquals((((220 - 22) - 65) * i) + 65, bpm);
        }
    }
}