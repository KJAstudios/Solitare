package com.mygdx.gameplayhandlers;

import com.mygdx.cardstructures.CardActor;
import com.mygdx.cardstructures.DeckStack;
import com.mygdx.cardstructures.FacedownStack;
import com.mygdx.cardstructures.FaceupStack;
import com.mygdx.screens.GameScreen;

import java.util.ArrayList;
import java.util.List;

public class LevelHandler {
    private List<FaceupStack> fuStacks;
    private List<FacedownStack> fdStacks;
    private DeckStack mainDeck;
    private List<FaceupStack> aceStacks;

    /**
     * constructor
     *
     * @param screen the GameScreen to render on
     */
    public LevelHandler(GameScreen screen) {
        LevelLoader.loadLevel(this);
    }


    /**
     * all of the setters for initial setup of level
     */
    public void setFUStacks(List<FaceupStack> inList) {
        inList = fuStacks;

    }

    public void setFDStacks(List<FacedownStack> inList) {
        inList = fdStacks;
    }

    public void setMainDeck(List<CardActor> inList) {
        mainDeck = new DeckStack(inList);
    }

    public void setAceStacks(List<FaceupStack> aceStacks) {
        this.aceStacks = aceStacks;
    }
}
