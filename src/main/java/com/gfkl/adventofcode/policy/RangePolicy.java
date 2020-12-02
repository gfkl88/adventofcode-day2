package com.gfkl.adventofcode.policy;


import com.gfkl.adventofcode.rule.RangeRule;
import com.gfkl.adventofcode.rule.Rule;

public class RangePolicy extends Policy {

    public RangePolicy(String policy) {
        super(policy);
    }

    @Override
    protected Rule createRule(String policy) {
        return new RangeRule(getRule(policy));
    }

    @Override
    public String toString() {
        return "RangePolicy{" +
                "character=" + character +
                ", range=" + rule +
                '}';
    }
}
