package com.geekshubsacademy.fizzbuzz.rulesrepository;

import com.geekshubsacademy.fizzbuzz.interfaces.RuleInterface;

public class GeekshubsRule implements RuleInterface{
    public static final int GEEKSHUBS_FACTOR = 7;

    @Override
    public boolean match(int value) {
        return 0 == value% GEEKSHUBS_FACTOR;
    }

    @Override
    public String getReplacement() {
        return "GEEKSHUBS";
    }
}
