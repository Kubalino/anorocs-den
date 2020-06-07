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
	private Picture background;
	private Rectangle rectangleSky;
	private Picture ground;
	private Picture grass;
	private Button buttonStart;
	private Button buttonExit;
	private Button buttonInstruction;

	public HomeMenu() {
		keyboard = new Keyboard(this);
	}

	public void init() {
		rectangleSky = new Rectangle(10, 10, 1280, 720);
		rectangleSky.setColor(Color.DARK_GRAY);
		rectangleSky.fill();
		//background = new Picture(rectangleSky.getX(), rectangleSky.getY(), "assets/background/GrassLand_Background_1.png");
		//background.draw();

		//ground = new Picture(rectangleSky.getX(), rectangleSky.getY(), "assets/background/GrassLand_Background_2.png");
		//ground.draw();
		//grass = new Picture(rectangleSky.getX(), rectangleSky.getY(), "assets/background/GrassLand_Background_3.png");
		//grass.draw();

		buttonStart = new ButtonStart(10, 10, "assets/background/buttonStart.png");
		drawAndRegisterButton(buttonStart);

		buttonExit = new ButtonExit(10, 111, "assets/background/buttonExit.png");
		drawAndRegisterButton(buttonExit);
	
		buttonInstruction = new ButtonInstructions(10, 212, "assets/background/buttonInfo.png");	
		drawAndRegisterButton(buttonInstruction);

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