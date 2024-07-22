package com.personetics.test;

public class NumberNode implements Node{
    private final int value;

    public NumberNode(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    @Override
    public String getWord() {
        return null;
    }
}
