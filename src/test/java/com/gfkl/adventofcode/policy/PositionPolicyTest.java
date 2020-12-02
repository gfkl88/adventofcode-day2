package com.gfkl.adventofcode.policy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PositionPolicyTest {

    @Test
    public void shouldBeValid() {
        PositionsPolicy policy = new PositionsPolicy("1-3 a");
        assertTrue(policy.isValid("abcde"));
    }

    @Test
    public void shouldNotBeValid() {
        PositionsPolicy policy = new PositionsPolicy("1-3 a");
        assertFalse(policy.isValid("abade"));
    }

}
