package com.mygdx.gameplayhandlers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.cardstructures.Deck;
import com.mygdx.cardstructures.FacedownStack;
import com.mygdx.cardstructures.FaceupStack;
import com.mygdx.game.SolitareMain;

import java.util.ArrayList;
import java.util.List;

public class LevelHandler {

    public Deck gameDeck;
    public List<FaceupStack> levelStacks;
    public List<FacedownStack> unplayedStacks;
    public FacedownStack mainDeck;


    public LevelHandler(String levelType, SolitareMain main) {
        gameDeck = new Deck();
        levelStacks = new ArrayList<>();
        unplayedStacks = new ArrayList<>();
        mainDeck = new FacedownStack(0);
        LevelLoader.loadLevel(levelType, this);
    }
}
