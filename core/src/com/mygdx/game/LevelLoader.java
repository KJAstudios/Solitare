package com.mygdx.game;

import java.util.ArrayList;

public class LevelLoader {
    Deck gameDeck = new Deck();
    Deck refDeck = new Deck();
    ArrayList<LevelStack> levelStacks = new ArrayList<>();

    LevelLoader(String levelType) {

        switch (levelType) {
            case "Standard": {
                for (int i = 0; i < 7; i++) {
                    levelStacks.add(new LevelStack());
                }
                for (int i = 1; i <= 6; i++) {
                    addCardToStack(i, i);
                }
                for (int i = 0; i<7; i++){
                    levelStacks.get(i).addFDCard(gameDeck.pullCard());
                }
            }
        }
    }

    private void addCardToStack(int stackNum, int numCards) {
        for (int i = 0; i < numCards; i++) {
            levelStacks.get(stackNum).addFDCard(gameDeck.pullCard());
        }
    }
}
