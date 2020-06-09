package ac.bootcamp.row1game.display;

import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Display {


    private final String BACKGROUND = "assets/sprites/background.jpg";
    private final String ACTION_BAR = "assets/sprites/action_bar.jpg";
    private final String PLAYER = "assets/sprites/shoot_0.png";
    private final String SOLDIER_NORMAL = "assets/sprites/soldier_normal.png";
    private final String SOLDIER_ARMOURED = "assets/sprites/soldier_armoured.png";
    private final String SOLDIER_DEAD = "assets/sprites/soldier_dead.png";
    private final String PLAYER_SHOOT_1 = "assets/sprites/shoot_1.png";
    private final String PLAYER_SHOOT_2 = "assets/sprites/shoot_2.png";
    private final String PLAYER_SHOOT_3 = "assets/sprites/shoot_3.png";
    private final String PLAYER_SHOOT_4 = "assets/sprites/shoot_4.png";

    private Picture background;
    private Picture actionBar;
    private Picture player;
    private Picture soldierNormal;
    private Picture soldierArmoured;
    private Picture gunshot;
    private Text text;

    public Display() {

        // TODO: Change magic number into variables depending on image size
        background = new Picture(10, 10, BACKGROUND);
        actionBar = new Picture(228, 320, ACTION_BAR);
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

    public void drawGunshot() throws InterruptedException {

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

    public void drawActionBar(){
        actionBar.draw();
    }

    public void deleteActionBar(){
        actionBar.delete();
    }


}
