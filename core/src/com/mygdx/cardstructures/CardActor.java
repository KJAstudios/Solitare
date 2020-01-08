package com.mygdx.cardstructures;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Align;

/**
 * Extends Actor to hold PlayingCard data, and creates an image to use as the sprite for the card
 */
public class CardActor extends Image {


    private final int cardVal;
    private final int suitVal;
    private Texture texture;

    /**
     * constructor
     *
     * @param card card to build actor off of
     */
    public CardActor(PlayingCard card) {
        super(new Texture("cards/" + card.getCardVal() + card.getSuitVal() + ".png"));
        cardVal = card.getCardVal();
        suitVal = card.getSuitVal();
    }

    /**
     * getter
     * @return the card's value
     */
    public int getCardVal() {
        return cardVal;
    }

    /**
     * getter
     * @return the suit
     */
    public int getSuitVal() {
        return suitVal;
    }
}
