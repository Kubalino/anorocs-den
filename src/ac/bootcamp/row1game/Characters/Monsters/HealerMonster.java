package ac.bootcamp.row1game.Characters.Monsters;

import ac.bootcamp.row1game.Characters.Entity;
import ac.bootcamp.row1game.Characters.EntityType;

public class HealerMonster extends Entity {

    public HealerMonster() {
        super(EntityType.HEALER_MONSTER);
    }

    public void heal() {
        super.heal(100,200);
    }

    @Override
    public void getHeal() {
        heal();
    }

    @Override
    public String toString() {
        return  " Healer Monster turn " +
                " | Health: " + getHealth() +
                " | Level: " + getLevel() + "\n" +
                " | Potions Left: " + getPotionAvailable() +
                " | Strong Charges: " + getStrongLeft();
    }

    @Override
    public String getEntityType() {
        return "Healer Monster";
    }
}
