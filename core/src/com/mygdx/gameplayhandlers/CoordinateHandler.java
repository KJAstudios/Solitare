package com.mygdx.gameplayhandlers;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.cardstructures.LevelStack;
import com.mygdx.screens.GameScreen;

import java.util.List;

public class CoordinateHandler {

    private static GameScreen screen;
    private static LevelHandler level;

    /**
     * sets the coordinates for each stack relative to the screen
     */
    public static void setRenderCoords(GameScreen inScreen, LevelHandler inLevel) {
        screen = inScreen;
        level = inLevel;
        float[] lStackX = generateLevelStackPositions();
        for (int i = 0; i < 7; i++) {
            level.getLevelStacks().get(i).setX(lStackX[i]);
            level.getLevelStacks().get(i).setY(screen.getHeight() / 2);
        }
        updateLevelStackCardPositions(level);
        updateCardScale(screen);
    }

    /**
     * create the scale of the cards based on the size of the screen
     * @return
     */
    //TODO figure out how to scale based on screen size, important for android
    private static float getCardScale(){
        float edgePadding = screen.getWidth()*0.05f;
        float scale = 0.2f;
        return scale;
    }

    /**
     * updates the scale for all cards on the screen dependent on the size of the current screen
     * @param screen
     */
    public static void updateCardScale(GameScreen screen){
        float scale = getCardScale();
        List<LevelStack> stacks = level.getLevelStacks();
        for (LevelStack stack : stacks) {
            stack.getFuStack().setX(stack.getX());
            stack.getFdStack().setX(stack.getX());
            float y = stack.getY();
            if (stack.getFdStack() != null) {
                for (Image image : stack.getFdCards()) {
                    image.setScale(scale);
                }
            }
            for (int c = 0; c < stack.getFuStack().getStack().size(); c++) {
                stack.getFuStack().getStack().get(c).setScale(scale);
            }
        }

    }

    /**
     * generates the coordinates for each of the level stacks in the game
     *
     * @return
     */
    private static float[] generateLevelStackPositions() {
        float screenX = screen.getWidth();
        float edgePadding = screen.getWidth()*0.05f;
        float[] lStackX = new float[7];
        float spacing = screenX - (edgePadding * 2);
        spacing /= 7;
        float holderX = 0;
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                lStackX[i] = edgePadding;
                holderX = edgePadding;
            } else {
                holderX += spacing;
                lStackX[i] = holderX;
            }
        }
        return lStackX;
    }

    /**
     * generates/updates the coordinates of each card on the screen
     *
     * @param level level to use
     */
    public static void updateLevelStackCardPositions(LevelHandler level) {

        List<LevelStack> stacks = level.getLevelStacks();
        for (LevelStack stack : stacks) {
            stack.getFuStack().setX(stack.getX());
            stack.getFdStack().setX(stack.getX());
            float y = stack.getY();
            if (stack.getFdStack() != null) {
                for (Image image : stack.getFdCards()) {
                    image.setPosition(stack.getX(), y);
                    y -= 24;
                }
            }
            for (int c = 0; c < stack.getFuStack().getStack().size(); c++) {
                stack.getFuStack().getStack().get(c).setPosition(stack.getX(), y);
                y -= 24;
            }
        }
    }
}
