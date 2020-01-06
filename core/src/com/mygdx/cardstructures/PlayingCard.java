package com.mygdx.cardstructures;

import com.badlogic.gdx.graphics.Texture;

public class PlayingCard {
    final int cardVal;
    final int suitVal;
    final Texture cardFace;

    /**
     * creating a PlayingCard creates a card with a value and a suit
     *
     * @param inCVal      input for the card value
     * @param currentSuit input for the card suit
     */
    public PlayingCard(int inCVal, int currentSuit) {
        cardVal = inCVal;
        suitVal = currentSuit;
        cardFace = new Texture("cards/" + Integer.toString(inCVal) + Integer.toString(currentSuit)+ ".png");
    }

    /**
     * getter
     * @return card Value
     */
    public int getCardVal() {
        return cardVal;
    }

    /**
     * getter
     * @return card suit
     */
    public int getSuitVal() {
        return suitVal;
    }

    /**
     * getter
     * @return texture of card
     */
    public Texture getCardFace() {
        return cardFace;
    }
}
