package com.mygdx.cardstructures;

import java.util.List;
import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class LevelStack {
    private int index;
    private FacedownStack fdStack;
    private FaceupStack fuStack;
    private float x;
    private float y;
    private List<Image> fdCards;

    /**
     * LevelStack ties a FaceupStack and a FacedownStack into one object
     *
     * @param fuStack the dealt FaceupStack to use
     * @param fdStack the dealt FacedownStack to use
     */
    public LevelStack(FaceupStack fuStack, FacedownStack fdStack, Texture backImage) {
        fdCards = new ArrayList<>();
        if (fuStack.getStackIndex() == fdStack.getStackIndex()) {
            index = fuStack.getStackIndex();
            this.fuStack = fuStack;
            this.fdStack = fdStack;
        }
        for(int i = 0; i < fdStack.getStack().size(); i++){
            Image tempImage = new Image(backImage);
            tempImage.setScale(0.2f);
            fdCards.add(tempImage);
        }
    }

    /**
     * getters for rendering
     *
     * @return
     */
    public FacedownStack getFdStack() {
        return fdStack;
    }

    public FaceupStack getFuStack() {
        return fuStack;
    }

    /**
     * cardImage getters and setters for rendering facedown cards
     */
    public List<Image> getFdCards() {
        return fdCards;
    }

    public void setFdCards(List<Image> fdCards) {
        this.fdCards = fdCards;
    }

    /**
     * getters and setters for coords of stack
     *
     * @param x
     */
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}