package com.gfkl.adventofcode.policy;

import com.gfkl.adventofcode.rule.Rule;

import java.util.Objects;

public abstract class Policy {

    public static final String POLICY_DELIMITER = " ";

    protected char  character;
    protected Rule  rule;

    protected Policy(String policy) {
        this.character = getCharacter(policy);
        this.rule = createRule(policy);
    }

    public boolean isValid(String password) {
        return this.rule.isValid(password, this.character);
    }

    abstract protected Rule createRule(String policy);

    protected static char getCharacter(String policy) {
        return policy.split(POLICY_DELIMITER)[1].charAt(0);
    }

    protected static String getRule(String policy) {
        return policy.split(POLICY_DELIMITER)[0];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return character == policy.character &&
                Objects.equals(rule, policy.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(character, rule);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "character=" + character +
                ", rule=" + rule +
                '}';
    }
}
