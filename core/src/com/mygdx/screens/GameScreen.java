package com.mygdx.screens;

import com.mygdx.cardstructures.CardActor;
import com.mygdx.cardstructures.Deck;
import com.mygdx.gameplayhandlers.LevelHandler;

import java.util.ArrayList;
import java.util.List;

public class GameScreen extends AbstractScreen {

    private CardActor card;
    private List<CardActor> cardList;
    private LevelHandler level;

    /**
     * constructor
     */
    public GameScreen() {
        super();
        cardList = new ArrayList<>();
        Deck deck = new Deck();
        for(int i = 0; i < 52; i ++){
            cardList.add(new CardActor(deck.pullCard()));
        }
    }

    /**
     * add all the actors necessary to render
     */
    @Override
    public void buildStage() {
        level = new LevelHandler(this);
    }
}
