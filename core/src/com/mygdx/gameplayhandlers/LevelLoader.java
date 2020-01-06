package com.mygdx.gameplayhandlers;


import com.mygdx.cardstructures.Deck;
import com.mygdx.gameplayhandlers.LevelHandler;

public class LevelLoader {

    private static LevelHandler outputLevel;
    private static Deck shuffleDeck;

    /**
     * LevelLoader handles the game information for a set level configuration
     */
    LevelLoader() {

    }

    public static void loadLevel(String levelType, LevelHandler inLevel) {
        outputLevel = inLevel;
        shuffleDeck = new Deck();
        switch (levelType) {
            /**
             * creates the stacks of cards that comprise the main playing field
             * then add the face down cards, then the single face up card
             * then create the data storage for the upper row of cards
             */
        }
    }

    /**
     * addCardToStack is a function to create stacks of face down cards
     *
     * @param stackNum which stack in the level to place the cards
     * @param numCards the number of face down cards to place in the stack
     */
    private static void addCardToStack(int stackNum, int numCards) {

    }

    /**
     * createFinishStacks creates the top four finishing stacks at for the game
     */
    private static void createFinishStacks() {

    }

    /**
     * createMainDeck creates the deck of cards that you draw from, holding the cards that were not
     * part of the starting deal
     */
    private static void createMainDeck() {

    }
}
