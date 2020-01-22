package com.mygdx.cardstructures;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.util.List;

public class DeckStack {

    private FacedownDeckStack fdStack;
    private FaceupStack fuStack;
    private Image backImage;
    private final int index;

    private float fdX;
    private float fdY;
    private float fuX;
    private float fuY;

    /**
     * constructor
     *
     * @param cardsIn cards to put in the remaining deck
     */
    //TODO add input management
    //TODO add coordinates for location on screen
    public DeckStack(List<CardActor> cardsIn, Texture texture) {
        index = 00;
        fdStack = new FacedownDeckStack(index);
        fuStack = new FaceupStack(index);
        for (CardActor card : cardsIn) {
            try {
                fdStack.addCard(card);
            } catch (NullPointerException e) {

            }
        }
        backImage = new Image(texture);
    }

    /**
     * getters and setters for xy locations
     */
    public float getFdX() {
        return fdX;
    }

    public void setFdX(float fdX) {
        this.fdX = fdX;
    }

    public float getFdY() {
        return fdY;
    }

    public void setFdY(float fdY) {
        this.fdY = fdY;
    }

    public float getFuX() {
        return fuX;
    }

    public void setFuX(float fuX) {
        this.fuX = fuX;
    }

    public float getFuY() {
        return fuY;
    }

    public void setFuY(float fuY) {
        this.fuY = fuY;
    }

    /**
     * getters for rendering purposes
     */
    public FacedownDeckStack getFdStack() {
        return fdStack;
    }

    public FaceupStack getFuStack() {
        return fuStack;
    }

    public Image getBackImage() {
        return backImage;
    }

    public void addTestCard() {
        //test code follows
        CardActor card = fdStack.getCard();
        card.setX(fuX);
        card.setY(fdX);
        card.setScale(0.2f);
        fuStack.addCard(card);
    }
}

