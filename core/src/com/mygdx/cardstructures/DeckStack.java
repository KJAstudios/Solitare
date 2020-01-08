package com.mygdx.cardstructures;

import java.util.List;

public class DeckStack {

    private FacedownDeckStack fdStack;
    private FaceupStack fuStack;

    /**
     * constructor
     * @param cardsIn cards to put in the remaining deck
     */
    //TODO add input management
    public DeckStack(List<CardActor> cardsIn){
        for(CardActor card : cardsIn){
        fdStack.addCard(card);
        }
    }
}

