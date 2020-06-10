package ac.bootcamp.row1game.menu;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;

public class ButtonInstructions  extends Button{
	
	public ButtonInstructions(double x, double y, String source) {
		super(x, y, source);
	}

	@Override
	public void processMouseClicked(MouseEvent mouseEvent) {
		//Fazer no fim do jogo 
	}

	@Override
	public int getKey() {
		return KeyboardEvent.KEY_I;
	}
}