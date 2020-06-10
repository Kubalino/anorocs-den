package ac.bootcamp.row1game.Characters.Monsters;

import ac.bootcamp.row1game.Characters.Entity;
import ac.bootcamp.row1game.Characters.EntityType;

public class HighDamageMonster extends Entity {

    public HighDamageMonster() {
        super(EntityType.HIGH_DAMAGE_MONSTER);
    }

    public void heal() {
        super.heal(5, 10);
    }

    @Override
    public void getHeal() {
        heal();
    }

    @Override
    public String toString() {
        return  " High Damage Monster turn " +
                " | Health: " + getHealth() +
                " | Level: " + getLevel() + "\n" +
                " | Potions Left: " + getPotionAvailable() +
                " | Strong Charges: " + getStrongLeft();
    }

    @Override
    public String getEntityType() {
        return "High Damage Monster";
    }
}
