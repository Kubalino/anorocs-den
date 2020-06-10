package ac.bootcamp.row1game.Characters;

import ac.bootcamp.row1game.Randomizer;

public class Player extends Entity {

    public Player() {
        super(EntityType.PLAYER);
    }

    public void heal() {

        int min = 50 * getLevel();
        int max = 100 * getLevel();
        super.heal(min, max);
    }


    @Override
    public void getHeal(){
        heal();
    }

    @Override
    public String toString() {
        return  " Player turn " +
                " | Health: " + getHealth() +
                " | Level: " + getLevel() + "\n" +
                " | Potions Left: " + getPotionAvailable() +
                " | Strong Charges: " + getStrongLeft();
    }

    @Override
    public String getEntityType() {
        return "Player";
    }
}
