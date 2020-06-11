package ac.bootcamp.row1game.Characters.Monsters;

import ac.bootcamp.row1game.Characters.Entity;
import ac.bootcamp.row1game.Characters.EntityType;

public class ArmouredMonster extends Entity {

    public ArmouredMonster() {
        super(EntityType.ARMOURED_MONSTER);
    }

    public void heal() {
        super.heal(10, 20);
    }

    @Override
    public void getHeal() {
        heal();
    }

    @Override
    public String toString() {
        return  " Armoured Monster turn " +
                " | Health: " + getHealth() +
                " | Level: " + getLevel() + "\n" +
                " | Potions Left: " + getPotionAvailable() +
                " | Strong Charges: " + getStrongLeft();
    }
    @Override
    public String getEntityType() {
        return "Armoured Monster";
    }
}
