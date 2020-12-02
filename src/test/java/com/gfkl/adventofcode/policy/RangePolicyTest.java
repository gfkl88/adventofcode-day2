package com.gfkl.adventofcode.policy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RangePolicyTest {

    @Test
    public void shouldBeValid() {
        RangePolicy policy = new RangePolicy("1-3 a");
        assertTrue(policy.isValid("abcde"));
    }
}
