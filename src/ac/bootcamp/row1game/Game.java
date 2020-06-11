package ac.bootcamp.row1game;

import ac.bootcamp.row1game.Characters.Entity;
import ac.bootcamp.row1game.Characters.Factory;
import ac.bootcamp.row1game.Characters.Player;
import ac.bootcamp.row1game.audio.AudioEngine;
import ac.bootcamp.row1game.display.Display;

public class Game {

    private Player player;
    private Entity[] monsters;
    private Display display;
    private int monsterCounter = 0;
    private KeyboardMouse k = new KeyboardMouse();
    private MonsterSkill monsterSkill = MonsterSkill.ATTACK;


    public Game() {

        this.display = new Display();

        this.player = Factory.createPlayer();
        this.monsters = new Entity[4];
        monsters[0] = Factory.createNormalMonster();
        monsters[1] = Factory.createArmouredMonster();
        monsters[2] = Factory.createHealerMonster();
        monsters[3] = Factory.createHighDamageMonster();

        monsters[1].levelUp();
        monsters[2].levelUp();
        monsters[2].levelUp();
        monsters[3].levelUp();
        monsters[3].levelUp();
        monsters[3].levelUp();

        k.init();


    }


    public void start() throws InterruptedException {

        AudioEngine audio = new AudioEngine();


        display.init();

        while (!player.isDead()) {


            //System.out.println("\n" + player.toString());
            //input part

            display.drawMonster(monsterCounter);

            display.playerHealthBard(player.getHealth(), player.getMaxHP());
            display.monsterHealthBar(monsters[monsterCounter].getHealth(), monsters[monsterCounter].getMaxHP());

            k.setIsPressed();

            if (!player.getIsCharching()) {

                display.drawActionBar(player.getPotionAvailable(), player.getStrongLeft());


                while (!k.getIsPressed()) {
                    //   Thread.sleep(500);
                    display.drawPlayerIdle();

                }
                switch (k.getKeyPressed()) {
                    case "1":

                        display.deleteActionBar();
                        display.drawPlayerAttack();
                        display.crit(player);
                        audio.attack();
                        display.drawAttackDone();
                        player.attack(monsters[monsterCounter]);
                        display.monsterGetHit(monsters[monsterCounter].getHitDamage(), monsterCounter);

                        break;
                    case "2":

                        display.deleteActionBar();
                        display.drawPlayerAttack();
                        display.crit(player);
                        audio.spell();
                        display.drawSpellDone();
                        player.spell(monsters[monsterCounter]);

                        display.monsterGetHit(monsters[monsterCounter].getHitDamage(), monsterCounter);
                        break;
                    case "3":
                        display.deleteActionBar();
                        display.drawPlayerAttack();
                        if (player.getStrongLeft() == 0) {
                            //System.out.println("no more charges");
                            continue;
                        }
                        display.drawPlayerCharging();
                        player.strongAttack(player, monsters[monsterCounter]);


                        break;
                    case "4":
                        display.deleteActionBar();
                        display.drawPlayerAttack();
                        audio.block();
                        display.drawPlayerBlock();
                        player.block();
                        break;
                    case "5":
                        display.deleteActionBar();
                        display.drawPlayerAttack();
                        if (player.getPotionAvailable() == 0) {
                         //   System.out.println("no more pots");
                            continue;
                        }
                        audio.heal();
                        display.drawPlayerHeal();
                        player.heal();
                        display.playerHealthBard(player.getHealth(), player.getMaxHP());
                        break;

                    default:
                        //  System.out.println("invalid");
                        continue;

                }

            } else {
                display.deleteActionBar();
                player.strongAttack(player, monsters[monsterCounter]);
                audio.strongAttack();
                display.drawChargeDone();
                display.monsterGetHit(monsters[monsterCounter].getHitDamage(), monsterCounter);
            }


            display.monsterHealthBar(monsters[monsterCounter].getHealth(), monsters[monsterCounter].getMaxHP());

            //RandomMonsterSkills.getRandomMonsterSkill(player,monsters[monsterCounter]);
            Thread.sleep(2000);

            monsters[monsterCounter].stopBlocking();


            if (monsters[monsterCounter].isDead()) {
                display.deleteMonster();
                if (monsterCounter == 3) {
                    break;
                }

                monsterCounter += 1;

                //System.out.println("\n" + "a wild " + monsters[monsterCounter].getEntityType()
                //        + " appeared...");
                Thread.sleep(1000);
                display.drawBackground(monsterCounter);
                player.levelUp();
                audio.newMonster();

                continue;
            }
            //System.out.println("\n" + monsters[monsterCounter].toString());

            monsterSkill = RandomMonsterSkills.getRandomMonsterSkill(monsters[monsterCounter], player);

            switch (monsterSkill) {
                case ATTACK:
                    display.drawMonsterAttack(monsterCounter);
                    display.crit(monsters[monsterCounter]);
                    audio.attack();
                    display.drawMonsterAttackDone();
                    display.playerGetHit(player.getHitDamage());
                    break;
                case BLOCK:
                    display.drawMonsterAttack(monsterCounter);
                    audio.block();
                    display.drawMonsterBlock();
                    break;
                case HEAL:
                    display.drawMonsterAttack(monsterCounter);
                    audio.heal();
                    display.drawMonsterHeal();
                    display.monsterHealthBar(monsters[monsterCounter].getHealth(), monsters[monsterCounter].getMaxHP())
                    ;
                    break;
                case SPELL:
                    display.drawMonsterAttack(monsterCounter);
                    display.crit(monsters[monsterCounter]);
                    audio.spell();
                    display.drawMonsterSpellDone();
                    display.playerGetHit(player.getHitDamage());
                    break;
                case CHARGE:
                    display.drawMonsterAttack(monsterCounter);
                    display.drawMonsterCharging();
                    break;
                case STRONG:
                    display.drawMonsterAttack(monsterCounter);
                    audio.strongAttack();
                    display.drawMonsterChargeDone();
                    display.playerGetHit(player.getHitDamage());
                    break;
            }
            display.playerHealthBard(player.getHealth(), player.getMaxHP());

            //   Thread.sleep(2000);

            player.setCrit();
            monsters[monsterCounter].setCrit();
            player.stopBlocking();


        }

        if (!player.isDead()) {
            audio.youWin();
            display.drawGameEnding();
        }
        if (player.isDead()) {
            audio.youDie();
            display.drawGameOver();
        }

    }


}
