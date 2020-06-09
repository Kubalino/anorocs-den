package ac.bootcamp.row1game.menu.sectors;

import ac.bootcamp.row1game.menu.Button;
import ac.bootcamp.row1game.menu.ButtonExit;
import ac.bootcamp.row1game.menu.ButtonInstructions;
import ac.bootcamp.row1game.menu.ButtonStart;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class InputSector {

	private Picture bar;
	private Button buttonStart;
	private Button buttonExit;
	private Button buttonInstruction;

	public void init(int x, int y) {

		bar = new Picture(x, y, "mainMenu/background/bar.png");
		bar.draw();

		buttonStart = new ButtonStart(500, 612, "mainMenu/buttons/buttonStart.png");
		drawAndRegisterButton(buttonStart);

		buttonExit = new ButtonExit(900, 612, "mainMenu/buttons/buttonExit.png");
		drawAndRegisterButton(buttonExit);

		buttonInstruction = new ButtonInstructions(250, 612, "mainMenu/buttons/buttonInfo.png");
		drawAndRegisterButton(buttonInstruction);
	}

	private void drawAndRegisterButton(Button button) {
		button.draw();
		Mouse mouse = new Mouse(button);
		mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
		//		mouse.addEventListener(MouseEventType.MOUSE_MOVED);
	}
}