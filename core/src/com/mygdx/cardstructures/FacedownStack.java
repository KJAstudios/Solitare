package com.mygdx.cardstructures;

import java.util.Stack;

public class FacedownStack extends BaseStack {

    private Stack<PlayingCard> stack;

    /**
     * sets the index of the stack
     * inits the card stack
     *
     * @param inIndex what to set the index to
     */
    public FacedownStack(int inIndex) {
        super(inIndex);
        stack = new Stack<>();
    }

    /**
     * adds a card to the stack
     * @param card card to add
     */
    public void addCard(PlayingCard card) {
        stack.add(card);
    }

    /**
     * removes a card from the stack
     * @return card taken from stack
     */
    public PlayingCard getCard() {
        if (stack.isEmpty()) {
            return null;
        } else {
            PlayingCard returnCard = stack.pop();
            return returnCard;
        }
    }
}
