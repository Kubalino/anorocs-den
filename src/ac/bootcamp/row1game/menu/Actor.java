package ac.bootcamp.row1game.menu;

import java.util.Random;

public class Actor extends AnimatedPicture {

	private double speed;

	public Actor(double x, double y, ActorType actorType) {
		super(x, y, actorType.getFrames());

		changeToType(actorType);
	}

	public Actor(double x, double y, String source) {
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
		draw();
	}

	private void changeToRandomActor() {
		ActorType randomType = ActorType.random();
		changeToType(randomType);
	}

	private void resetPosition() {
		setPosition(1120, 100 + (Math.random() * 200));
	}

	public boolean isOutsideMap() {
		return getX() <= 0;
	}

	private void changeToType(ActorType actorType) {
		initializeFrames(actorType.getFrames());
		speed = actorType.getSpeed();
	}

	public enum ActorType {
		BAT(-0.0004d, "mainMenu/actors/bat/bat_0.png",
				"mainMenu/actors/bat/bat_1.png",
				"mainMenu/actors/bat/bat_2.png",
				"mainMenu/actors/bat/bat_1.png"),
		CLOUD(-0.00003d, "mainMenu/actors/cloud.png"),
		DRAGON(-0.001d, "mainMenu/actors/dragon/dragon_0.png",
				"mainMenu/actors/dragon/dragon_1.png",
				"mainMenu/actors/dragon/dragon_2.png",
				"mainMenu/actors/dragon/dragon_1.png");

		private double speed;
		private String[] frames;

		ActorType(double speed, String... frames) {
			this.speed = speed;
			this.frames = frames;
		}

		public String[] getFrames() {
			return frames;
		}

		public double getSpeed() {
			return speed;
		}

		public static ActorType random() {
			ActorType[] actorType = ActorType.values();
			Random random = new Random();
			ActorType actorTypeRandom = actorType[random.nextInt(actorType.length)];
			if(actorTypeRandom == CLOUD && random.nextBoolean()) {
				actorTypeRandom = actorType[random.nextInt(actorType.length)];
			}
			return actorTypeRandom;
		}
	}
}