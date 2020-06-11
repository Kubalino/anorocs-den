package ac.bootcamp.row1game.Characters.Monsters;


import ac.bootcamp.row1game.Characters.Entity;
import ac.bootcamp.row1game.Characters.EntityType;

public class NormalMonster extends Entity {

    public NormalMonster() {
        super(EntityType.NORMAL_MONSTER);
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
        return  " Normal Monster turn " +
                " | Health: " + getHealth() +
                " | Level: " + getLevel() + "\n" +
                " | Potions Left: " + getPotionAvailable() +
                " | Strong Charges: " + getStrongLeft();
    }

    public String getEntityType() {
        return "Normal Monster";
    }
}
