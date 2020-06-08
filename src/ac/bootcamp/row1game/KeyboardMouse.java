package ac.bootcamp.row1game;
import ac.bootcamp.row1game.simplegraphics.keyboard.Keyboard;
import ac.bootcamp.row1game.keyboard.KeyboardEvent;
import ac.bootcamp.row1game.simplegraphics.keyboard.KeyboardEventType;
import ac.bootcamp.row1game.simplegraphics.keyboard.KeyboardHandler;
public class KeyboardMouse implements KeyboardHandler{

    private Keyboard keyboard = new Keyboard(this);
    private boolean key1 = false;
    private boolean key2 = false;
    private boolean key3 = false;
    private boolean key4 = false;
    private boolean keyEspace = false;
    private boolean keyquit = false;
    private boolean keyHelp = false;



    public KeyboardAndMouse(){

    }

    public void init() {

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

    public boolean isKey3() {
        return key3;
    }

    public boolean isKey4() {
        return key4;
    }

    public boolean isKeyEspace() {
        return keyEspace;
    }

    public boolean isKeyquit() {
        return keyquit;
    }

    public boolean isKeyHelp() {
        return keyHelp;
    }

    public void setKey1(boolean key1) {
        this.key1 = key1;
    }

    public void setKey2(boolean key2) {
        this.key2 = key2;
    }

    public void setKey3(boolean key3) {
        this.key3 = key3;
    }

    public void setKey4(boolean key4) {
        this.key4 = key4;
    }

    public void setKeyEspace(boolean keyEspace) {
        this.keyEspace = keyEspace;
    }

    public void setKeyquit(boolean keyquit) {
        this.keyquit = keyquit;
    }

    public void setKeyHelp(boolean keyHelp) {
        this.keyHelp = keyHelp;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_1:
                key1=true;
                break;
            case KeyboardEvent.KEY_2:
                key2= true;
                break;
            case KeyboardEvent.KEY_3:
                key3 =true;
                break;
            case KeyboardEvent.KEY_4:
                key4=true;
                break;
            case KeyboardEvent.KEY_SPACE:
                keyEspace = true;
                break;
            case KeyboardEvent.KEY_Q:
                keyquit=true;
                break;
            case KeyboardEvent.KEY_H:
                keyHelp=true;
                break;
        }

    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

