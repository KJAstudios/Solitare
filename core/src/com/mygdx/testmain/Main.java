package com.mygdx.testmain;

import com.mygdx.cardstructures.*;

public class Main {
    public static void main(String[] args){
        Deck deck = new Deck();
        for(int i = 0; i < 52; i++){
            PlayingCard tempCard = deck.pullCard();
            System.out.println(tempCard.getCardVal() + " " + tempCard.getSuitVal());
        }

    }
}
