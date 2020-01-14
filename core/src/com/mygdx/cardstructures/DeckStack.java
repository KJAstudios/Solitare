package com.mygdx.cardstructures;

import java.util.List;

public class DeckStack {

    private FacedownDeckStack fdStack;
    private FaceupStack fuStack;

    private int x;
    private int y;

    /**
     * constructor
     *
     * @param cardsIn cards to put in the remaining deck
     */
    //TODO add input management
    //TODO add coordinates for location on screen
    public DeckStack(List<CardActor> cardsIn) {
            for (CardActor card : cardsIn) {
                try {
                    fdStack.addCard(card);
                }catch(NullPointerException e){

                }
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

