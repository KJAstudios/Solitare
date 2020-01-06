package com.mygdx.gameplayhandlers;

import java.util.LinkedList;
import java.util.List;

public class MovementHandler {
    MovementStack mouseStack;
    LevelHandler currentLevel;

    /**
     * Constructor
     *
     * @param controlLevel the level the movementHandler is handling movement for
     */
    MovementHandler(LevelHandler controlLevel) {
        mouseStack = new MovementStack();
        currentLevel = controlLevel;
    }

    /**
     * PlaceCard() handles placing cards from the mouseStack to levelStacks in currentLevel
     */
    public void placeCard() {

    }

    /**
     * MovementStack is a simplified LevelStack to handle cards being moved
     */
    private class MovementStack {

    }
}
