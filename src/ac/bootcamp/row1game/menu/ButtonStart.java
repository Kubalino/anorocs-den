package ac.bootcamp.row1game.menu;

import ac.bootcamp.row1game.Game;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

public class ButtonStart extends Button{
	
	public ButtonStart(double x, double y, String source) {
		super(x, y, source);
	}
	
	
	@Override
	public void processMouseClicked(MouseEvent mouseEvent) {
		new Game();
		System.out.println("Loading");
	}
}