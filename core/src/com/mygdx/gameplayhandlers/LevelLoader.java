package com.mygdx.gameplayhandlers;


import com.mygdx.cardstructures.*;

import java.util.ArrayList;
import java.util.List;

public class LevelLoader {

    private static LevelHandler outputLevel;
    private static Deck shuffleDeck;

    /**
     * LevelLoader.loadLevel handles the game information for a set level configuration
     */
    public static void loadLevel(LevelHandler inLevel) {
        outputLevel = inLevel;
        shuffleDeck = new Deck();
        dealFUCards();
        dealFDCards();
        createAceStacks();
        //must happen last
        createMainDeck();
    }

    /**
     * deals the face up cards seen at the start of a round
     */
    private static void dealFUCards() {
        List<FaceupStack> stacks = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            FaceupStack tempStack = new FaceupStack(i);
            tempStack.addCard(new CardActor(shuffleDeck.pullCard()));
            stacks.add(tempStack);
        }
        outputLevel.setFUStacks(stacks);
    }

    /**
     * deals the face down cards seen at the start of the round
     */
    private static void dealFDCards() {
        List<FacedownStack> stacks = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            if (i != 0) {

                FacedownStack tempStack = new FacedownStack(i);
                for (int i2 = 0; i2 < i; i2++) {
                    tempStack.addCard(shuffleDeck.pullCard());
                }
                stacks.add(tempStack);
            } else {
                stacks.add(new FacedownStack(i));
            }
        }
        outputLevel.setFDStacks(stacks);
    }

    /**
     * createAceStacks creates the top four finishing stacks for the game
     */
    private static void createAceStacks() {
        List<FaceupStack> aceStacks = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            aceStacks.add(new FaceupStack(i));
        }
        outputLevel.setAceStacks(aceStacks);
    }

    /**
     * createMainDeck creates the deck of cards that you draw from, holding the cards that were not
     * part of the starting deal
     */
    private static void createMainDeck() {
        List<CardActor> remCards = new ArrayList<>();
        for (int i = 0; i < shuffleDeck.remainingCards(); i++) {
            remCards.add(new CardActor(shuffleDeck.pullCard()));
        }
        outputLevel.setMainDeck(remCards);
    }
}
