package com.mygdx.renderers;

import com.mygdx.cardstructures.DeckStack;
import com.mygdx.cardstructures.FaceupStack;
import com.mygdx.cardstructures.LevelStack;
import com.mygdx.screens.GameScreen;

import java.util.List;

public class StackRenderer {
    /**
     * renders the main deck on screeen
     *
     * @param renderStack DeckStack to render
     * @param screen      screen to render on
     */
    public static void renderStack(DeckStack renderStack, GameScreen screen) {

    }

    /**
     * renders the AceStacks on the screen
     *
     * @param renderStacks Ace stacks to render
     * @param screen       screen to render on
     */
    public static void renderAceStack(List<FaceupStack> renderStacks, GameScreen screen) {

    }

    /**
     * renders the LevelStacks on screen
     *
     * @param renderStacks LevelStacks to render
     * @param screen       screen to render on
     */
    public static void renderStack(List<LevelStack> renderStacks, GameScreen screen) {
        for (int i = 0; i < renderStacks.size(); i++) {
            LevelStack lStack = renderStacks.get(i);
            if(lStack.getFdCards() != null) {
                for (int c = 0; c < lStack.getFdCards().size(); c++) {
                    screen.addActor(lStack.getFdCards().get(c));
                }
            }
            for (int i2 = 0; i2 < lStack.getFuStack().getStack().size(); i2++) {
                screen.addActor(lStack.getFuStack().getStack().get(i2));
            }
        }
    }
}
