package com.mygdx.screens;

import com.mygdx.cardstructures.CardActor;
import com.mygdx.cardstructures.PlayingCard;

public class GameScreen extends AbstractScreen {

    private CardActor card;

    /**
     * constructor
     */
    public GameScreen(){
        super();
        card = new CardActor(new PlayingCard(0, 0));
    }

    /**
     * add all the actors necessary to render
     */
    //TODO get this running with levelhandler and levelloader
    @Override
    public void buildStage() {
        addActor(card.getImage());
    }
}
