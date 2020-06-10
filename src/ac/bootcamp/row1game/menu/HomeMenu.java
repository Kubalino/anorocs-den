package ac.bootcamp.row1game.menu;

import ac.bootcamp.row1game.menu.sectors.InputSector;
import ac.bootcamp.row1game.menu.sectors.VisualSector;
import ac.bootcamp.row1game.menu.sound.GameSound;
import ac.bootcamp.row1game.menu.sound.SoundManager;
import org.academiadecodigo.simplegraphics.graphics.Canvas;

public class HomeMenu {

	private VisualSector visualSector;
	private InputSector inputSector;

	private Thread thread = new Thread();
	private SoundManager soundManager = new SoundManager();

	public void init() {
		soundManager.init();

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
		//SoundManager.playSound(GameSound.MAIN_MENU);
	}

	public void destroy() {
		thread.stop();
		visualSector.destroy();
		inputSector.destroy();
		Canvas.getInstance().getShapes().clear();
	}
}