package com.gfkl.adventofcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RangeTest {

    @Test
    public void shouldParseALine()
    {
        String line = "1-3";
        Range expectedRange = new Range(1, 3);
        Range range = new Range(line);
        assertEquals(expectedRange, range);
    }

    @Test
    public void shouldBeInRange() {
        int number = 2;
        Range range = new Range("1-3");
        assertTrue(range.isInRange(number));
    }
}
