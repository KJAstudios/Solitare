package com.mygdx.gameplayhandlers;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.screens.GameScreen;

import java.util.ArrayList;
import java.util.List;

public class ActorHandler {

    private List<Actor> actorList;
    private GameScreen gameScreen;

    public ActorHandler(GameScreen gameScreen){
        actorList = new ArrayList<>();
        this.gameScreen = gameScreen;
    }

    private void addActorsToScreen(){
        for(Actor actor: actorList){
            gameScreen.addActor(actor);
        }
    }

    private void removeActorsFromScreen(){
        for (Actor actor: gameScreen.getActors()){
            if(!actorList.contains(actor)){
                for(Actor actor1 : gameScreen.getActors()){
                    if(actor1==actor){
                        actor1.remove();
                    }
                }
            }
        }
    }
    public void addActor(Actor inActor){
        actorList.add(inActor);
    }

    public List<Actor> getActorList() {
        return actorList;
    }

}
