package com.mygdx.gameplayhandlers;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.cardstructures.CardActor;
import com.mygdx.cardstructures.DeckStack;
import com.mygdx.cardstructures.FaceupStack;
import com.mygdx.cardstructures.LevelStack;
import com.mygdx.renderers.LevelRenderer;
import com.mygdx.screens.GameScreen;

import java.util.List;

public class LevelHandler {

    private DeckStack mainDeck;
    private List<FaceupStack> aceStacks;
    private List<LevelStack> levelStacks;
    private Texture deckBack;

    /**
     * constructor
     *
     * @param screen the GameScreen to render on
     */
    public LevelHandler(GameScreen screen) {
        deckBack = new Texture("test_back2.jpg");
        LevelLoader.loadLevel(this, screen);
        LevelRenderer.renderLevel(screen, this);

    }


    /**
     * all of the setters for initial setup of level
     */


    public void setLevelStacks(List<LevelStack> inList) {
        levelStacks = inList;
    }


    public void setMainDeck(List<CardActor> inList) {
        mainDeck = new DeckStack(inList, deckBack);
    }

    public void setAceStacks(List<FaceupStack> aceStacks) {
        this.aceStacks = aceStacks;
    }

    /**
     * getters for rendering purposes
     *
     * @return
     */

    public DeckStack getMainDeck() {
        return mainDeck;
    }

    public List<FaceupStack> getAceStacks() {
        return aceStacks;
    }

    public List<LevelStack> getLevelStacks() {
        return levelStacks;
    }

    public Texture getDeckBack() {
        return deckBack;
    }
}