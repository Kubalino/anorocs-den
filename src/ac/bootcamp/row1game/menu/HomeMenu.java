package ac.bootcamp.row1game.menu;

import ac.bootcamp.row1game.menu.sectors.InputSector;
import ac.bootcamp.row1game.menu.sectors.VisualSector;

public class HomeMenu {

	private VisualSector visualSector;
	private InputSector inputSector;

	public void init() {

		visualSector = new VisualSector();
		visualSector.init();
		
		inputSector = new InputSector(this);
		inputSector.init();
		
		visualSector.menuLoop();
	}

	public void destroy() {
		visualSector.destroy();
		inputSector.destroy();
	}
}