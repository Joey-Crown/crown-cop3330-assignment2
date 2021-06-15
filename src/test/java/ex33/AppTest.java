/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() {
        String[] arr = {"Yes", "No", "Maybe", "Ask again later."};
        for (int i = 0; i < 50; i++) {
            // generate random number
            int rand = (int) Math.floor((Math.random() * 4));

            //output
            System.out.println(arr[rand]);
        }
    }
}