package ac.bootcamp.row1game.menu.sectors;

import ac.bootcamp.row1game.menu.Button;
import ac.bootcamp.row1game.menu.ButtonExit;
import ac.bootcamp.row1game.menu.ButtonInstructions;
import ac.bootcamp.row1game.menu.ButtonStart;
import ac.bootcamp.row1game.menu.HomeMenu;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;

public class InputSector {

	private Button buttonStart;
	private Button buttonExit;
	private Button buttonInstruction;
	private boolean running = true;
	private HomeMenu homeMenu;
	private Thread thread;

	public InputSector(HomeMenu homeMenu) {
		this.homeMenu = homeMenu;
	}

	public void init() {

		//bar = new Picture(x, y, "mainMenu/background/bar.png");
		//bar.draw();

		buttonStart = new ButtonStart(600, 612, homeMenu, "mainMenu/buttons/buttonStart.png");
		drawAndRegisterButton(buttonStart);

		buttonExit = new ButtonExit(900, 612, "mainMenu/buttons/buttonExit.png");
		drawAndRegisterButton(buttonExit);

		buttonInstruction = new ButtonInstructions(250, 612, "mainMenu/buttons/buttonInfo.png");
		drawAndRegisterButton(buttonInstruction);

		thread = new Thread() {
			@Override
			public void run() {
				while(running) {
					buttonStart.repaint();
				}
			}
		};
		thread.start();
	}

	public void destroy() {
		running = false;
		thread.stop();
		buttonStart.delete();
		buttonExit.delete();
		buttonInstruction.delete();
	}

	private void drawAndRegisterButton(Button button) {
		button.draw();
		Mouse mouse = new Mouse(button);
		mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
		//		mouse.addEventListener(MouseEventType.MOUSE_MOVED);
	}
}