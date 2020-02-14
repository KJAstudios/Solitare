package com.mygdx.screens;

import com.mygdx.cardstructures.CardActor;
import com.mygdx.gameplayhandlers.CoordinateHandler;
import com.mygdx.gameplayhandlers.LevelHandler;

import java.util.List;

public class GameScreen extends AbstractScreen {

    private List<CardActor> cardList;
    private LevelHandler level;

    /**
     * constructor
     */
    public GameScreen() {
        super();
    }

    /**
     * add all the actors necessary to render
     */
    @Override
    public void buildStage() {
        level = new LevelHandler(this);
    }

    @Override
    public void resize(int width, int height) {
        getViewport().update(width, height, true);
        CoordinateHandler.updateCardScale(this);
    }
}
