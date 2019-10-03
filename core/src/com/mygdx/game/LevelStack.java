package com.mygdx.game;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LevelStack {
    Deque<Integer> cardBacks;
    List<Integer> cardFronts;
    int stackNumber;

    LevelStack(int inSNum) {
        cardFronts = new ArrayList<>();
        cardBacks = new ArrayDeque<>();
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
