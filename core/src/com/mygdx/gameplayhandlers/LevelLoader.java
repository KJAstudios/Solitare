package com.mygdx.gameplayhandlers;

import com.mygdx.cardstructures.*;
import com.mygdx.screens.GameScreen;

import java.util.ArrayList;
import java.util.List;

public class LevelLoader {

    private static LevelHandler outputLevel;
    private static Deck shuffleDeck;
    private static GameScreen screen;

    /**
     * LevelLoader.loadLevel handles the game information for a set level configuration
     */
    public static void loadLevel(LevelHandler inLevel, GameScreen inScreen) {
        outputLevel = inLevel;
        shuffleDeck = new Deck();
        screen = inScreen;
        deal();
        createAceStacks();
        //must happen last
        createMainDeck();
        CoordinateHandler.setRenderCoords(screen, outputLevel);
    }

    /**
     * deal creates LevelStacks for the level being created
     */
    private static void deal() {
        List<FaceupStack> fuStacks = dealFUCards();
        List<FacedownStack> fdStacks = dealFDCards();
        List<LevelStack> outStacks = new ArrayList<>();
        for (int i = 0; i < fuStacks.size(); i++) {
            outStacks.add(new LevelStack(fuStacks.get(i), fdStacks.get(i), outputLevel.getDeckBack()));
        }
        outputLevel.setLevelStacks(outStacks);
    }

    /**
     * deals the face up cards seen at the start of a round
     */
    private static List<FaceupStack> dealFUCards() {
        List<FaceupStack> stacks = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            FaceupStack tempStack = new FaceupStack(i);
            CardActor tempActor = new CardActor(shuffleDeck.pullCard());
            tempActor.setScale(0.2f);
            tempStack.addCard(tempActor);
            stacks.add(tempStack);
        }
        return stacks;
    }


    /**
     * deals the face down cards seen at the start of the round
     */
    private static List<FacedownStack> dealFDCards() {
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
        return stacks;
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
        int test = shuffleDeck.remainingCards();
        for (int i = 0; i < shuffleDeck.remainingCards(); i++) {
            remCards.add(new CardActor(shuffleDeck.pullCard()));
        }
        outputLevel.setMainDeck(remCards);
    }


}
