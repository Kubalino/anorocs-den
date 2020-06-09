package ac.bootcamp.row1game.menu;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Actor extends Picture {

	private static final double BAT_SPEED = -0.0003d;
	private static final double CLOUD_SPEED = -0.00003d;
	private double speed;

	public Actor(int x, int y, String source) {
		super(x, y, source);
	}

	public void repaint() {

		translate(speed, 0d);
		if(isOutsideMap()) {
			changeToRandomActor();
			resetPosition();
		}
		Canvas.getInstance().show(this);
	}

	private void changeToRandomActor() {
		if(Math.random() < 0.5) {
			changeToCloud();
		} else {
			changeToBat();
		}
	}

	private void resetPosition() {
		int multiplier = 1;
		if(Math.random() < 0.5) {
			multiplier = -1;
		}
		translate(1200, Math.random() * 100 * multiplier);
	}

	public boolean isOutsideMap() {
		return getX() <= 0;
	}

	public void changeToBat() {
		this.load("assets/mainMenu/actors/bat.png");
		speed = BAT_SPEED;
	}

	public void changeToCloud() {
		this.load("assets/mainMenu/actors/cloud.png");
		speed = CLOUD_SPEED;
	}
}