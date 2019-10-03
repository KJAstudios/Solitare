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
    //TODO figure out checking method
    public int pullCard() {
        Random rand = new Random();
        boolean cardPulled = false;
        int randNum = rand.nextInt(fullDeck.size());
        for(int i = 0; i<pulledCards.size(); i++){
            if(randNum == pulledCards.get(i)){
                cardPulled = true;
                break;
            }
        }
        if(!cardPulled){
        pulledCards.add(randNum);
        return randNum;}
        else if (cardPulled){
        }
    }

    /**
     *
     * @return the current size of the deck
     */
    public int remainingCards() {
        return fullDeck.size();
    }

    /**
     * find what card you have
     * @param cardIndex the card you're trying to get
     * @return the PlayingCard that you gave the cardIndex of
     */
    public PlayingCard whatCard(int cardIndex){
        return fullDeck.get(cardIndex);
    }
}
