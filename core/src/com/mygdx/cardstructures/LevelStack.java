package com.mygdx.cardstructures;

public class LevelStack {
    private int index;
    private FacedownStack fdStack;
    private FaceupStack fuStack;

    /**
     * LevelStack ties a FaceupStack and a FacedownStack into one object
     *
     * @param fuStack the dealt FaceupStack to use
     * @param fdStack the dealt FacedownStack to use
     */
    public LevelStack(FaceupStack fuStack, FacedownStack fdStack) {
        if (fuStack.getStackIndex() == fdStack.getStackIndex()) {
            index = fuStack.getStackIndex();
            this.fuStack = fuStack;
            this.fdStack = fdStack;
        }
    }
}
