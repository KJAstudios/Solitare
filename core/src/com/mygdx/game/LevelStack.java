package com.mygdx.game;

import java.util.ArrayList;
import java.util.Stack;

public class LevelStack {
    Stack<Integer> cardBacks;
    ArrayList<Integer> cardFronts = new ArrayList<>();

    LevelStack() {

    }

    public void addFDCard(int cardNumber){
        cardBacks.push(cardNumber);
    }

    public void addFUCard(int cardNumber){
        cardFronts.add(cardNumber);
    }
}
