package com.example.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculationServiceTest {

    private CalculationTaskService calculationTaskService;

    @BeforeEach
    public void setUp() {
        calculationTaskService = new CalculationTaskService();
    }

    @Test
    public void testSquare() {
        int result = calculationTaskService.square(5);
        assertEquals(25, result);
    }

    @Test
    public void testCube() {
        int result = calculationTaskService.cube(3);
        assertEquals(27, result);
    }

    @Test
    public void testIsEven() {
        assertTrue(calculationTaskService.isEven(6));
        assertFalse(calculationTaskService.isEven(7));
    }

    @Test
    public void testIsPrimeOrNot() {
        assertTrue(calculationTaskService.isPrimeOrNot(7));
        assertFalse(calculationTaskService.isPrimeOrNot(8));
    }

    @Test
    public void testIsArmstrong() {
        assertTrue(calculationTaskService.isArmstrong(153));
        assertTrue(calculationTaskService.isArmstrong(370));
        assertFalse(calculationTaskService.isArmstrong(123));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(calculationTaskService.isPalindrome(121));
        assertFalse(calculationTaskService.isPalindrome(123));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculationTaskService.factorial(5));
        assertEquals(1, calculationTaskService.factorial(0));
    }

    @Test
    public void testReverse() {
        assertEquals(321, calculationTaskService.reverse(123));
        assertEquals(0, calculationTaskService.reverse(0));
    }
}
