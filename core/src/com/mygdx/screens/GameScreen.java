package com.mygdx.screens;

import com.mygdx.cardstructures.CardActor;
import com.mygdx.cardstructures.Deck;
import com.mygdx.cardstructures.PlayingCard;

import java.util.ArrayList;
import java.util.List;

public class GameScreen extends AbstractScreen {

    private CardActor card;
    private List<CardActor> cardList;

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
    //TODO get this running with levelhandler and levelloader
    @Override
    public void buildStage() {
        for(int i = 0; i <52; i++){
            CardActor actor = cardList.get(i);
            actor.setPosition(i+(i*15), 0);
            actor.setScale(0.3f);
            addActor(actor);
        }
    }
}
