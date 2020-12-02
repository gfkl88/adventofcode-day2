package com.gfkl.adventofcode;


import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckerTest
{

    @Test
    public void shouldFindTwoValidPasswords() throws IOException {
        assertEquals(2, PasswordChecker.checkRangePasswords("src/test/resources/input"));
    }

    @Test
    public void shouldFindOneValidPasswords() throws IOException {
        assertEquals(1, PasswordChecker.checkPositionsPasswords("src/test/resources/input"));
    }

}
