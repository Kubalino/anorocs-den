package ac.bootcamp.row1game.Characters;

import ac.bootcamp.row1game.Characters.Monsters.ArmouredMonster;
import ac.bootcamp.row1game.Characters.Monsters.HealerMonster;
import ac.bootcamp.row1game.Characters.Monsters.HighDamageMonster;
import ac.bootcamp.row1game.Characters.Monsters.NormalMonster;
import ac.bootcamp.row1game.Game;

public class Factory {

    /*
    public Display createDisplay() {
        return new Display();
    }
    */

    public static Game createGame() {
        return new Game();

    }

    public static Player createPlayer() {
        return new Player();
    }

    public static NormalMonster createNormalMonster() {
        return new NormalMonster();
    }

    public static ArmouredMonster createArmouredMonster() {
        return new ArmouredMonster();
    }

    public static HealerMonster createHealerMonster() {
        return new HealerMonster();
    }

    public static HighDamageMonster createHighDamageMonster() {
        return new HighDamageMonster();
    }

}
