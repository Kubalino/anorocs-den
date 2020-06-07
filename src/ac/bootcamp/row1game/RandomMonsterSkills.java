package ac.bootcamp.row1game;

import ac.bootcamp.row1game.Characters.Entity;
import ac.bootcamp.row1game.Characters.Monsters.HealerMonster;

public class RandomMonsterSkills {




    public static void getRandomMonsterSkill(Entity monster, Entity player) {

        double heal_chance = 0.45;
        double block_chance = 0.30;
        double spell_chance = 0.10;

        double random = Math.random();

        if(monster instanceof HealerMonster) {
            heal_chance = 0.7;
        }

        if(random <= spell_chance) {
            System.out.println("SPELL");
            monster.spell(player);
        }

        if(random <= block_chance) {
            System.out.println("BLOCK");
            monster.block();
            return;
        }

        if(random <= heal_chance) {
            System.out.println("HEAL");
            monster.getHeal();
            return;
        }
        System.out.println("ATTACK");
        monster.attack(player);
        return;
    }

}
