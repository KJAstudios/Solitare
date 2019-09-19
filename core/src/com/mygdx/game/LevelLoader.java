package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;

public class LevelLoader {

    private LevelHandler outputLevel;
    /**
     * LevelLoader handles the game information for a set level configuration
     *
     * @param levelType When constructed, it requires a string to designate the level it is going to load
     */
    LevelLoader(String levelType, LevelHandler inLevel) {
        outputLevel = inLevel;
        switch (levelType) {
            case "Standard": {
                /**
                 * creates the stacks of cards that comprise the main playing field
                 * then add the face down cards, then the single face up card
                 * then create the data storage for the upper row of cards
                 */
                for (int i = 0; i < 7; i++) {
                    levelStacks.add(new LevelStack());
                }
                for (int i = 1; i <= 6; i++) {
                    addCardToStack(i, i);
                }
                for (int i = 0; i < 7; i++) {
                    levelStacks.get(i).addFUCard(gameDeck.pullCard());
                }
                createFinishStacks();
                createMainDeck();
            }
        }
    }

    /**
     * addCardToStack is a function to create stacks of face down cards
     *
     * @param stackNum which stack in the level to place the cards
     * @param numCards the number of face down cards to place in the stack
     */
    private void addCardToStack(int stackNum, int numCards) {
        for (int i = 0; i < numCards; i++) {
            levelStacks.get(stackNum).addFDCard(gameDeck.pullCard());
        }
    }

    /**
     * createFinishStacks creates the top four finishing stacks at for the game
     */
    private void createFinishStacks() {
        for (int i = 0; i < 4; i++) {
            finishStacks.add(new LevelStack());
        }
    }

    /**
     * createMainDeck creates the deck of cards that you draw from, holding the cards that were not
     * part of the starting deal
     */
    private void createMainDeck() {
        for (int i = 0; i < gameDeck.remainingCards(); i++) {
            mainDeck.addFDCard(gameDeck.pullCard());
        }
    }
}
