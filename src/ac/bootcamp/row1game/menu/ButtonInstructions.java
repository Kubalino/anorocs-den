package ac.bootcamp.row1game.menu;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

public class ButtonInstructions extends Button {

	private AnimatedPicture papyrus;

	public ButtonInstructions(double x, double y, String source) {
		super(x, y, source);
	}

	@Override
	public void processMouseClicked(MouseEvent mouseEvent) {
		if(papyrus == null) {
			papyrus = new AnimatedPicture(10, 10, "mainMenu/background/papyrus.png");
			papyrus.draw();
		} else {
			papyrus.delete();
			papyrus = null;
		}
	}

	@Override
	public int getKey() {
		return KeyboardEvent.KEY_I;
	}
}