/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PaymentCalculatorTest {

    @Test
    @DisplayName("Should give the correct number of months to pay off card")
    public void testPaymentCalculator() {
        Assertions.assertEquals(70, PaymentCalculator.PaymentCalculator(5000, (12.0 / 100) / 365, 100));
        Assertions.assertEquals(98, PaymentCalculator.PaymentCalculator(10000, (10.0 / 100) / 365, 150));
        Assertions.assertEquals(17, PaymentCalculator.PaymentCalculator(3000, (11.0 / 100) / 365, 200));
    }
}
