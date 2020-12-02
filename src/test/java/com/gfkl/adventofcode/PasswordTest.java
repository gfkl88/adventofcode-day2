package com.gfkl.adventofcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

    @Test
    public void shouldParseALine()
    {
        String line = "1-3 a: abcde";
        Password expectedPassword = new Password(new PasswordPolicy(new Range(1, 3), 'a'), "abcde");
        Password password = new Password(line);
        assertEquals(expectedPassword, password);
    }

    @Test
    public void shouldBeValid() {
        String line = "1-3 a: abcde";
        Password password = new Password(line);
        assertTrue(password.isValid());
    }

    @Test
    public void shouldNotBeValid() {
        String line = "1-3 b: cdefg";
        Password password = new Password(line);
        assertFalse(password.isValid());
    }

}
