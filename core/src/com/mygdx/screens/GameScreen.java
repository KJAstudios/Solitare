package com.mygdx.screens;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.cardstructures.CardActor;
import com.mygdx.gameplayhandlers.CoordinateHandler;
import com.mygdx.gameplayhandlers.LevelHandler;

import java.util.List;

public class GameScreen extends AbstractScreen implements InputProcessor {

    private List<CardActor> cardList;
    private LevelHandler level;
    private Image image;

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
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {

        image.setX(screenX);
        image.setY(-screenY);
        this.addActor(image);
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
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
