/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex35;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Random names being picked")
    void main() {
        String[] arr = {"Homer", "Bart", "Maggie", "Lisa", "Moe"};

        for (int i = 0; i < 30; i++) {
            int winner = (int) Math.floor(Math.random() * arr.length );
            System.out.println("The winner is... " + arr[winner] + ".");
        }
    }
}