package com.personetics.test;

import java.util.*;

public class ChainValidator {
    boolean validate(List<Node> nodes) {
        Set<Character> singleCharacters = new HashSet<>();
        Set<Integer> singleDigits = new HashSet<>();
        Set<Node> multiNodes = new HashSet<>();

        // Separate nodes into single and multiple digits
        for (Node n: nodes) {
            if (n instanceof NumberNode) {
                if (n.getValue() < 10) {
                    singleDigits.add(n.getValue());
                }
                else {
                    multiNodes.add(n);
                }
            }
            else if (n instanceof LetterNode) {
                if (n.getWord().length() == 1) {
                    singleCharacters.add(n.getWord().charAt(0));
                }
                else {
                    multiNodes.add(n);
                }
            }
        }

        // Validate multiple digits nodes
        for (Node n : multiNodes) {
            if (n instanceof NumberNode) {
                String valueStr = Integer.toString(n.getValue());
                for (char c : valueStr.toCharArray()) {
                    if (!singleDigits.contains(Character.getNumericValue(c))) {
                        return false;
                    }
                }
            }
            else if (n instanceof LetterNode) {
                for (char c : n.getWord().toCharArray()) {
                    if (!singleCharacters.contains(c)) {
                        return false;
                    }
                }
            }
        }
        return true;

    }
}
