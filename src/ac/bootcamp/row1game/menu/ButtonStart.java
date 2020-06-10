package ac.bootcamp.row1game.menu;

import ac.bootcamp.row1game.Game;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

public class ButtonStart extends Button {

	private double originalY;
	private final HomeMenu homeMenu;

	private long lastUpdate = System.currentTimeMillis();

	public ButtonStart(double x, double y, HomeMenu homeMenu, String source) {
		super(x, y, source);

		this.originalY = y;
		this.homeMenu = homeMenu;
	}

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
		homeMenu.destroy();
		new Thread() {
			@Override
			public void run() {
				try {
					Game game = new Game();
					game.start();
				} catch(InterruptedException e) {
					System.out.println("Something went wrong");
					System.exit(0);
				}
			}
		}.start();
	}

	@Override
	public int getKey() {
		return KeyboardEvent.KEY_SPACE;
	}
}