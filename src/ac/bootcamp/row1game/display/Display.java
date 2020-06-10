package ac.bootcamp.row1game.display;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import static ac.bootcamp.row1game.display.Sprites.*;

public class Display {

    private Picture background;
    private Picture actionBar;
    private Picture player;
    private Picture monster_A;
    private Picture attack;
    private Picture spell;
    private Picture charge;
    private Picture charging;
    private Picture mCharging;
    private Picture mCharge;
    private Picture mAttack;
    private Picture mSpell;
    private Picture block;
    private Picture mBlock;
    private Text text;

    public Display() {

        // TODO: Change magic number into variables depending on image size
        background = new Picture(10, 10, BACKGROUND_1);
        actionBar = new Picture(100, 100, ACTION_BAR);
        player = new Picture(150, 375, PLAYER_IDLE_1);
        monster_A = new Picture(500, 200, MONSTER_A);
        attack = new Picture(600, 260, ATTACK_1);
        spell = new Picture(620, 180, SPELL_1);
        mAttack = new Picture(170, 375, M_ATTACK_1);
        mSpell = new Picture(170, 175, SPELL_1);
        mCharge = new Picture(170,0, CHARGE_1);
        charge = new Picture(700,0,CHARGE_1);
        charging = new Picture(250, 400, CHARGING_1);
        mCharging = new Picture(700, 400, CHARGING_1);
        block = new Picture(250, 400, BLOCK_1);
        mBlock = new Picture(700,400,BLOCK_1);

    }

    public void init() {

        background.draw();
        player.draw();

    }


    public void drawBackground(int bg) {
        switch (bg) {
            case 1:
                background.load(BACKGROUND_2);
                break;
            case 2:
                background.load(BACKGROUND_3);
                break;
            case 3:
                background.load(BACKGROUND_4);
                break;
        }
    }

    public void drawMessage(int x, int y, String message, int time) throws InterruptedException {


        text = new Text(x, y, message);
        text.setColor(Color.WHITE);
        text.grow(100, 50);
        text.draw();
        Thread.sleep(time);
        text.delete();
    }

    public void drawGameEnding() throws InterruptedException {
        player.delete();
        actionBar.delete();
        background.load(BACKGROUND_5);

        drawMessage(200, 300, "You completed the game!", 1000);
        drawMessage(200, 400, "Thanks for playing", 1000);
        drawMessage(200, 500, "The end.", 1000);

        Thread.sleep(2000);
        text.delete();

        background.load(CREDITS);
    }

    public void drawGameOver() throws InterruptedException {
        player.delete();
        actionBar.delete();
        monster_A.delete();
        background.load(GAMEOVER);
        Picture gameOver = new Picture(300, 300, GAMEOVERPIC);
        gameOver.draw();
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            gameOver.grow(5, 5);
        }
        gameOver.delete();
    }


    public void drawPlayerAttack() throws InterruptedException {

        animate(ATTACKSPRITES);

    }

    private void animate(String[] sprites) throws InterruptedException {
        for (String sprite : sprites) {
            player.load(sprite);
            Thread.sleep(250);
        }
    }


    public void drawAttackDone() throws InterruptedException {

        attack.draw();

        for (String sprite : ATTACKDONE) {

            attack.load(sprite);
            Thread.sleep(125);
        }

        attack.delete();
    }


    public void drawMonsterAttackDone() throws InterruptedException {

        mAttack.draw();

        for (String sprite : M_ATTACKDONE) {

            mAttack.load(sprite);
            Thread.sleep(125);
        }

        mAttack.delete();
    }


    public void drawSpellDone() throws InterruptedException {

        spell.draw();

        for (String sprite : SPELLDONE) {

            spell.load(sprite);
            Thread.sleep(100);
        }

        spell.delete();
    }


    public void drawMonsterSpellDone() throws InterruptedException {

        mSpell.draw();

        for (String sprite : SPELLDONE) {

            mSpell.load(sprite);
            Thread.sleep(100);
        }

        mSpell.delete();
    }

    public void drawChargeDone() throws InterruptedException {


        charge.draw();

        for (String sprite : CHARGEDDONE) {

            charge.load(sprite);
            Thread.sleep(100);
        }

        charge.delete();
    }

    public void drawPlayerBlock() throws InterruptedException {

        block.draw();

        for (String sprite : BLOCKING) {

            block.load(sprite);
            Thread.sleep(125);
        }

        block.delete();
    }



    public void drawMonsterChargeDone() throws InterruptedException {


        mCharge.draw();

        for (String sprite : CHARGEDDONE) {

            mCharge.load(sprite);
            Thread.sleep(100);
        }

        mCharge.delete();
    }

    public void drawPlayerCharging() throws InterruptedException {


        charging.draw();

        for (String sprite : CHARGINGDONE) {

            charging.load(sprite);
            Thread.sleep(250);
        }

        charging.delete();
    }


    public void drawMonsterCharging() throws InterruptedException {


        mCharging.draw();

        for (String sprite : CHARGINGDONE) {

            mCharging.load(sprite);
            Thread.sleep(250);
        }

       mCharging.delete();
    }



    public void drawPlayerIdle() throws InterruptedException {

        animate(IDLESPRITES);

    }


    public void drawActionBar() {
        actionBar.draw();
    }

    public void deleteActionBar() {
        actionBar.delete();
    }


    public void drawMonsterA() {

        monster_A.load(MONSTER_A);
        monster_A.draw();
    }

    public void deleteMonsterA() throws InterruptedException {

        monster_A.load(MONSTER_A);
        Thread.sleep(1000);
        monster_A.delete();
    }
}
