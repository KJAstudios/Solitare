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
            for (int i2 = 0; i < 13; i++) {
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
        for (int i = 0; i < pulledCards.size(); i++) {
            if (randNum == pulledCards.get(i)) {
                randNum=rand.nextInt(fullDeck.size());
                i=0;
            }
            else if(pulledCards.size()==52){
                return null;
            }
            else{
                pulledCards.add(i);
                return fullDeck.get(i);
            }
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
