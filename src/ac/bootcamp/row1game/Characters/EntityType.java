package ac.bootcamp.row1game.Characters;


import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum EntityType {
    PLAYER(100, 10, 5,new Picture[] {new Picture ( 0,0,"pica.gif"), new Picture (100,100,"psyornit.gif")}),
    NORMAL_MONSTER(100,10,5,new Picture[] {new Picture ( 0,0,"pica.gif"), new Picture (100,100,"psyornit.gif")}),
    ARMOURED_MONSTER(200, 10,10,new Picture[] {new Picture ( 0,0,"pica.gif"), new Picture (100,100,"psyornit.gif")}),
    HEALER_MONSTER(200, 10, 5,new Picture[] {new Picture ( 0,0,"pica.gif"), new Picture (100,100,"psyornit.gif")}),
    HIGH_DAMAGE_MONSTER(200, 25,5,new Picture[] {new Picture ( 0,0,"pica.gif"), new Picture (100,100,"psyornit.gif")});


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
