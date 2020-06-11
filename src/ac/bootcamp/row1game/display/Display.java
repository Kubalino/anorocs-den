package ac.bootcamp.row1game.display;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import static ac.bootcamp.row1game.display.Sprites.*;

public class Display {

    private Picture background;
    private Picture actionBar;
    private Picture player;
    private Picture monster;
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

    public Display() {

        // TODO: Change magic number into variables depending on image size
        background = new Picture(10, 10, BACKGROUND_1);
        actionBar = new Picture(300, 0, ACTION_BAR);
        player = new Picture(150, 375, PLAYER_IDLE_1);
        monster = new Picture(690, 180, MONSTER_A_1);
        attack = new Picture(800, 260, ATTACK_1);
        spell = new Picture(800, 180, SPELL_1);
        charge = new Picture(800,0,CHARGE_1);
        mAttack = new Picture(170, 375, M_ATTACK_1);
        mSpell = new Picture(170, 175, SPELL_1);
        mCharge = new Picture(170,0, CHARGE_1);
        charging = new Picture(250, 400, CHARGING_1);
        mCharging = new Picture(700, 400, CHARGING_1);
        block = new Picture(250, 400, BLOCK_1);
        mBlock = new Picture(700,400,BLOCK_1);


    }

    public void init()throws InterruptedException{


        drawGameIntro();
        background.load(BACKGROUND_1);
        player.draw();

    }

    public void playerHealthBard(int hp,int max){
        int current = (int)((hp*400)/max);
        Rectangle r = new Rectangle(50,670,400,50);
        Rectangle m = new Rectangle(50,670,current,50);
        r.setColor(Color.RED);
        m.setColor(Color.GREEN);
        r.fill();
        m.fill();
    }

    public void monsterHealthBar(int hp, int max){
        int current = (int)((hp*400)/max);
        Rectangle r = new Rectangle(800,670,400,50);
        Rectangle m = new Rectangle(800,670,current,50);
        r.setColor(Color.RED);
        m.setColor(Color.GREEN);
        r.fill();
        m.fill();
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

    public void drawGameIntro() throws InterruptedException {

        background.draw();

        for(String intro : INTROS){
            background.load(intro);
            Thread.sleep(4000);
        }

    }

    public void drawGameEnding() throws InterruptedException {
        Picture p = new Picture(10,10, BACKGROUND_5);
        p.draw();
        Thread.sleep(5000);
        p.load(CREDITS);
    }

    public void drawGameOver() throws InterruptedException {
        Rectangle r = new Rectangle(10,1,1280,720);
        r.setColor(Color.BLACK);
        r.fill();
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

    public void monsterGetHit(int hitDamage) throws  InterruptedException{
        Text t = new Text(900,400,String.valueOf(hitDamage));
        t.setColor(Color.WHITE);
        t.grow(50,50);
        t.draw();
        for(int i = 0; i < 7; i++){
            t.translate(0,-10);
            Thread.sleep(200);
        }
        t.delete();

    }
    public void playerGetHit(int hitDamage) throws  InterruptedException{
        Text t = new Text(300,400,String.valueOf(hitDamage));
        t.setColor(Color.WHITE);
        t.grow(50,50);
        t.draw();
        for(int i = 0; i < 7; i++){
            t.translate(0,-10);
            Thread.sleep(200);
        }
        t.delete();

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


    public void drawMonster(int monsterType) {

        switch (monsterType) {
            case 0:
                monster.load(MONSTER_A_1);
                break;
            case 1:
                monster.load(MONSTER_B_1);
                break;
            case 2:
                monster.load(MONSTER_C_1);
                break;
            case 3:
                monster.load(MONSTER_D_1);
                break;


        }
        monster.draw();
    }

    public void deleteMonster() throws InterruptedException {

      //  monster.load(MONSTER_A_X);
        Thread.sleep(1000);
        monster.delete();
    }
}
