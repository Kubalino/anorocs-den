package ac.bootcamp.row1game.menu;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class HomeMenu implements KeyboardHandler {

	private Keyboard keyboard;
	private Picture bar;
	private Rectangle rectangleSky;
	private Picture mountains;
	private Picture pillars;
	private Button buttonStart;
	private Button buttonExit;
	private Button buttonInstruction;
	private Picture backgroundSky;
	private Actor bat;
	private Actor cloud;
	private Actor[] actors = new Actor[2];

	public HomeMenu() {
		keyboard = new Keyboard(this);
	}

	public void init() {
		rectangleSky = new Rectangle(10, 10, 1280, 720);
		rectangleSky.setColor(Color.DARK_GRAY);
		rectangleSky.fill();
		
		backgroundSky = new Picture(rectangleSky.getX(), rectangleSky.getY(), "assets/mainMenu/background/sky.png");
		backgroundSky.draw();
		
		mountains = new Picture(rectangleSky.getX(),rectangleSky.getY(),"assets/mainMenu/background/mountains.png");
		mountains.draw();
		
		cloud = new Actor(500,300,"assets/mainMenu/actors/cloud.png");
		cloud.changeToCloud();
		actors[0] = cloud;
		cloud.draw();
		
		bat = new Actor(500,200,"assets/mainMenu/actors/bat.png");
		bat.changeToBat();
		actors[1] = bat;
		bat.draw();
		
		pillars = new Picture(rectangleSky.getX(),rectangleSky.getY(),"assets/mainMenu/background/pillars.png");
		pillars.draw();
		
		bar = new Picture(rectangleSky.getX(),rectangleSky.getY(),"assets/mainMenu/background/bar.png");
		bar.draw();
		

		buttonStart = new ButtonStart(500, 612, "assets/mainMenu/buttons/buttonStart.png");
		drawAndRegisterButton(buttonStart);

		buttonExit = new ButtonExit(900, 612, "assets/mainMenu/buttons/buttonExit.png");
		drawAndRegisterButton(buttonExit);
	
		buttonInstruction = new ButtonInstructions(250, 612, "assets/mainMenu/buttons/buttonInfo.png");	
		drawAndRegisterButton(buttonInstruction);

		menuLoop();
	}
	
	private void menuLoop() {
		while(true) {
			for(Actor actor : actors) {
				actor.repaint();
			}
		}
	}

	private void drawAndRegisterButton(Button button) {
		button.draw();
		Mouse mouse = new Mouse(button);
		mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
//		mouse.addEventListener(MouseEventType.MOUSE_MOVED);
	}

	@Override
	public void keyPressed(KeyboardEvent keyboardEvent) {

	}

	@Override
	public void keyReleased(KeyboardEvent keyboardEvent) {

	}
}