package com.gfkl.adventofcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    public void shouldBeRangeValid() {
        assertTrue(PasswordValidator.createRangePassword("1-3 a: abcde").isValid());
    }

    @Test
    public void shouldNotBeRangeValid() {
        assertFalse(PasswordValidator.createRangePassword("1-3 b: cdefg").isValid());
    }

    @Test
    public void shouldBePositionValid() {
        assertTrue(PasswordValidator.createPositionsPassword("1-3 a: abcde").isValid());
    }

    @Test
    public void shouldNotBePositionValid() {
        assertFalse(PasswordValidator.createPositionsPassword("1-3 b: cdefg").isValid());
    }

}
