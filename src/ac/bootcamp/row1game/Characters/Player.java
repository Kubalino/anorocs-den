package ac.bootcamp.row1game.Characters;

public class Player extends Entity {

    public Player() {
        super(EntityType.PLAYER);
    }

    public void heal() {
        super.heal(50, 100);
    }
}
