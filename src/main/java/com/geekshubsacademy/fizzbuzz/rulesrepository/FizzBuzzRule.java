package com.geekshubsacademy.fizzbuzz.rulesrepository;

import com.geekshubsacademy.fizzbuzz.interfaces.RuleInterface;

public class FizzBuzzRule implements RuleInterface {

    public static final int FIZZ_FACTOR = 3;
    public static final int BUZZ_FACTOR = 5;

    @Override
    public boolean match(int value) {
        if ((0==value % FIZZ_FACTOR) &&
                (0==value % BUZZ_FACTOR)) return true;
        return false;
    }

    @Override
    public String getReplacement() {
        return "FizzBuzz";
    }
}
