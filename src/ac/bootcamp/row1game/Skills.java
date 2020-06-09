package ac.bootcamp.row1game;

import ac.bootcamp.row1game.Characters.Entity;

public interface Skills {

    void strongAttack(Entity monster,Entity target);

    void attack(Entity target);

    void block();

    void heal(int min, int max);

    void hit(int damage);

    void levelUp();

    void spell(Entity target);

}
