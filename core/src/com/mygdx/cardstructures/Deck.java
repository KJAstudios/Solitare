package com.mygdx.cardstructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<PlayingCard> fullDeck;
    private List<Integer> pulledCards;

    /**
     * when a Deck object is created, it automatically creates a full deck of 52 cards
     */
    public Deck() {
        fullDeck = new ArrayList<>();
        pulledCards = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 13; i2++) {
                PlayingCard tempCard = new PlayingCard(i2, i);
                fullDeck.add(tempCard);
            }
        }
    }

    /**
     * returns a random unique card from the current deck
     *
     * @return playingCard
     */
    /*
    when the function is called, sets cardPulled to true, then checks if the card that was pulled by randnum has
    already been pulled. if it has, it draws a new card and runs down the list again. if it reaches the end of the list
    and has not gotten a hit, then the card hasn't been pulled and is returned
     */
    public PlayingCard pullCard() {
        Random rand = new Random();
        int randNum = rand.nextInt(fullDeck.size());
        int i = 0;
        boolean cardPulled = true;
        while (cardPulled) {
            do {
                if (pulledCards.isEmpty() == false){
                    if(randNum == pulledCards.get(i)){
                        randNum = rand.nextInt(fullDeck.size());
                        i = 0;
                    }
                } else if (pulledCards.size() >= 52) {
                    return null;
                }
                i++;
            }
            while (i < pulledCards.size());
            pulledCards.add(randNum);
            return fullDeck.get(randNum);
        }
        return null;
    }

    /**
     * @return the current size of the deck
     */
    public int remainingCards() {
        return 52-pulledCards.size();
    }
}
