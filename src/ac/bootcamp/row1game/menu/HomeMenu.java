package ac.bootcamp.row1game.menu;

import ac.bootcamp.row1game.menu.sectors.InputSector;
import ac.bootcamp.row1game.menu.sectors.VisualSector;
import org.academiadecodigo.simplegraphics.graphics.Canvas;

public class HomeMenu {

	private VisualSector visualSector;
	private InputSector inputSector;

	private Thread thread = new Thread();

	public void init() {

		visualSector = new VisualSector();
		visualSector.init();

		inputSector = new InputSector(this);
		inputSector.init();

		thread = new Thread() {
			@Override
			public void run() {
				visualSector.menuLoop();
			}
		};
		thread.start();
	}

	public void destroy() {
		thread.stop();
		visualSector.destroy();
		inputSector.destroy();
		Canvas.getInstance().getShapes().clear();
	}
}