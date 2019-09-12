package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    List<PlayingCard> fullDeck = new ArrayList<>();

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

    /**
     * returns a random card from the current deck, and removes it from the total deck
     * @return
     */
    public int pullCard(){
        Random rand = new Random();
        int randNum = rand.nextInt(fullDeck.size());
        fullDeck.remove(randNum);
        return randNum;
    }
}
