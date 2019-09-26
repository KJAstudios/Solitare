package com.mygdx.game;

public class PlayingCard {
    int cardVal;
    int suitVal;

    /**
     * creating a PlayingCard creates a card with a value and a suit
     *
     * @param inCVal      input for the card value
     * @param currentSuit input for the card suit
     */
    PlayingCard(int inCVal, int currentSuit) {
        cardVal = inCVal;
        suitVal = currentSuit;
    }
}
