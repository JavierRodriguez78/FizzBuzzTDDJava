package com.geekshubsacademy.fizzbuzz;
import com.geekshubsacademy.fizzbuzz.rulesrepository.FizzBuzzRule;
import com.geekshubsacademy.fizzbuzz.rulesrepository.FizzRule;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(DataProviderRunner.class)
public class FizzBuzzRuleTest {

    @DataProvider
    public static Object[][] dataNumberProviderForFizzBuzz(){
        return new Object [][]{
                { 15, true},
                { 30, true},
                { 45, true},
                { 60, true},
                { 75, true},
                { 90, true}
        };
    }


    @Test
    @UseDataProvider("dataNumberProviderForFizzBuzz")
    public void itShouldReturnFizzBuzzifDivisibleByTrheeAndFive(int value, boolean expected)
    {
        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule();
        boolean result = fizzBuzzRule.match(value);
        assertEquals(expected, result);

    }
}
