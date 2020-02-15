package com.mygdx.renderers;

import com.mygdx.cardstructures.DeckStack;
import com.mygdx.cardstructures.FaceupStack;
import com.mygdx.cardstructures.LevelStack;
import com.mygdx.gameplayhandlers.ActorHandler;
import com.mygdx.screens.GameScreen;

import java.util.List;

public class StackRenderer {
    /**
     * adds all stacks to the actorHandler for rendering
     *
     * @param renderStack  DeckStack to render
     * @param actorHandler actorHandler to handle Actor management
     */
    public static void renderFDDeckStack(DeckStack renderStack, ActorHandler actorHandler) {
        renderStack.getBackImage().setName("deckBack");
        actorHandler.addActor(renderStack.getBackImage());
    }

    /**
     * renders the top face up card of the Deck Stack if applicable
     *
     * @param renderStack  DeckStack to render
     * @param actorHandler actorHandler to handle actors
     */
    public static void renderFUDeckStack(DeckStack renderStack, ActorHandler actorHandler) {
        if (renderStack.getFuStack().getStack() != null && renderStack.getFuStack().getStack().size() != 0) {
            actorHandler.addActor(renderStack.getFuStack().getStack().get(renderStack.getFuStack().getStack().size() - 1));
        }
    }

    /**
     * renders the AceStacks on the screen
     *
     * @param renderStacks Ace stacks to render
     * @param actorHandler actorHandler to handle actors
     */
    public static void renderAceStack(List<FaceupStack> renderStacks, ActorHandler actorHandler) {

    }

    /**
     * renders the LevelStacks on screen
     *
     * @param renderStacks LevelStacks to render
     * @param actorHandler handles adding actors to screen
     */
    public static void renderLevelStacks(List<LevelStack> renderStacks, ActorHandler actorHandler) {
        for (int i = 0; i < renderStacks.size(); i++) {
            LevelStack lStack = renderStacks.get(i);
            if (lStack.getFdCards() != null) {
                for (int c = 0; c < lStack.getFdCards().size(); c++) {
                    actorHandler.addActor(lStack.getFdCards().get(c));
                }
            }
            for (int i2 = 0; i2 < lStack.getFuStack().getStack().size(); i2++) {
                actorHandler.addActor(lStack.getFuStack().getStack().get(i2));
            }
        }
    }
}
