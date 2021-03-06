package ac.bootcamp.row1game.menu;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

public class ButtonExit extends Button {
	
	public ButtonExit(double x, double y, String source) {
		super(x, y, source);
	}

	@Override
	public void processMouseClicked(MouseEvent mouseEvent) {
		System.exit(0);
	}

	@Override
	public int getKey() {
		return KeyboardEvent.KEY_Q;
	}
}