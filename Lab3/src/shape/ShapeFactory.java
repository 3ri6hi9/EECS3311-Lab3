package shape;

import java.awt.Color;

public class ShapeFactory {

	public static Rectangle getRectangle(int x, int y, int width, int height, Color color) {
		return new Rectangle(x, y, width, height, color);
	}
	
	public static Square getSquare(int x, int y, int width, int height, Color color) {
		return new Square(x, y, width, height, color);
	}
	
	public static Circle getCircle(int x, int y, int width, int height, Color color) {
		return new Circle(x, y, width, height, color);
	}
}