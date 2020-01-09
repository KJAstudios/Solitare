package com.mygdx.cardstructures;

import java.util.Stack;

public class FacedownStack extends BaseStack {
    //TODO add coordinates for location on screen
    private Stack<PlayingCard> stack;
    private int x;
    private int y;

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
     *
     * @param card card to add
     */
    public void addCard(PlayingCard card) {
        stack.add(card);
    }

    /**
     * removes a card from the stack
     *
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

    /**
     * getters and setters for xy locations
     */
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
