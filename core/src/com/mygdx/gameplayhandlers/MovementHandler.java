package com.mygdx.gameplayhandlers;

import com.mygdx.cardstructures.LevelStack;
import com.mygdx.gameplayhandlers.LevelHandler;

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
        if (currentLevel.determineClickedStack().getStackIndex() < 5) {
            return;
        } else if (mouseStack.topCard == 20) {
            return;
        }
    }

    /**
     * MovementStack is a simplified LevelStack to handle cards being moved
     */
    private class MovementStack {
        List<Integer> movementStack;
        int topCard;

        MovementStack() {
            movementStack = new LinkedList<>();
            topCard = 20;
        }
    }
}
