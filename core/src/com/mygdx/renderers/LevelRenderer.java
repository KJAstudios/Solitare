package com.mygdx.renderers;

import com.mygdx.gameplayhandlers.LevelHandler;
import com.mygdx.screens.GameScreen;

public class LevelRenderer {

    private static GameScreen screen;
    private static LevelHandler level;

    /**
     * constructor
     *
     * @param inScreen the screen to render on
     * @param inLevel  the level to render
     */
    public static void renderLevel(GameScreen inScreen, LevelHandler inLevel) {
        screen = inScreen;
        level = inLevel;
        renderStacks();
    }

    /**
     * renders each of the stacks in the game
     */
    private static void renderStacks() {
        StackRenderer.renderLevelStacks(level.getLevelStacks(), screen);
        StackRenderer.renderFDDeckStack(level.getMainDeck(), screen);
        StackRenderer.renderFUDeckStack(level.getMainDeck(), screen);
    }

}
