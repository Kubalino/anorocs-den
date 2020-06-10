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


            System.out.println("\n" + player.toString());
            //input part
            display.drawActionBar();
            display.drawSoldierNormal();

            k.setIsPressed();

            if(!player.getIsCharching()) {
            while(!k.getIsPressed()) {
             //   Thread.sleep(500);
                display.drawPlayerIdle();

            }
                switch (k.getKeyPressed()) {
                    case "1":
                        player.attack(monsters[monsterCounter]);
                        display.drawPlayerAttack();
                        break;
                    case "2":
                        player.spell(monsters[monsterCounter]);
                        break;
                    case "3":
                        if (player.getStrongLeft() == 0) {
                            System.out.println("no more charges");
                            continue;
                        }
                        player.strongAttack(player, monsters[monsterCounter]);
                        break;
                    case "4":
                        player.block();
                        break;
                    case "5":
                        if (player.getPotionAvailable() == 0) {
                            System.out.println("no more pots");
                            continue;
                        }
                        player.heal();
                        break;

                    default:
                        System.out.println("invalid");
                        continue;

                }
            }else{player.strongAttack(player, monsters[monsterCounter]);}

                display.deleteActionBar();
           //RandomMonsterSkills.getRandomMonsterSkill(player,monsters[monsterCounter]);
           Thread.sleep(2000);

           monsters[monsterCounter].stopBlocking();


           if(monsters[monsterCounter].isDead()){
               display.deleteSoldierNormal();
               if(monsterCounter == 3){
                   break;
               }
               
               monsterCounter +=1;
               System.out.println("\n" + "a wild " + monsters[monsterCounter].getEntityType()
                       + " appeared...");
               Thread.sleep(1000);
               display.drawBackground(monsterCounter);
               player.levelUpSout();

               continue;
           }
            System.out.println( "\n"  + monsters[monsterCounter].toString());

           RandomMonsterSkills.getRandomMonsterSkill(monsters[monsterCounter],player);
           Thread.sleep(2000);

           player.stopBlocking();

        }

        if(!player.isDead()){
            display.drawGameOver();
            System.out.println("You win!");
        }
        if(player.isDead()){
            System.out.println("Game over!");
        }


    }


}
