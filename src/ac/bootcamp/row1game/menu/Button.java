package ac.bootcamp.row1game.menu;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public abstract class Button extends Actor implements MouseHandler, KeyboardHandler {
	

	public Button(double x, double y, String source) {
		super(x, y, source);
	}

	@Override
	public void mouseClicked(MouseEvent mouseEvent) {
		if(mouseEventIsWithinBounds(mouseEvent)) {
			processMouseClicked(mouseEvent);
		}
	}

	public void processMouseClicked(MouseEvent mouseEvent) {

	}

	private boolean mouseEventIsWithinBounds(MouseEvent mouseEvent) {
		if(mouseEvent.getX() >= getX() && mouseEvent.getX() <= getX() + getWidth()) {
			if(mouseEvent.getY() >= getY() && mouseEvent.getY() <= getY() + getHeight()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void mouseMoved(MouseEvent mouseEvent) {

	}

	@Override
	public void keyPressed(KeyboardEvent keyboardEvent) {
		processMouseClicked(null);
	}

	@Override
	public void keyReleased(KeyboardEvent keyboardEvent) {

	}

	public abstract int getKey();
	
}