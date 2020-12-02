package com.gfkl.adventofcode;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        PasswordCheckerTest.class,
        PasswordTest.class,
        PasswordPolicyTest.class,
        RangeTest.class
})
public class TestSuite {
}
