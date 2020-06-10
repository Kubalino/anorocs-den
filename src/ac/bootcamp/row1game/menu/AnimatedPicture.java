package ac.bootcamp.row1game.menu;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.graphics.Shape;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.URL;

public class AnimatedPicture implements Shape, Movable {
	private BufferedImage image;
	private BufferedImage[] allFrames;
	private ImageIcon[] allFrameIcons;
	private final JLabel label = new JLabel();
	private double x;
	private double y;
	private double xGrow;
	private double yGrow;
	private int timeBetweenFrames;

	public AnimatedPicture(double x, double y, String... frames) {
		this(x, y, 160, frames);
	}

	public AnimatedPicture(double x, double y, int timeBetweenFrames, String... frames) {
		this.x = x;
		this.y = y;
		this.timeBetweenFrames = timeBetweenFrames;
		initializeFrames(frames);
	}

	protected void initializeFrames(String... frames) {
		allFrames = new BufferedImage[frames.length];
		allFrameIcons = new ImageIcon[allFrames.length];
		for(int i = 0; i < allFrames.length; i++) {
			allFrames[i] = fetchImageFromSource(frames[i]);
			//If allFrames[i] is null, it means that the image was either not found, or something went bad
			allFrameIcons[i] = new ImageIcon(allFrames[i]);
		}
		changeFrame(0);
	}

	private BufferedImage fetchImageFromSource(String source) {

		try {
			if(source.startsWith("http://")) {
				// Try to fetch it from the internet, since it has the protocol
				return ImageIO.read(new URL(source).openStream());
			}
			InputStream resourceAsStream = this.getClass().getResourceAsStream(source.startsWith("/") ? source : "/" + source);
			if(resourceAsStream != null) {
				return ImageIO.read(resourceAsStream);
			}
		} catch(Exception var3) {
			this.image = null;
			this.label.setIcon(null);
			var3.printStackTrace();
		}
		return null;
	}

	public void repaint() {
		if(allFrames.length > 1) {
			long time = System.currentTimeMillis() / timeBetweenFrames;
			long currentFrame = time % allFrames.length;
			changeFrame((int) currentFrame);
		}
		draw();
	}

	private void changeFrame(int frameIndex) {
		this.image = allFrames[frameIndex];
		this.label.setIcon(allFrameIcons[frameIndex]);
	}

	public int pixels() {
		return this.image == null ? 0 : this.image.getWidth() * this.image.getHeight();
	}

	public void setPosition(double xPos, double yPos) {
		this.x = xPos;
		this.y = yPos;
		Canvas.getInstance().repaint();
	}

	@Override
	public void translate(double dx, double dy) {
		this.x += dx;
		this.y += dy;
		Canvas.getInstance().repaint();
	}

	@Override
	public void grow(double dw, double dh) {
		this.xGrow += dw;
		this.yGrow += dh;
		Canvas.getInstance().repaint();
	}

	@Override
	public void draw() {
		Canvas.getInstance().show(this);
	}

	@Override
	public void delete() {
		Canvas.getInstance().hide(this);
	}

	@Override
	public void paintShape(Graphics2D g2) {
		if(this.image != null) {
			Dimension dim = this.label.getPreferredSize();
			if(dim.width > 0 && dim.height > 0) {
				this.label.setBounds(0, 0, dim.width, dim.height);
				g2.translate(this.getX(), this.getY());
				g2.scale(((double) this.image.getWidth() + 2.0D * this.xGrow) / (double) dim.width, ((double) this.image.getHeight() + 2.0D * this.yGrow) / (double) dim.height);
				this.label.paint(g2);
			}
		}

	}

	@Override
	public int getWidth() {
		return (int) Math.round((this.image == null ? 0 : this.image.getWidth()) + 2.0D * this.xGrow);
	}

	@Override
	public int getHeight() {
		return (int) Math.round((this.image == null ? 0 : this.image.getHeight()) + 2.0D * this.yGrow);
	}

	@Override
	public int getX() {
		return (int) Math.round(this.x - this.xGrow);
	}

	@Override
	public int getY() {
		return (int) Math.round(this.y - this.yGrow);
	}
}