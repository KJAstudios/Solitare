package com.mygdx.gameplayhandlers.inputhandlers;

import com.mygdx.cardstructures.DeckStack;
import com.mygdx.cardstructures.FaceupStack;
import com.mygdx.cardstructures.InputStack;
import com.mygdx.cardstructures.LevelStack;
import com.mygdx.gameplayhandlers.GameplayHandler;
import com.mygdx.gameplayhandlers.LevelHandler;

import java.util.List;


public class InputHandler {
    public static InputStack inputStack;
    public static int pointerX;
    public static int pointerY;

    /**
     * what happens when GameScreen.touchDown is called
     *
     * @param levelHandler the level being used
     * @param pointerX     x-coord of the touch
     * @param pointerY     y-coord of the touch
     */
    public static void touchDown(LevelHandler levelHandler, int pointerX, int pointerY) {
        inputStack = levelHandler.getInputStack();
        grabCards(levelHandler);
        inputStack.updateCoords(pointerX, pointerY);
    }

    /**
     * what happens when GameScreen.touchDragged is called
     *
     * @param levelHandler the level being used
     * @param pointerX     x-coord of the touch
     * @param pointerY     y-coord of the touch
     */
    public static void touchDragged(LevelHandler levelHandler, int pointerX, int pointerY) {
        inputStack = levelHandler.getInputStack();
        inputStack.updateCoords(pointerX, pointerY);
    }

    /**
     * what happens when GameScreen.touchUp is called
     *
     * @param levelHandler the level being used
     * @param pointerX     x-coord of the touch
     * @param pointerY     y-coord of the touch
     */
    public static void touchUp(LevelHandler levelHandler, int pointerX, int pointerY) {
        inputStack = levelHandler.getInputStack();

    }

    /**
     * grabCards checks if the touch was on a stack, and if so, grabs the cards
     *
     * @param levelHandler level to get stacks from
     */
    private static void grabCards(LevelHandler levelHandler) {
        List<LevelStack> levelStackList = levelHandler.getLevelStacks();
        DeckStack deckStack = levelHandler.getMainDeck();
        for (LevelStack stack : levelStackList) {
            if (coordCheck(stack, levelHandler)) {
                GameplayHandler.grabCards(inputStack, stack);
                return;
            }
        }
        if (coordCheck(deckStack, levelHandler)) {
            GameplayHandler.grabCards(inputStack, deckStack);
            return;
        }
    }


    /**
     * coordCheck checks to see if the touch happened on a stack
     *
     * @param stack        the stack the input processor is checking against
     * @param levelHandler level handler to retrieve card back data
     * @return
     */
    private static boolean coordCheck(LevelStack stack, LevelHandler levelHandler) {
        if (pointerX >= stack.getFuStack().getX() && pointerX <= (stack.getFuStack().getX() + levelHandler.getDeckBack().getWidth())) {
            if (pointerY >= stack.getFuStack().getY() && pointerY <= (stack.getFuStack().getY() + levelHandler.getDeckBack().getHeight())) {
                return true;
            }
        }

        return false;
    }

    private static boolean coordCheck(DeckStack stack, LevelHandler levelHandler) {
        if (pointerX >= stack.getFuX() && pointerX <= (stack.getFuX() + levelHandler.getDeckBack().getWidth())) {
            if (pointerY >= stack.getFuY() && pointerY <= (stack.getFuY() + levelHandler.getDeckBack().getHeight())) {
                return true;
            }
        }
        return false;
    }

    private static boolean coordCheck(FaceupStack stack, LevelHandler levelHandler) {
        return false;
    }
}
