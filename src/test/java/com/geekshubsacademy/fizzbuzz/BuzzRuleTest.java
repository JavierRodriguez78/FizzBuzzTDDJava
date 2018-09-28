package com.geekshubsacademy.fizzbuzz;
import com.geekshubsacademy.fizzbuzz.rulesrepository.FizzRule;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(DataProviderRunner.class)
public class BuzzRuleTest {
    @DataProvider
    public static Object[][] dataNumberProviderForBuzz(){
        return new Object [][]{
                { 5, true},
                { 10, true},
                { 15, true},
                { 20, true},
                {25, true},
                {30, true}
        };
    }

    @Test
    @UseDataProvider("dataNumberProviderForBuzz")
    public void itShouldReturnFizzifDivisibleByFive(int value, boolean expected)
    {
        BuzzRule buzzRule = new BuzzRule();
        boolean result = buzzRule.match(value);
        assertEquals(expected, result);

    }
}
