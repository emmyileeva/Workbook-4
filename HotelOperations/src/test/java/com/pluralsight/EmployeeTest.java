package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchOutChecksIfTimeIsCorrectlyCalculated() {
        // Arrange
        Employee employee = new Employee("E001", "John Doe", "Front Desk", 20.0);
        // Act
        employee.punchIn(9.0);
        employee.punchOut(17.0);
        // Assert
        assertEquals(8.0, employee.getTotalPay() / 20.0, "Hours worked should be 8.0");
    }

    @Test
    void punchOutWithoutPunchInDoesNotAffectHoursWorked() {
        // Arrange
        Employee employee = new Employee("E002", "Jane Smith", "Housekeeping", 15.0);
        // Act
        employee.punchOut(17.0); // Try to punch out without punching in
        // Assert
        assertEquals(0, employee.getTotalPay() / 15.0, "Hours worked should remain 0");
    }
}