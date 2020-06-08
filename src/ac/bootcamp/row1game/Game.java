package ac.bootcamp.row1game;

import ac.bootcamp.row1game.Characters.Entity;
import ac.bootcamp.row1game.Characters.Factory;
import ac.bootcamp.row1game.Characters.Player;
import ac.bootcamp.row1game.display.Display;

public class Game {

    private Player player;
    private Entity[] monsters;
    private Display display;
    private int monsterCounter = 0;


    public Game() {

       this.display = new Display();
      this.player = Factory.createPlayer();
        this.monsters = new Entity[4];
        monsters[0] = Factory.createNormalMonster();
        monsters[1] = Factory.createArmouredMonster();
        monsters[2] = Factory.createHealerMonster();
        monsters[3] = Factory.createHighDamageMonster();

        monsters[1].levelUp();
        monsters[2].levelUp();monsters[2].levelUp();
        monsters[3].levelUp();monsters[3].levelUp();monsters[3].levelUp();

    }


    public void start() throws InterruptedException {

        while(!player.isDead()){

            System.out.println("\n" + "Player turn : " + player.getHealth());

           RandomMonsterSkills.getRandomMonsterSkill(player,monsters[monsterCounter]);
           //Thread.sleep(2000);

           monsters[monsterCounter].stopBlocking();

           if(monsters[monsterCounter].isDead()){
               if(monsterCounter == 3){

                   break;
               }

               monsterCounter +=1;
               System.out.println("\n" + "a wild monster appeared");
               //Thread.sleep(1000);
               player.levelUp();
               //Thread.sleep(000);
               continue;
           }
            System.out.println( "\n" + "monster turn : " + monsters[monsterCounter].getHealth());

           RandomMonsterSkills.getRandomMonsterSkill(monsters[monsterCounter],player);
           //Thread.sleep(2000);

           player.stopBlocking();

        }

        if(!player.isDead()){
            System.out.println("you win!");
        }
        if(player.isDead()){
            System.out.println("Game over!");
        }



    }
}
