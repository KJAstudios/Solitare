package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    List<PlayingCard> fullDeck;
    List<Integer> pulledCards;

    /**
     * when a Deck object is created, it automatically creates a full deck of 52 cards
     */
    Deck() {
        fullDeck = new ArrayList<>();
        pulledCards = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i < 13; i++) {
                PlayingCard tempCard = new PlayingCard(i2, i);
                fullDeck.add(tempCard);
            }
        }
    }

    /**
     * returns a random unique card from the current deck
     *
     * @return
     */
    /*
    when the function is called, sets cardPulled to true, then checks if the card that was pulled by randnum has
    already been pulled. if it has, it draws a new card and runs down the list again. if it reaches the end of the list
    and has not gotten a hit, then the card hasn't been pulled and is returned
     */
    public int pullCard() {
        Random rand = new Random();
        boolean cardPulled = true;
        int randNum = rand.nextInt(fullDeck.size());
        while (cardPulled) {
            for (int i = 0; i < pulledCards.size(); i++) {
                if (randNum == pulledCards.get(i)) {
                    randNum = rand.nextInt(fullDeck.size());
                    break;
                } else if (i == pulledCards.size() - 1 && cardPulled) {
                    pulledCards.add(randNum);
                    return randNum;
                }
            }
        }
        return 60;
    }

    /**
     * @return the current size of the deck
     */
    public int remainingCards() {
        return fullDeck.size();
    }

    /**
     * find what card you have
     *
     * @param cardIndex the card you're trying to get
     * @return the PlayingCard that you gave the cardIndex of
     */
    public PlayingCard whatCard(int cardIndex) {
        if (cardIndex == 60) {
            return null;
        } else {
            return fullDeck.get(cardIndex);
        }
    }
}
