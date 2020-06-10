package ac.bootcamp.row1game.display;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import static ac.bootcamp.row1game.display.Sprites.*;

public class Display {

    private Picture background;
    private Picture actionBar;
    private Picture player;
    private Picture soldierNormal;
    private Text text;

    public Display() {

        // TODO: Change magic number into variables depending on image size
        background = new Picture(10, 10, BACKGROUND_1);
        actionBar = new Picture(228, 520, ACTION_BAR);
        player = new Picture(100, 150, PLAYER);
        soldierNormal = new Picture(450, 100, SOLDIER_NORMAL);
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

    public void drawBackground(int bg) {
        switch (bg){
            case 1: background.load(BACKGROUND_2); break;
            case 2: background.load(BACKGROUND_3); break;
            case 3: background.load(BACKGROUND_4); break;
        }
    }



    public void drawGameOver() throws InterruptedException{
        player.delete();
        actionBar.delete();
        background.load(BACKGROUND_5);

        Thread.sleep(2000);
        text = new Text(300, 100,"You defeated all monsters!");
        text.setColor(Color.WHITE);
        text.grow(100,50);
        text.draw();
        Thread.sleep(2000);
        text = new Text(300, 200,"The world is safe again.");
        text.setColor(Color.WHITE);
        text.grow(100,50);
        text.draw();
        Thread.sleep(2000);
        text = new Text(300, 300,"Suddenly you die!!!");
        text.setColor(Color.WHITE);
        text.grow(100,50);
        text.draw();
        Thread.sleep(2000);
        text = new Text(300, 400,"You could not defeat COVID-19");
        text.setColor(Color.WHITE);
        text.grow(100,50);
        text.draw();
        Thread.sleep(2000);


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
