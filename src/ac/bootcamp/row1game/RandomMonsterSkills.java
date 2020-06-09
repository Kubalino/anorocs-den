package ac.bootcamp.row1game;

import ac.bootcamp.row1game.Characters.Entity;
import ac.bootcamp.row1game.Characters.Monsters.HealerMonster;

public class RandomMonsterSkills {




    public static void getRandomMonsterSkill(Entity monster, Entity player) {

        double heal_chance = 0.50;
        double block_chance = 0.30;
        double spell_chance = 0.20;
        double strongAttack_chance = 0.10;

        double random = Math.random();

        if(monster instanceof HealerMonster) {
            if((monster.getHealth() <= (monster.getMaxHP()/2)) && monster.getPotionAvailable() != 0){
                monster.getHeal();
                return;

            }
            heal_chance = 0.0;
            block_chance = 0.2;
        }
        if((random <= strongAttack_chance)|| monster.getIsCharching()){
            System.out.println("STRONG");
            monster.strongAttack(monster, player);
            return;
        }

        if(random <= spell_chance) {
            System.out.println("SPELL");
            monster.spell(player);
            return;
        }

        if(random <= block_chance) {
            System.out.println("BLOCK");
            monster.block();
            return;
        }

        if(random <= heal_chance) {
            if(monster.getPotionAvailable() == 0){
                getRandomMonsterSkill(monster, player);
                return;
            }
            System.out.println("HEAL");
            monster.getHeal();
            return;
        }
        System.out.println("ATTACK");
        monster.attack(player);
        return;
    }

}
