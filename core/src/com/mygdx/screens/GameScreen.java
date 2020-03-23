package com.mygdx.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.cardstructures.CardActor;
import com.mygdx.gameplayhandlers.CoordinateHandler;
import com.mygdx.gameplayhandlers.LevelHandler;
import com.mygdx.gameplayhandlers.inputhandlers.InputHandler;
import com.mygdx.listeners.updateListener;

import java.util.List;

public class GameScreen extends AbstractScreen implements InputProcessor {

    private List<CardActor> cardList;
    private LevelHandler level;
    private Image image;
    private updateListener listener;

    /**
     * constructor
     */
    public GameScreen() {
        super();
        image = new Image(new Texture("test_back2.jpg"));
    }

    /**
     * add all the actors necessary to render
     */
    @Override
    public void buildStage() {
        level = new LevelHandler(this);
        listener = new updateListener(level);
    }

    @Override
    public void render(float delta) {
        // Clear screen
        Gdx.gl.glClearColor(0, 1, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //tell the listener to listen for updates
        listener.listen();

        // Calling to Stage methods
        super.act(delta);
        super.draw();
    }

    @Override
    public void resize(int width, int height) {
        getViewport().update(width, height, true);
        CoordinateHandler.updateCardScale(this);


    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        InputHandler.touchDown(level, screenX, screenY);
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        InputHandler.touchUp(level, screenX, screenY);
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        InputHandler.touchDragged(level, screenX, screenY);
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
