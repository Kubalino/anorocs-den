package ac.bootcamp.row1game.Characters.Monsters;

import ac.bootcamp.row1game.Characters.Entity;
import ac.bootcamp.row1game.Characters.EntityType;

public class HealerMonster extends Entity {

    public HealerMonster() {
        super(EntityType.HEALER_MONSTER);
    }

    public void heal() {
        super.heal(30, 80);
    }

    @Override
    public void getHeal() {
        heal();
    }
}
