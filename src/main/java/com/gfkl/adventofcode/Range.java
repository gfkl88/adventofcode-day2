package com.gfkl.adventofcode;

import java.util.Objects;

public class Range {

    private int min;
    private int max;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public Range(String range) {
        String[] minAndMax = range.split("-");
        this.min = Integer.parseInt(minAndMax[0]);
        this.max = Integer.parseInt(minAndMax[1]);
    }

    public boolean isInRange(int number) {
        return number >= this.min && number <= this.max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Range range = (Range) o;
        return min == range.min &&
                max == range.max;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max);
    }

    @Override
    public String toString() {
        return "Range{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
