package com.mygdx.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public abstract class AbstractScreen extends Stage implements Screen {

    protected AbstractScreen(){
        super(new ScreenViewport(new OrthographicCamera()));
    }

    public abstract void buildStage();

    /**
     * render overide for stage
      * @param delta
     */
    @Override
    public void render(float delta) {
        // Clear screen
        Gdx.gl.glClearColor(0, 1, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Calling to Stage methods
        super.act(delta);
        super.draw();
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override public void pause() {}
    @Override public void resume() {}
    @Override public void hide() {}
}
