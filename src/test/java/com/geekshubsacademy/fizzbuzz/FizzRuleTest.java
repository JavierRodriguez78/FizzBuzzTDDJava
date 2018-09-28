package com.geekshubsacademy.fizzbuzz;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(DataProviderRunner.class)
public class FizzRuleTest {

    @DataProvider
    public static Object[][] dataNumberProviderForFizz(){
        return new Object [][]{
                { 3, true},
                { 6, true},
                { 9, true},
                { 12, true},
                {15, true},
                {18, true}
        };
    }


    @Test
    @UseDataProvider("dataNumberProviderForFizz")
    public void itShouldReturnFizzifDivisibleByTrhee(int value, boolean expected)
    {
        FizzRule fizzRule = new FizzRule();
        boolean result = fizzRule.match(value);
        assertEquals(expected, result);

    }
}
