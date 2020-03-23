package com.mygdx.cardstructures;

import java.util.ArrayList;
import java.util.List;

public class InputStack {
    private ArrayList<CardActor> stack;
    private float x;
    private float y;

    /**
     * constructor
     */
    public InputStack() {
        stack = new ArrayList<>();
    }

    /**
     * adds a single card to the stack
     *
     * @param card card to add
     */
    public void addCard(CardActor card) {
        stack.add(card);
    }

    /**
     * adds a stack of cards to this stack
     *
     * @param cardStack stack of cards to add to stack
     */
    public void addCard(List<CardActor> cardStack) {
        stack.addAll(cardStack);
    }

    /**
     * gets cards selected from stack
     *
     * @return cards to remove from this stack
     */
    public List<CardActor> getCards() {
        List<CardActor> returnStack = new ArrayList<>();
        //TODO add selection data based off of mouse input
        return returnStack;
    }

    /**
     * update function for the stack location
     *
     * @return
     */
    public void updateCoords(int touchX, int touchY) {
        x = touchX;
        y = touchY;
        if (!stack.isEmpty()) {
            for (CardActor card : stack) {
                card.setX(x);
                card.setY(y);
            }
        }

    }
}
