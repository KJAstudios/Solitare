package com.mygdx.gameplayhandlers.inputhandlers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.gameplayhandlers.ActorHandler;

public class BaseInputProcessor implements com.badlogic.gdx.InputProcessor {
    private ActorHandler actorHandler;
    private Image image;
    public BaseInputProcessor(ActorHandler actorHandler){
        this.actorHandler = actorHandler;
        image = new Image(new Texture("test_back2.jpg"));
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
        image.setY(screenY);
        actorHandler.addActor(image);
        actorHandler.addActorsToScreen();
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
