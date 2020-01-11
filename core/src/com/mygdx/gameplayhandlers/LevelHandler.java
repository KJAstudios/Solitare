package com.mygdx.gameplayhandlers;

import com.mygdx.cardstructures.*;
import com.mygdx.renderers.LevelRenderer;
import com.mygdx.screens.GameScreen;

import java.util.List;

public class LevelHandler {
    private DeckStack mainDeck;
    private List<FaceupStack> aceStacks;
    private List<LevelStack> levelStacks;

    /**
     * constructor
     *
     * @param screen the GameScreen to render on
     */
    public LevelHandler(GameScreen screen) {
        LevelLoader.loadLevel(this);
        LevelRenderer.renderLevel(screen, this);

    }


    /**
     * all of the setters for initial setup of level
     */


    public void setLevelStacks(List<LevelStack> inList) {
        levelStacks = inList;
    }


    public void setMainDeck(List<CardActor> inList) {
        mainDeck = new DeckStack(inList);
    }

    public void setAceStacks(List<FaceupStack> aceStacks) {
        this.aceStacks = aceStacks;
    }

}

