package com.geekshubsacademy.fizzbuzz;
import com.geekshubsacademy.fizzbuzz.rulesrepository.FizzRule;
import com.geekshubsacademy.fizzbuzz.rulesrepository.GeekshubsRule;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;


@RunWith(DataProviderRunner.class)

public class GeeksHubsRuleTest {
    @DataProvider
    public static Object[][] dataNumberProviderForGeeksHubs(){
        return new Object [][]{
                { 7, true},
                { 14, true},
                { 21, true},
                { 28, true},
                { 35, true},
                { 42, true}
        };
    }


    @Test
    @UseDataProvider("dataNumberProviderForGeeksHubs")
    public void itShouldReturnGeeksHubsifDivisibleBySeven(int value, boolean expected)
    {
        GeekshubsRule geekshubsRule = new GeekshubsRule();
        boolean result = geekshubsRule.match(value);
        assertEquals(expected, result);

    }
}
