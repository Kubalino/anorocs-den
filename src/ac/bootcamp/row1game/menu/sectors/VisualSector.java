package ac.bootcamp.row1game.menu.sectors;

import ac.bootcamp.row1game.menu.Actor;
import ac.bootcamp.row1game.menu.Actor.ActorType;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class VisualSector {

	private Rectangle rectangleSky;
	private Picture mountains;
	private Picture pillars;
	private Picture backgroundSky;
	private final Actor[] actors = new Actor[5];

	public void init() {
		rectangleSky = new Rectangle(10, 10, 1280, 720);
		rectangleSky.setColor(Color.DARK_GRAY);
		rectangleSky.fill();

		backgroundSky = new Picture(rectangleSky.getX(), rectangleSky.getY(), "mainMenu/background/sky.png");
		backgroundSky.draw();

		mountains = new Picture(rectangleSky.getX(), rectangleSky.getY(), "mainMenu/background/mountains.png");
		mountains.draw();

		createRandomActors();

		pillars = new Picture(rectangleSky.getX(), rectangleSky.getY(), "mainMenu/background/pillars.png");
		pillars.draw();
	}

	private void createRandomActors() {
		for(int i = 0; i < actors.length; i++) {
			ActorType randomActorType = Math.random() > 0.5 ? ActorType.BAT : ActorType.CLOUD;
			double randomX = Math.random() * rectangleSky.getWidth();
			double randomY = Math.random() * rectangleSky.getHeight();
			actors[i] = new Actor(randomX, randomY, randomActorType);
			actors[i].draw();
		}
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