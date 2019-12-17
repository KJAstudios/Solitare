package com.mygdx.cardstructures;

abstract class BaseStack{
    private final int index;

    /**
     * sets the index of the stack
     * @param inIndex what to set the index to
     */
    public BaseStack(int inIndex){
        index = inIndex;
    }

    /**
     *
     * @return the stack's index
     */
    public int getStackIndex(){
        return index;
    }

}
