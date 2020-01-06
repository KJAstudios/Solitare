package com.mygdx.cardstructures;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Align;

/**
 * Extends Actor to hold PlayingCard data, and creates an image to use as the sprite for the card
 */
public class CardActor extends Actor {


    private final int cardVal;
    private final int suitVal;
    private Image image;

    /**
     * constructor
     * @param card card to build actor off of
     */
    public CardActor(PlayingCard card){
        image = new Image(new Texture(textureString(card)));
        cardVal = card.getCardVal();
        suitVal = card.getSuitVal();
        image.setPosition(0, 0);
    }

    /**
     * creates the string for the image file
     * @param inCard card to get
     * @return the string of the location of the correct .png file for the card
     */
    private String textureString(PlayingCard inCard){
         String string = "cards/" + inCard.getCardVal() + inCard.getSuitVal() + ".png";
         return string;
     }


    public Image getImage() {
        return image;
    }


    public int getCardVal() {
        return cardVal;
    }

    public int getSuitVal() {
        return suitVal;
    }
}
