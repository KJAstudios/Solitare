package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;

public class LevelLoader {

    private static LevelHandler outputLevel;
    private static Deck shuffleDeck;
    /**
     * LevelLoader handles the game information for a set level configuration
     *
     */
    LevelLoader() {

    }

    public static void loadLevel(String levelType, LevelHandler inLevel){
        outputLevel = inLevel;
        shuffleDeck = new Deck();
        switch (levelType) {
            case "Standard": {
                /**
                 * creates the stacks of cards that comprise the main playing field
                 * then add the face down cards, then the single face up card
                 * then create the data storage for the upper row of cards
                 */
                for (int i = 0; i < 7; i++) {
                    outputLevel.levelStacks.add(new LevelStack(i+5));
                }
                for (int i = 1; i <= 6; i++) {
                    addCardToStack(i, i);
                }
                for (int i = 0; i < 7; i++) {
                    outputLevel.levelStacks.get(i).addFUCard(shuffleDeck.pullCard());
                }
                createFinishStacks();
                createMainDeck();
                outputLevel.setBackTexture("test_back.png");
            }
        }
    }

    /**
     * addCardToStack is a function to create stacks of face down cards
     *
     * @param stackNum which stack in the level to place the cards
     * @param numCards the number of face down cards to place in the stack
     */
    private static void addCardToStack(int stackNum, int numCards) {
        for (int i = 0; i < numCards; i++) {
            outputLevel.levelStacks.get(stackNum).addFDCard(shuffleDeck.pullCard());
        }
    }

    /**
     * createFinishStacks creates the top four finishing stacks at for the game
     */
    private static void createFinishStacks() {
        for (int i = 0; i < 4; i++) {
            outputLevel.finishStacks.add(new LevelStack(i));
        }
    }

    /**
     * createMainDeck creates the deck of cards that you draw from, holding the cards that were not
     * part of the starting deal
     */
    private static void createMainDeck() {
        for (int i = 0; i < shuffleDeck.remainingCards(); i++) {
            outputLevel.mainDeck.addFDCard(shuffleDeck.pullCard());
        }
    }
}
