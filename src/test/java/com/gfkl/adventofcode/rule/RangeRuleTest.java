package com.gfkl.adventofcode.rule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RangeRuleTest {

    @Test
    public void shouldFindCharacterOccurrence() {
        RangeRule range = new RangeRule("1-3");
        assertEquals(1, range.characterOccurrenceCount("abcde", 'a'));
    }

    @Test
    public void shouldBeInRange() {
        RangeRule range = new RangeRule("1-3");
        assertTrue(range.isInRange(2));
    }

    @Test
    public void shouldBeAtOnlyOnePosition() {
        RangeRule range = new RangeRule("1-3");
        assertTrue(range.isValid("abcde", 'a'));
    }

}
