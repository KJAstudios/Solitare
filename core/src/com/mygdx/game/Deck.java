package com.mygdx.game;

import java.util.ArrayList;

public class Deck {

    ArrayList<PlayingCard> fullDeck = new ArrayList<>();

    /**
     * when a Deck object is created, it automatically creates a full deck of 52 cards
     *
     */
    Deck() {
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i < 13; i++) {
                PlayingCard tempCard = new PlayingCard(i2, i);
                fullDeck.add(tempCard);
            }
        }
    }
}
