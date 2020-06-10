package ac.bootcamp.row1game.menu;

import ac.bootcamp.row1game.Game;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

public class ButtonStart extends Button {

	private double originalY;

	public ButtonStart(double x, double y, String source) {
		super(x, y, source);

		this.originalY = y;
	}

	private long lastUpdate = System.currentTimeMillis();

	@Override
	public void update() {
		super.update();
		if(System.currentTimeMillis() - lastUpdate > 320) {
			lastUpdate = System.currentTimeMillis();
			int height = 32;
			float count = System.currentTimeMillis() % height;
			float dYY = (float) Math.sin(count) * height;

			setPosition(getX(), originalY + dYY * 0.16F);
		}
	}

	@Override
	public void processMouseClicked(MouseEvent mouseEvent) {
		new Game();
		System.out.println("Loading");
	}
}