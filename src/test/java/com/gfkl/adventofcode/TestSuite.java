package com.gfkl.adventofcode;

import com.gfkl.adventofcode.policy.PositionPolicyTest;
import com.gfkl.adventofcode.policy.RangePolicyTest;
import com.gfkl.adventofcode.rule.PositionsRuleTest;
import com.gfkl.adventofcode.rule.RangeRuleTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        PasswordCheckerTest.class,
        PasswordValidatorTest.class,
        RangePolicyTest.class,
        RangeRuleTest.class,
        PositionsRuleTest.class,
        PositionPolicyTest.class
})
public class TestSuite {
}
