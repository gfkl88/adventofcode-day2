package com.gfkl.adventofcode.rule;

public abstract class Rule {

    public static final String RULE_SEPARATOR = "-";
    public static final int SPLIT_RIGHT_SIDE = 1;
    public static final int SPLIT_LEFT_SIDE = 0;

    protected int firstValue;
    protected int secondValue;

    protected Rule(String values) {
        this.firstValue = getValue(values, SPLIT_LEFT_SIDE);
        this.secondValue = getValue(values, SPLIT_RIGHT_SIDE);
    }

    protected boolean areCharactersMatching(char toCompare, char comparator) {
        return toCompare == comparator;
    }

    private int getValue(String positions, int splitSide) {
        return Integer.parseInt(positions.split(RULE_SEPARATOR)[splitSide]);
    }


    abstract public boolean isValid(String password, char character);

}
