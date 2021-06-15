package ex32;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Should generate random number")
    void generateRandomNumber() {

        for (int i = 0; i < 100; i++) {
            Assertions.assertTrue(App.generateRandomNumber(1) < 10);
            Assertions.assertTrue(App.generateRandomNumber(2) < 100);
            Assertions.assertTrue(App.generateRandomNumber(3) < 1000);
        }
    }
}