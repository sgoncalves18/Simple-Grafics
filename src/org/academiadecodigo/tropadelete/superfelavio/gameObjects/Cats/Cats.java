package org.academiadecodigo.tropadelete.superfelavio.gameObjects.Cats;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tropadelete.superfelavio.Direction;
import org.academiadecodigo.tropadelete.superfelavio.Game;
import org.academiadecodigo.tropadelete.superfelavio.gameObjects.GameObject;

public class Cats extends GameObject {
    private static final int WIDTH = 40;
    private static final int HEIGHT = 20;
    private static final int SPEED = 5;

    public Cats(int health ,int startPoint) {
        super(health, SPEED,new Rectangle(startPoint,Game.GROUND_Y,WIDTH,HEIGHT),new Picture(startPoint, Game.GROUND_Y - 40, "resources/cat.png"), new Picture(startPoint, Game.GROUND_Y - 40, "resources/catLeft.png"));

        setCurrentX(Direction.LEFT);
    }

    @Override
    public void moveX() {


        if (super.getX() <= Game.WALL_LEFT || super.getWidth() >= Game.WALL_RIGHT) {
            super.setCurrentX(Direction.oppositeDirection(getCurrentX()));
        }
        super.moveX();
    }

    //private Rectangle pickStartPosition() {

    //}
}



