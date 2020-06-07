package ac.bootcamp.row1game;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Character implements Damagable{

    private final double HIT_CHANCE = 0.8;

    private int health;
    private double defense;
    private boolean dead;
    private boolean isBlocking;
    private Picture sprite;


    public void hit(int damage) {
        health = health - damage < 0 ? health - damage : 0;

        if(health == 0) {
             dead = true;
        }
    }

    public double getHIT_CHANCE() {
        return HIT_CHANCE;
    }

    public int getHealth () {
        return health;
    }

    public double getDefense() {
        return defense;
    }

    public boolean isDead() {
        return dead;
    }

    public boolean isBlocking() {
        return isBlocking;
    }

    public Picture getSprite() {
        return sprite;
    }
}
