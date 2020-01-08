package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.gameplayhandlers.LevelHandler;
import com.mygdx.screens.GameScreen;

public class SolitareMain extends Game {
    public SpriteBatch batch;

    //TODO currently set to a single screen, needs menus and menu handlers
    @Override
    public void create() {
        GameScreen mainScreen = new GameScreen();
        mainScreen.buildStage();
        this.setScreen(mainScreen);
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
    }
}
