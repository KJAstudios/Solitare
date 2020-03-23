package com.mygdx.gameplayhandlers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.cardstructures.*;
import com.mygdx.gameplayhandlers.inputhandlers.BaseInputProcessor;
import com.mygdx.renderers.LevelRenderer;
import com.mygdx.screens.GameScreen;

import java.util.List;

public class LevelHandler {

    private DeckStack mainDeck;
    private List<FaceupStack> aceStacks;
    private List<LevelStack> levelStacks;
    private Texture deckBack;
    private ActorHandler actorHandler;
    private BaseInputProcessor inputProcessor;
    private InputStack inputStack;

    /**
     * constructor
     *
     * @param screen the GameScreen to render on
     */
    public LevelHandler(GameScreen screen) {
        actorHandler = new ActorHandler(screen);
        deckBack = new Texture("test_back2.jpg");
        inputStack = new InputStack();
        LevelLoader.loadLevel(this, screen);
        LevelRenderer.renderLevel(actorHandler, this);
        Gdx.input.setInputProcessor(inputProcessor);
        actorHandler.addActorsToScreen();
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

    public InputStack getInputStack() {
        return inputStack;
    }
}