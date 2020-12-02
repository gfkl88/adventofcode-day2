package com.gfkl.adventofcode.policy;

import com.gfkl.adventofcode.rule.PositionsRule;
import com.gfkl.adventofcode.rule.Rule;

public class PositionsPolicy extends Policy {

    public PositionsPolicy(String policy) {
        super(policy);
    }

    @Override
    protected Rule createRule(String policy) {
        return new PositionsRule(getRule(policy));
    }

    @Override
    public String toString() {
        return "RangePolicy{" +
                "character=" + character +
                ", range=" + rule +
                '}';
    }
}
