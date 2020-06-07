package ac.bootcamp.row1game.menu;

import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Button extends Picture implements MouseHandler {

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
}