package lesson5.task4;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testShortDescription() {
        // Given
        Employee employee = new Employee("Peter", "Parker", 30);

        // When
        String shortDescription = employee.getShortDescriptionOfEmployee();

        // Then
        assertEquals("Employee name: Peter Parker", shortDescription);
    }

    @Test
    public void testLongDescription() {
        // Given
        Employee employee = new Employee("Nathan", "Drake", 38);

        // When
        String longDescription = employee.getLongDescriptionOfEmployee();

        // Then
        assertEquals("Employee details: Nathan Drake is 38 years old.", longDescription);
    }

    @Test
    public void testGetTotalSalary() {
        // Given
        BigDecimal baseSalary = new BigDecimal("5000.00");
        BigDecimal bonus = new BigDecimal("1000.00");
        Employee employee = new Employee("Deacon", "St. John", 38, baseSalary, bonus);

        // When
        BigDecimal totalSalary = employee.getTotalSalary();

        // Then
        assertEquals(new BigDecimal("6000.00"), totalSalary);
    }

    @Test

    public void testGetBaseSalary() {
        // Given
        BigDecimal baseSalary = new BigDecimal("5000.00");
        BigDecimal bonus = new BigDecimal("1000.00");
        Employee employee = new Employee("Sam", "Bridges", 37, baseSalary, bonus);

        // When
        BigDecimal baseSalary1 = employee.getBaseSalary();

        // Then
        assertEquals(new BigDecimal("5000.00"), baseSalary1);
    }

    @Test
    public void testGetBonus() {
        // Given
        BigDecimal baseSalary = new BigDecimal("5000.00");
        BigDecimal bonus = new BigDecimal("1000.00");
        Employee employee = new Employee("Claire", "Redfield", 42, baseSalary, bonus);

        // When
        BigDecimal bonus1 = employee.getBonus();

        // Then
        assertEquals(new BigDecimal("1000.00"), bonus1);
    }

}