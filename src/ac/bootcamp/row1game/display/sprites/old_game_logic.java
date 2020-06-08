/*package ac.bootcamp.row1game.display.sprites;


import ac.bootcamp.sniper_elite.display.Display;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class old_game_logic implements KeyboardHandler {

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;
    private Display display;
    private Keyboard keyboard;

    //Extra Statistics
    private int enemiesKilled;
    private boolean skillOne;
    private boolean skillTwo;


    public old_game_logic(int numberOfObjects) {

        gameObjects = createObjects(numberOfObjects);
        sniperRifle = new SniperRifle();
        shotsFired = 0;

        // Extra Statistics
        enemiesKilled = 0;
        display = new Display();
        keyboard = new Keyboard(this);
        skillOne = false;
        skillTwo = false;

    }

    public void start() throws InterruptedException {

        display.init();

        KeyboardEvent inputOne = new KeyboardEvent();
        inputOne.setKey(KeyboardEvent.KEY_1);
        inputOne.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(inputOne);

        KeyboardEvent inputTwo = new KeyboardEvent();
        inputTwo.setKey(KeyboardEvent.KEY_2);
        inputTwo.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(inputTwo);


        for (GameObject object : gameObjects) {

            System.out.println("----------------------------------");

            if (object instanceof Enemy) {

                System.out.println(object.getMessage());
                if (object instanceof SoldierEnemy) {
                    display.drawSoldierNormal();
                }

                if (object instanceof ArmouredEnemy) {
                    display.drawSoldierArmoured();
                }


                while (!((Destroyable) object).isDestroyed()) {

                  //  display.drawActionBar();
                  //  System.out.println("entrou loop");
                   // System.out.println("");
                    Thread.sleep(100);

                    if (skillOne) {
                        skillOne = false;
                        display.drawGunshot();
                        sniperRifle.shoot((Enemy) object);
                        shotsFired++;

                    }

                    if (skillTwo) {
                        skillTwo = false;
                        sniperRifle.shoot((Enemy) object);

                    }


                }
               display.deleteActionBar();
                enemiesKilled++;

                if (object instanceof SoldierEnemy) {
                    display.deleteSoldierNormal();
                }

                if (object instanceof ArmouredEnemy) {
                    display.deleteSoldierArmoured();
                }

            }


        }
        gameOver();
    }

    private void gameOver() {
        System.out.println("----------------------------------");
        System.out.println("Statistics:");

        // At the end show the total number of shots fired.

        System.out.println("Shots fired: " + shotsFired);
        System.out.println("Enemies killed: " + enemiesKilled);
        System.out.println("----------------------------------");
    }


    private GameObject[] createObjects(int numberOfObjects) {

        GameObject[] newObjects = new GameObject[numberOfObjects];

        // Create an array of game objects with enemies and trees;
        // There is a higher probability of having enemies than trees;

        for (int i = 0; i < newObjects.length; i++) {

            int randomize = (int) Math.floor(Math.random() * 100);


            if (randomize < 50) {
                newObjects[i] = new ArmouredEnemy();
            }

            if (randomize >= 50) {
                newObjects[i] = new SoldierEnemy();
            }

        }

        return newObjects;
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_1:
                skillOne = true;
                break;
            case KeyboardEvent.KEY_2:
                skillTwo = true;
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
*/