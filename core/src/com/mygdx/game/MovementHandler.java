package com.mygdx.game;

import java.util.LinkedList;
import java.util.List;

public class MovementHandler {
    MovementStack mouseStack;
    LevelStack comparatorStack;
    LevelHandler currentLevel;
    MovementHandler(LevelHandler controlLevel){
        mouseStack = new MovementStack();
        currentLevel = controlLevel;
    }

    public void placeCard(){
        if(currentLevel.determineClickedStack().getStackIndex() < 5){
            return;
        }
        else if(mouseStack.topCard == 20){
            return;
        }
    }

    private class MovementStack{
        List<Integer> movementStack;
        int topCard;

        MovementStack (){
            movementStack = new LinkedList<>();
            topCard = 20;
        }


    }
}
