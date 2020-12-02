package com.gfkl.adventofcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordPolicyTest {

    @Test
    public void shouldParseALine()
    {
        String line = "1-3 a";
        PasswordPolicy expectedPolicy = new PasswordPolicy(new Range(1, 3), 'a');
        PasswordPolicy policy = new PasswordPolicy(line);
        assertEquals(expectedPolicy, policy);
    }

    @Test
    public void shouldMatch() {
        char character = 'a';
        PasswordPolicy policy = new PasswordPolicy(new Range(1, 3), 'a');
        assertTrue(policy.matchCharacter(character));
    }

    @Test
    public void shouldHaveValidOccurrences() {
        PasswordPolicy policy = new PasswordPolicy(new Range(1, 3), 'a');
        assertTrue(policy.isValidOccurrenceNumber(2));
    }

    @Test
    public void shouldFindCharacterOccurrence() {
        PasswordPolicy policy = new PasswordPolicy("1-3 a");
        assertEquals(1, policy.findCharacterOccurrenceNumber("abcde"));
    }

    @Test
    public void shouldBeValid() {
        PasswordPolicy policy = new PasswordPolicy("1-3 a");
        assertTrue(policy.isValid("abcde"));
    }
}
