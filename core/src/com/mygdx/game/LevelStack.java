package com.mygdx.game;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LevelStack {
    Deque<Integer> cardBacks;
    List<Integer> cardFronts;
    int stackNumber;

    /**
     * Constructor
     *
     * @param inSNum defines the unique index of the stack, so that it can be found when manipulating the game
     */
    LevelStack(int inSNum) {
        cardFronts = new ArrayList<>();
        cardBacks = new ArrayDeque<>();
        stackNumber = inSNum;
    }

    /**
     * adds a face down card to the cardBacks stack
     *
     * @param cardNumber the index of the card being added
     */
    public void addFDCard(int cardNumber) {
        cardBacks.push(cardNumber);
    }

    /**
     * adds a face up card to the cardFronts list, to hold cards visible to the player
     *
     * @param cardNumber the index of the card being added
     */
    public void addFUCard(int cardNumber) {
        cardFronts.add(cardNumber);
    }

    /**
     * returns the stack index for identification
     *
     * @return the index of the stack
     */
    public int getStackIndex() {
        return stackNumber;
    }
}
