package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;

public class LevelHandler {

    public Deck gameDeck;
    public List<LevelStack> levelStacks;
    public List<LevelStack> finishStacks;
    public LevelStack mainDeck;
    private Deck refDeck;

    LevelHandler(String levelType){
        gameDeck = new Deck();
        refDeck = new Deck();
        levelStacks = new ArrayList<>();
        finishStacks = new ArrayList<>();
        mainDeck = new LevelStack(4);
        LevelLoader.loadLevel(levelType, this);
    }

    public PlayingCard getCard(int cardIndex){
        return refDeck.whatCard(cardIndex);
    }

    public void takeCards(){
        LevelStack takeStack = determineClickedStack();

    }

    public LevelStack determineClickedStack(){
        //TODO write code for determining what LevelStack the mouse is currently over
        return null;
    }
}
