package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import java.util.ArrayList;
import java.util.List;

public class LevelHandler implements Screen{

    public Deck gameDeck;
    public List<LevelStack> levelStacks;
    public List<LevelStack> finishStacks;
    public LevelStack mainDeck;
    private Deck refDeck;
    private Texture backTexture;
    private Sprite cardBacks;
    private SolitareMain main;

    LevelHandler(String levelType, SolitareMain main){
        gameDeck = new Deck();
        refDeck = new Deck();
        levelStacks = new ArrayList<>();
        finishStacks = new ArrayList<>();
        mainDeck = new LevelStack(4);
        LevelLoader.loadLevel(levelType, this);
        cardBacks = new Sprite(new Texture("test_back.jpg"));
        this.main = main;
    }

    public PlayingCard getCard(int cardIndex){
        return refDeck.whatCard(cardIndex);
    }

    public void takeCards(){
        LevelStack takeStack = determineClickedStack();
    }

    public void setBackTexture(String inTexture){
        backTexture = new Texture(inTexture);
    }

    public LevelStack determineClickedStack(){
        //TODO write code for determining what LevelStack the mouse is currently over
        return null;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        main.batch.begin();
        main.batch.draw(cardBacks.getTexture(), 0, 0);
        main.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
