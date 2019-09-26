package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<PlayingCard> fullDeck;

    /**
     * Constructor
     * when a Deck object is created, it automatically creates a full deck of 52 cards
     */
    Deck() {
        fullDeck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i < 13; i++) {
                PlayingCard tempCard = new PlayingCard(i2, i);
                fullDeck.add(tempCard);
            }
        }
    }

    /**
     * returns a random card from the current deck, and removes it from the total deck
     *
     * @return a random index number
     */
    public int pullCard() {
        Random rand = new Random();
        int randNum = rand.nextInt(fullDeck.size());
        fullDeck.remove(randNum);
        return randNum;
    }

    /**
     * returns the amount of cards remaining in the deck
     *
     * @return the current size of the deck
     */
    public int remainingCards() {
        return fullDeck.size();
    }

    /**
     * used to get the actual value of a card in the deck
     *
     * @param cardIndex input the index of the card you're looking for
     * @return returns the PlayingCard held at the cardIndex given
     */
    public PlayingCard whatCard(int cardIndex) {
        return fullDeck.get(cardIndex);
    }
}
