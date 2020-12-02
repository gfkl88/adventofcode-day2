package com.gfkl.adventofcode.rule;

import java.util.Objects;

public class PositionsRule extends Rule {

    public PositionsRule(String positions) {
        super(positions);
    }

    @Override
    public boolean isValid(String password, char character) {
        return areCharactersMatching(getCharacterAt(password, this.firstValue), character) ^
                areCharactersMatching(getCharacterAt(password, this.secondValue), character);
    }

    private char getCharacterAt(String password, int position) {
        return password.charAt(position - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionsRule positions = (PositionsRule) o;
        return firstValue == positions.firstValue &&
                secondValue == positions.secondValue;
    }

    @Override
    public String toString() {
        return "Positions{" +
                "firstPosition=" + firstValue +
                ", secondPosition=" + secondValue +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue);
    }

}
