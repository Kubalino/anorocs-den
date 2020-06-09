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
    private KeyboardMouse k = new KeyboardMouse();


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

        k.init();



    }




    public void start() throws InterruptedException {

        display.init();

        while(!player.isDead()){


            System.out.println("\n" + "Player turn : " + player.getHealth());
            //input part
            display.drawActionBar();
            display.drawSoldierNormal();

            k.setIsPressed();

            while(!k.getIsPressed()) {
                Thread.sleep(500);
            }

                switch (k.getKeyPressed()) {
                    case "1":
                        player.attack(monsters[monsterCounter]);
                        display.drawGunshot();
                        break;
                    case "2":
                       player.spell(monsters[monsterCounter]);
                        break;
                    case "3":
                       if(player.getPotionAvailable() == 0){
                           System.out.println("no more pots");
                       continue;
                       }
                       player.heal();
                        break;
                    case "4":
                        player.block();
                        break;

                    default:
                        System.out.println("invalid");
                        continue;

                }

                display.deleteActionBar();
           //RandomMonsterSkills.getRandomMonsterSkill(player,monsters[monsterCounter]);
           Thread.sleep(2000);

           monsters[monsterCounter].stopBlocking();


           if(monsters[monsterCounter].isDead()){
               if(monsterCounter == 3){

                   break;
               }

               display.deleteSoldierNormal();
               monsterCounter +=1;
               System.out.println("\n" + "a wild monster appeared");
               Thread.sleep(1000);
               player.levelUp();

               continue;
           }
            System.out.println( "\n" + "monster turn : " + monsters[monsterCounter].getHealth());

           RandomMonsterSkills.getRandomMonsterSkill(monsters[monsterCounter],player);
           Thread.sleep(2000);

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
