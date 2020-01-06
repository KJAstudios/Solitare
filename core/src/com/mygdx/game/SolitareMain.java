package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.gameplayhandlers.LevelHandler;
import com.mygdx.screens.GameScreen;

public class SolitareMain extends Game {
    public SpriteBatch batch;
    Texture img;

    //TODO currently set to a single screen, needs menus and menu handlers
    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("test_back.jpg");
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
        batch.dispose();
        img.dispose();
    }
}
