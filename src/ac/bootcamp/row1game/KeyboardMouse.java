package ac.bootcamp.row1game;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class KeyboardMouse implements KeyboardHandler, MouseHandler {

    private Keyboard keyboard = new Keyboard(this);
    private boolean key1 = false;
    private boolean key2 = false;
    private boolean key3 = false;
    private boolean key4 = false;
    private boolean keySpace = false;
    private boolean keyQuit = false;
    private boolean keyHelp = false;
    private String keyPressed;
    private boolean isPressed = false;



    public KeyboardMouse(){

    }

    public void init() {

	Mouse m = new Mouse(this);
        m.addEventListener(MouseEventType.MOUSE_CLICKED);

        KeyboardEvent inputOne = new KeyboardEvent();
        inputOne.setKey(KeyboardEvent.KEY_1);
        inputOne.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(inputOne);

        KeyboardEvent inputTwo = new KeyboardEvent();
        inputTwo.setKey(KeyboardEvent.KEY_2);
        inputTwo.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(inputTwo);

        KeyboardEvent inputThree = new KeyboardEvent();
        inputThree.setKey(KeyboardEvent.KEY_3);
        inputThree.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(inputThree);

        KeyboardEvent inputFour = new KeyboardEvent();
        inputFour.setKey(KeyboardEvent.KEY_4);
        inputFour.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(inputFour);

        KeyboardEvent inputFive = new KeyboardEvent();
        inputFive.setKey(KeyboardEvent.KEY_5);
        inputFive.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(inputFive);

        KeyboardEvent inputSpace = new KeyboardEvent();
        inputSpace.setKey(KeyboardEvent.KEY_SPACE);
        inputSpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(inputSpace);

        KeyboardEvent inputQuit = new KeyboardEvent();
        inputQuit.setKey(KeyboardEvent.KEY_Q);
        inputQuit.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(inputQuit);

        KeyboardEvent inputHelp = new KeyboardEvent();
        inputHelp.setKey(KeyboardEvent.KEY_H);
        inputHelp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(inputHelp);
    }

    public boolean isKey1() {
        return key1;
    }

    public boolean isKey2() {
        return key2;
    }



    public String getKeyPressed(){
        return keyPressed;
    }

    public boolean getIsPressed() {
        if(isPressed){
            isPressed = false;
            return true;
        }
        return false;
    }

    public void setIsPressed(){
        isPressed = false;
    }



    @Override
    public  void keyPressed(KeyboardEvent keyboardEvent){

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_1:
                keyPressed = "1";
                break;

            case KeyboardEvent.KEY_2:
                keyPressed = "2";
                break;

            case KeyboardEvent.KEY_3:
                keyPressed = "3";
                break;

            case KeyboardEvent.KEY_4:
                keyPressed="4";
                break;

            case KeyboardEvent.KEY_5:
                keyPressed="5";
                break;

            case KeyboardEvent.KEY_SPACE:
                keyPressed = "space";
                break;

            case KeyboardEvent.KEY_Q:
               System.exit(0);
                break;

            case KeyboardEvent.KEY_H:
                keyPressed= "h";

                break;
        }

        isPressed = true;

    }

 	@Override
    public void mouseClicked(MouseEvent e) {
        int y = 95;
        int x1 = 362;
        int x2 = 478;
        int x3 = 600;
        int x4 = 717;
        int x5 = 784;

        if (e.getY()>60 && e.getY()<113){

            if(e.getX() > (x1-47) && e.getX() < (x1+47)){
                keyPressed = "1";
                isPressed = true;
            }
            if(e.getX() > (x2-47) && e.getX() < (x2+47)){
                keyPressed = "2";
                isPressed = true;
            }
            if(e.getX() > (x3-47) && e.getX() < (x3+47)){
                keyPressed = "3";
                isPressed = true;
            }
            if(e.getX() > (x4-47) && e.getX() < (x4+47)){
                keyPressed = "4";
                isPressed = true;
            }
            if(e.getX() > (x5-47) && e.getX() < (x5+47)){
                keyPressed = "5";
                isPressed = true;
            }
        }
    }



    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

	@Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

    

}

