package com.geekshubsacademy.fizzbuzz.rulesrepository;

import com.geekshubsacademy.fizzbuzz.interfaces.RuleInterface;

public class BuzzRule implements RuleInterface{
    public static final int BUZZ_FACTOR = 5;

    @Override
    public boolean match(int value) {
        return 0 == value% BUZZ_FACTOR;
    }

    @Override
    public String getReplacement() {
        return "Buzz";
    }
}
