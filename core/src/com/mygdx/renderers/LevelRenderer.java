package com.mygdx.renderers;

import com.mygdx.gameplayhandlers.ActorHandler;
import com.mygdx.gameplayhandlers.LevelHandler;

public class LevelRenderer {

    private static ActorHandler actorHandler;
    private static LevelHandler level;

    /**
     * constructor
     *
     * @param actorHandler the actorHandler to add actors to
     * @param inLevel      the level to render
     */
    public static void renderLevel(ActorHandler actorHandler, LevelHandler inLevel) {
        LevelRenderer.actorHandler = actorHandler;
        level = inLevel;
        renderStacks();
    }

    /**
     * renders each of the stacks in the game
     */
    private static void renderStacks() {
        StackRenderer.renderLevelStacks(level.getLevelStacks(), actorHandler);
        StackRenderer.renderFDDeckStack(level.getMainDeck(), actorHandler);
        StackRenderer.renderFUDeckStack(level.getMainDeck(), actorHandler);
    }

}
