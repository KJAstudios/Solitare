package com.mygdx.gameplayhandlers;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.mygdx.screens.GameScreen;

import java.util.ArrayList;
import java.util.List;

public class ActorHandler {

    private List<Actor> actorList;
    private GameScreen gameScreen;

    /**
     * this class handles actor management for the main game
     *
     * @param gameScreen the level being used
     */
    public ActorHandler(GameScreen gameScreen) {
        actorList = new ArrayList<>();
        this.gameScreen = gameScreen;
    }

    /**
     * this adds all the actors to the screen, used only for initial load of actors upon starting level
     * WARNING: only call once at initilazion of a LevelHandler
     */
    public void addActorsToScreen() {
        for (Actor actor : actorList) {
            if(gameScreen.getActors().contains(actor, true)){
                continue;
            }
            gameScreen.addActor(actor);
        }
        gameScreen.render(0);
    }

    /**
     * checks the list of actors, and if one is removed from the actorList, tells it to end rendering on screen
     */
    private void removeActorsFromScreen() {
        for (Actor actor : gameScreen.getActors()) {
            if (!actorList.contains(actor)) {
                for (Actor actor1 : gameScreen.getActors()) {
                    if (actor1 == actor) {
                        actor1.addAction(Actions.removeActor());
                    }
                }
            }
        }
    }

    /**
     * add function for actorList
     *
     * @param inActor actor to add to list
     */
    public void addActor(Actor inActor) {
        actorList.add(inActor);
    }

    /**
     * remove function for actorList
     *
     * @param inActor actor to remove
     */
    public void removeActor(Actor inActor) {
        actorList.remove(inActor);
    }

    /**
     * getter for actor list, don't know if needed yet
     *
     * @return actorList
     */
    public List<Actor> getActorList() {
        return actorList;
    }

}
