package shape;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	/**
	 * Class's constructor
	 * @param upperX
	 * @param upperY
	 * @param width
	 * @param height
	 * @param shapeColor
	 */
	public Rectangle (int upperX, int upperY, int width, int height, Color shapeColor) {
		this.setUpperX(upperX);
		this.setUpperY(upperY);
		this.setWidth(width);
		this.setHeight(height);
		this.setColor(shapeColor);
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getHeight() * this.getWidth();
	}

	@Override
	public void drawShape(Graphics g) {
		// TODO Auto-generated method stub
		g.fillRect(this.getUpperX(), this.getUpperY(), this.getWidth(), this.getHeight());
	}
}