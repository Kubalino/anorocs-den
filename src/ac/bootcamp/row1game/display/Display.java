package ac.bootcamp.row1game.display;

import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import static ac.bootcamp.row1game.display.Sprites.*;

public class Display {

    private Picture background;
    private Picture actionBar;
    private Picture player;
    private Picture soldierNormal;
    private Picture soldierArmoured;
    private Text text;

    public Display() {

        // TODO: Change magic number into variables depending on image size
        background = new Picture(10, 10, BACKGROUND);
        actionBar = new Picture(228, 520, ACTION_BAR);
        player = new Picture(100, 150, PLAYER);
        soldierNormal = new Picture(450, 100, SOLDIER_NORMAL);
        soldierArmoured = new Picture(450, 100, SOLDIER_ARMOURED);
    }

    public void init() {

        background.draw();
        player.draw();

    }

    public void drawSoldierNormal() {

        soldierNormal.load(SOLDIER_NORMAL);
        soldierNormal.draw();
    }

    public void deleteSoldierNormal() throws InterruptedException {

        soldierNormal.load(SOLDIER_DEAD);
        Thread.sleep(1000);
        soldierNormal.delete();
    }

    public void drawSoldierArmoured() {

        soldierArmoured.load(SOLDIER_ARMOURED);
        soldierArmoured.draw();
    }

    public void deleteSoldierArmoured() throws InterruptedException {

        soldierArmoured.load(SOLDIER_DEAD);
        Thread.sleep(1000);
        soldierArmoured.delete();
    }

    public void drawPlayerAttack() throws InterruptedException {

        player.load(PLAYER_SHOOT_1);
        Thread.sleep(200);
        player.load(PLAYER_SHOOT_2);
        Thread.sleep(200);
        player.load(PLAYER_SHOOT_3);
        Thread.sleep(200);
        player.load(PLAYER_SHOOT_4);
        Thread.sleep(200);
        player.load(PLAYER);
    }


    public void drawPlayerIdle() throws InterruptedException {
        player.load(PLAYER_IDLE_1);
        Thread.sleep(200);
        player.load(PLAYER_IDLE_2);
        Thread.sleep(200);
        player.load(PLAYER_IDLE_3);
        Thread.sleep(200);
        player.load(PLAYER_IDLE_4);
        Thread.sleep(200);
    }


    public void drawActionBar(){
        actionBar.draw();
    }

    public void deleteActionBar(){
        actionBar.delete();
    }


}
