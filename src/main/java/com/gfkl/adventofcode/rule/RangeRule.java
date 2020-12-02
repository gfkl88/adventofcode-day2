package com.gfkl.adventofcode.rule;

import com.google.common.base.CharMatcher;

import java.util.Objects;

public class RangeRule extends Rule {

    public RangeRule(String range) {
        super(range);
    }

    @Override
    public boolean isValid(String password, char character) {
        return this.isInRange(this.characterOccurrenceCount(password, character));
    }

    protected boolean isInRange(int number) {
        return (number >= this.firstValue) &&
                (number <= this.secondValue);
    }

    protected int characterOccurrenceCount(String password, char character) {
        return CharMatcher.is(character).countIn(password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RangeRule range = (RangeRule) o;
        return firstValue == range.firstValue &&
                secondValue == range.secondValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue);
    }

    @Override
    public String toString() {
        return "Range{" +
                "min=" + firstValue +
                ", max=" + secondValue +
                '}';
    }
}
