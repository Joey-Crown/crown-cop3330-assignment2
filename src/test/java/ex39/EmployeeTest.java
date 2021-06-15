/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex39;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testEmployee() {
        Employee joe = new Employee("Joseph", "Crown", "Student", "6-15-2021");
        Assertions.assertFalse(joe.firstName.isEmpty());
        Assertions.assertFalse(joe.lastName.isEmpty());
        Assertions.assertFalse(joe.position.isEmpty());
        Assertions.assertFalse(joe.separationDate.isEmpty());
    }
}