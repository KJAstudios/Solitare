package com.mygdx.cardstructures;

import java.util.Stack;

public class FacedownStack extends BaseStack {
    //TODO add coordinates for location on screen
    private Stack<PlayingCard> stack;
    private float x;
    private float y;

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
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    /**
     * getter for rendering
     */
    public Stack<PlayingCard> getStack() {
        return stack;
    }
}
