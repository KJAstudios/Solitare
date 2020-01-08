package com.mygdx.gameplayhandlers;

import com.mygdx.cardstructures.Deck;
import com.mygdx.cardstructures.FacedownStack;
import com.mygdx.cardstructures.FaceupStack;
import com.mygdx.screens.GameScreen;

import java.util.ArrayList;
import java.util.List;

public class LevelHandler {

    private Deck gameDeck;
    private List<FaceupStack> levelStacks;
    private List<FacedownStack> unplayedStacks;
    private FacedownStack mainDeck;

    /**
     * constructor
     * @param levelType what level to generate
     * @param screen the GameScreen to render on
     */
    public LevelHandler(String levelType, GameScreen screen) {
        gameDeck = new Deck();
        levelStacks = new ArrayList<>();
        unplayedStacks = new ArrayList<>();
        mainDeck = new FacedownStack(0);
        LevelLoader.loadLevel(levelType, this);
    }
}
