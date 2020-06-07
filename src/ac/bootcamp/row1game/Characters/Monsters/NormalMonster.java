package ac.bootcamp.row1game.Characters.Monsters;


import ac.bootcamp.row1game.Characters.Entity;
import ac.bootcamp.row1game.Characters.EntityType;

public class NormalMonster extends Entity {

    public NormalMonster() {
        super(EntityType.NORMAL_MONSTER);
    }

    public void heal() {
        super.heal(5, 10);
    }

    @Override
    public void getHeal() {
        heal();
    }
}
