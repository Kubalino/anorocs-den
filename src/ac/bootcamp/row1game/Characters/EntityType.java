package ac.bootcamp.row1game.Characters;


import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum EntityType {
    PLAYER(100, 20, 5),
    NORMAL_MONSTER(100,10,5),
    ARMOURED_MONSTER(100, 10,10),
    HEALER_MONSTER(200, 5, 4),
    HIGH_DAMAGE_MONSTER(100, 25,5);


    private int health;
    private int damage;
    private int defense;

    EntityType(int health, int damage, int defense) {

        this.health = health;
        this.damage = damage;
        this.defense = defense;

    }

    public int getHealth() {
        return health;
    }

    public int getDefense() {
        return defense;
    }

    public int getDamage() {
        return damage;
    }
}
