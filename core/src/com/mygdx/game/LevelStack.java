package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LevelStack {
    Stack<Integer> cardBacks;
    List<Integer> cardFronts;

    LevelStack() {
        cardFronts = new ArrayList<>();
    }

    public void addFDCard(int cardNumber) {
        cardBacks.push(cardNumber);
    }

    public void addFUCard(int cardNumber) {
        cardFronts.add(cardNumber);
    }
}
