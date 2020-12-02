package com.gfkl.adventofcode.rule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PositionsRuleTest {

    @Test
    public void shouldBeAtOnlyOnePosition() {
        PositionsRule positions = new PositionsRule("1-3");
        assertTrue(positions.isValid("abcde", 'a'));
    }

    @Test
    public void shouldNotBeAtOnlyOnePosition() {
        PositionsRule positions = new PositionsRule("1-3");
        assertFalse(positions.isValid("abade", 'a'));
    }

    @Test
    public void shouldBeAtNoPosition() {
        PositionsRule positions = new PositionsRule("1-3");
        assertFalse(positions.isValid("abcde", 'r'));
    }

}
