package com.gfkl.adventofcode;

import java.util.Objects;

public class PasswordPolicy {

    private Range   range;
    private char  character;

    public PasswordPolicy(Range range, char character) {
        this.range = range;
        this.character = character;
    }

    public PasswordPolicy(String policy) {
        String[] rangeAndCharacter = policy.split(" ");
        this.range = new Range(rangeAndCharacter[0]);
        this.character = rangeAndCharacter[1].charAt(0);
    }

    public boolean matchCharacter(char character) {
        return this.character == character;
    }

    public boolean isValidOccurrenceNumber(int occurrences) {
        return this.range.isInRange(occurrences);
    }

    public int findCharacterOccurrenceNumber(String password) {
        int occurrenceNumber = 0;
        for (char character : password.toCharArray()) {
            if (this.character == character) {
                occurrenceNumber++;
            }
        }
        return occurrenceNumber;
    }

    public boolean isValid(String password) {
        return this.isValidOccurrenceNumber(this.findCharacterOccurrenceNumber(password));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordPolicy that = (PasswordPolicy) o;
        return Objects.equals(range, that.range) &&
                Objects.equals(character, that.character);
    }

    @Override
    public int hashCode() {
        return Objects.hash(range, character);
    }

    @Override
    public String toString() {
        return "PasswordPolicy{" +
                "range=" + range +
                ", character='" + character + '\'' +
                '}';
    }

}
