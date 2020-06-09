package ac.bootcamp.row1game.menu.sectors;

import ac.bootcamp.row1game.menu.Actor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class VisualSector {

	private Rectangle rectangleSky;
	private Picture mountains;
	private Picture pillars;
	private Picture backgroundSky;
	private Actor bat;
	private Actor cloud;
	private Actor[] actors = new Actor[2];

	public void init() {
		rectangleSky = new Rectangle(10, 10, 1280, 720);
		rectangleSky.setColor(Color.DARK_GRAY);
		rectangleSky.fill();

		backgroundSky = new Picture(rectangleSky.getX(), rectangleSky.getY(), "mainMenu/background/sky.png");
		backgroundSky.draw();

		mountains = new Picture(rectangleSky.getX(), rectangleSky.getY(), "mainMenu/background/mountains.png");
		mountains.draw();

		cloud = new Actor(500, 300, "mainMenu/actors/cloud.png");
		cloud.changeToCloud();
		actors[0] = cloud;
		cloud.draw();

		bat = new Actor(500, 200, "mainMenu/actors/bat.png");
		bat.changeToBat();
		actors[1] = bat;
		bat.draw();

		pillars = new Picture(rectangleSky.getX(), rectangleSky.getY(), "mainMenu/background/pillars.png");
		pillars.draw();
	}

	public void menuLoop() {
		while(true) {
			for(Actor actor : actors) {
				actor.repaint();
			}
		}
	}

	public int getX() {
		return rectangleSky.getX();
	}

	public int getY() {
		return rectangleSky.getY();
	}

}