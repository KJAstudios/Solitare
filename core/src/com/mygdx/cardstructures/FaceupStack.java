package com.mygdx.cardstructures;

import java.util.ArrayList;
import java.util.List;

public class FaceupStack extends BaseStack {
    private List<PlayingCard> stack;

    /**
     * sets the index of the stack
     *
     * @param inIndex what to set the index to
     */
    public FaceupStack(int inIndex) {
        super(inIndex);
        stack = new ArrayList<>();
    }

    /**
     * adds a single card to the stack
     * @param card card to add
     */
    public void addCard(PlayingCard card){
        stack.add(card);
    }

    /**
     * adds a stack of cards to this stack
     * @param cardStack stack of cards to add to stack
     */
    public void addCard(List<PlayingCard> cardStack){
        for (int i = 0; i<cardStack.size(); i++){
            stack.add(cardStack.get(i));
        }
    }

    /**
     * gets cards selected from stack
     * @return cards to remove from this stack
     */
    public List<PlayingCard> getCards(){
        List<PlayingCard> returnStack = new ArrayList<>();
        //TODO add selection data based off of mouse input
        return returnStack;
    }

    /**
     * checks if a card or stack can be placed here
     * @param card card to check
     */
    private void cardCheck(PlayingCard card){
        //TODO write card checks to determine if card can be placed
        return;
    }

}
