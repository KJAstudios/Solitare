package com.mygdx.cardstructures;

public class PlayingCard {
    final int cardVal;
    final int suitVal;

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
}
