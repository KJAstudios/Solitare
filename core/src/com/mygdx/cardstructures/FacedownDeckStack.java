package com.mygdx.cardstructures;

import java.util.Stack;

public class FacedownDeckStack extends BaseStack {

    private Stack<CardActor> stack;

    /**
     * sets the index of the stack
     * inits the card stack
     *
     * @param inIndex what to set the index to
     */
    public FacedownDeckStack(int inIndex) {
        super(inIndex);
        stack = new Stack<>();
    }

    /**
     * adds a card to the stack
     * @param card card to add
     */
    public void addCard(CardActor card) {
        stack.add(card);
    }

    /**
     * removes a card from the stack
     * @return card taken from stack
     */
    public CardActor getCard() {
        if (stack.isEmpty()) {
            return null;
        } else {
            CardActor returnCard = stack.pop();
            return returnCard;
        }
    }
}
