package com.mygdx.gameplayhandlers;

import com.mygdx.cardstructures.*;

public class GameplayHandler {
    /**
     * grab cards from a stack, and adds it to the Input stack
     *
     * @param inputStack input stack being used
     * @param stack      stack to take from
     */
    //TODO change to MovementHandler?
    public static void grabCards(InputStack inputStack, LevelStack stack) {
        CardActor card = stack.getFuStack().getCard();
        inputStack.addCard(card);
    }

    public static void grabCards(InputStack inputStack, DeckStack stack) {
        CardActor card = stack.getFuStack().getCard();
        inputStack.addCard(card);

    }

    public static void grabCards(InputStack inputStack, FaceupStack stack) {

    }
}
