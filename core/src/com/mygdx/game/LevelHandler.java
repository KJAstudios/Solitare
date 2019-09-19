package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;

public class LevelHandler {

    private Deck gameDeck;
    private List<LevelStack> levelStacks;
    private List<LevelStack> finishStacks;
    private LevelStack mainDeck;

    LevelHandler(){
        gameDeck = new Deck();
        levelStacks = new ArrayList<>();
        finishStacks = new ArrayList<>();
        mainDeck = new LevelStack();

    }
}
