package ac.bootcamp.row1game.menu;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Actor extends AnimatedPicture {

	private static final double BAT_SPEED = -0.0003d;
	private static final double CLOUD_SPEED = -0.00003d;
	private double speed;

	public Actor(double x, double y, String... source) {
		super(x, y, source);
	}

	@Override
	public void repaint() {
		super.repaint();

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
		setPosition(1200, 100 + (Math.random() * 200));
	}

	public boolean isOutsideMap() {
		return getX() <= 0;
	}

	public void changeToBat() {
		initializeFrames(ActorType.BAT.getFrames());
		speed = BAT_SPEED;
	}

	public void changeToCloud() {
		initializeFrames(ActorType.CLOUD.getFrames());
		speed = CLOUD_SPEED;
	}
	
	public enum ActorType {
		BAT("mainMenu/actors/bat/bat_0.png", "mainMenu/actors/bat/bat_1.png", "mainMenu/actors/bat/bat_2.png"),
		CLOUD("mainMenu/actors/cloud.png");

		private String[] frames;

		ActorType(String... frames) {
			this.frames = frames;
		}

		public String[] getFrames() {
			return frames;
		}
	}
}