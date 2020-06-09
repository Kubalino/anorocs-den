package ac.bootcamp.row1game.Characters;


import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum EntityType {
    PLAYER(100, 20, 5,new Picture[] {new Picture ( 0,0,"assets/sprites/shoot_0.png"), new Picture (100,100,"assets/sprites/shoot_3.png")}),
    NORMAL_MONSTER(100,10,5,new Picture[] {new Picture ( 0,0,"assets/sprites/shoot_0.png"), new Picture (100,100,"assets/sprites/shoot_3.png")}),
    ARMOURED_MONSTER(100, 10,10,new Picture[] {new Picture ( 0,0,"assets/sprites/shoot_0.png"), new Picture (100,100,"assets/sprites/shoot_3.png")}),
    HEALER_MONSTER(200, 5, 4,new Picture[] {new Picture ( 0,0,"assets/sprites/shoot_0.png"), new Picture (100,100,"assets/sprites/shoot_3.png")}),
    HIGH_DAMAGE_MONSTER(100, 25,5,new Picture[] {new Picture ( 0,0,"assets/sprites/shoot_0.png"), new Picture (100,100,"assets/sprites/shoot_3.png")});


    private int health;
    private int damage;
    private int defense;
    private Picture[] sprite;

    EntityType(int health, int damage, int defense, Picture[] sprite) {

        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.sprite = sprite;

    }

    public int getHealth() {
        return health;
    }

    public int getDefense() {
        return defense;
    }

    public Picture[] getSprite() {
        return sprite;
    }

    public int getDamage() {
        return damage;
    }
}
