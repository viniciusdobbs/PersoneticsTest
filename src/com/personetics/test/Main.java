package com.personetics.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {36, 6, 24, 4, 47, 7, 2, 3, 27};

        String[] letters = {"p", "aba", "a", "b", "perso", "o", "r", "e", "s"};

        List<Node> numberList = new ArrayList<>();
        List<Node> wordList = new ArrayList<>();
        ChainValidator validator = new ChainValidator();

        //for add number nodes on list
        for (int i = 0; i < numbers.length; i++){
            NumberNode n = new NumberNode(numbers[i]);
            numberList.add(n);
        }

        //for add letters nodes on list
        for (int i = 0; i < letters.length; i++){
            LetterNode l = new LetterNode(letters[i]);
            wordList.add(l);
        }

        //print true or false validation based on numberList
        System.out.println(validator.validate(numberList));

        //print true or false validation based on  wordList
        System.out.println(validator.validate(wordList));
    }
}
