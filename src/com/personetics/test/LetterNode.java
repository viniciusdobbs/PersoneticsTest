package com.personetics.test;

public class LetterNode implements Node{
    private final String word;

    public LetterNode(String word) {
        this.word = word;
    }
    public String getWord() {
        return word;
    }
    @Override
    public int getValue() {
        return 0;
    }
}
