package ac.bootcamp.row1game.menu;

import ac.bootcamp.row1game.menu.sectors.InputSector;
import ac.bootcamp.row1game.menu.sectors.VisualSector;

public class HomeMenu {

	public void init() {

		VisualSector visualSector = new VisualSector();

		visualSector.init();
		new InputSector().init(visualSector.getX(), visualSector.getY());
		visualSector.menuLoop();
	}

}