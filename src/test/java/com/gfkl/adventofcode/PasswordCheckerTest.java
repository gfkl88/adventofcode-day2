package com.gfkl.adventofcode;


import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckerTest
{

    @Test
    public void shouldFindTwoValidPasswords() throws IOException {
        PasswordChecker passwordChecker = new PasswordChecker();
        assertEquals(2, passwordChecker.checkPasswords("src/test/resources/input"));
    }

}
