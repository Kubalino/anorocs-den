package ac.bootcamp.row1game.Characters.Monsters;

import ac.bootcamp.row1game.Characters.Entity;
import ac.bootcamp.row1game.Characters.EntityType;

public class ArmouredMonster extends Entity {

    public ArmouredMonster() {
        super(EntityType.ARMOURED_MONSTER);
    }

    public void heal() {
        super.heal(5, 10);
    }

    @Override
    public void getHeal() {
        heal();
    }
}
