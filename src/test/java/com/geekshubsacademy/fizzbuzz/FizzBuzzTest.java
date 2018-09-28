package com.geekshubsacademy.fizzbuzz;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class FizzBuzzTest {

    @Test
    public void firstTest()
    {
        assertTrue(true);
    }

    @Test
    public void itShouldReturnFizzIfDivisibleByThree()
    {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 3;

        //Act
        boolean result = fizzBuzz.isFizz(value);

        //Assertion
        assertTrue(result);

    }
    @Test
    public void itShouldReturnFizzIfDivisibleByFive()
    {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 5;

        //Act
        boolean result = fizzBuzz.isBuzz(value);

        //Assertion
        assertTrue(result);

    }

}
