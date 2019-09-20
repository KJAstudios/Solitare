package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LevelStack {
    Stack<Integer> cardBacks;
    List<Integer> cardFronts;
    int stackNumber;

    LevelStack(int inSNum) {
        cardFronts = new ArrayList<>();
        stackNumber = inSNum;
    }

    public void addFDCard(int cardNumber) {
        cardBacks.push(cardNumber);
    }

    public void addFUCard(int cardNumber) {
        cardFronts.add(cardNumber);
    }

    public int getStackIndex(){
        return stackNumber;
    }
}
