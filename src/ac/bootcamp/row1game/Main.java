package ac.bootcamp.row1game;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Main {

    public static void main(String[] args) {

        System.out.println("Game");

       Rectangle rectangle = new Rectangle(10,10, 300,300);

        rectangle.setColor(Color.GREEN);
        rectangle.fill();

        Text text = new Text(15,15,"ROW1GAME");
        text.setColor(Color.BLACK);
        text.draw();


    }
}
