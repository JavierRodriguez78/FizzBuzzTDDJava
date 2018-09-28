package com.geekshubsacademy.fizzbuzz.rulesrepository;

import com.geekshubsacademy.fizzbuzz.interfaces.RuleInterface;

public class FizzRule implements RuleInterface {

    public static final int FIZZ_FACTOR = 3;
    @Override
    public boolean match(int value) {
        return 0 == value% FIZZ_FACTOR;
    }

    @Override
    public String getReplacement() {
        return "Fizz";
    }
}
