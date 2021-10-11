package shape;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Comparable<Shape> {
	private int x;
	private int y;
	private int width;
	private int height;
	private Color shapeColor;
	
	abstract protected double getArea();
	abstract protected void drawShape(Graphics g);
	
	@Override
	public int compareTo(Shape a) {
		if (this.getArea() > a.getArea())
		{
			return 1;
		}
		return 0;
	}
    
	//getters
    public Color getColor() {
		return shapeColor;
	}
    
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
	public int getUpperX() {
		return x;
	}
	
	public int getUpperY() {
		return y;
	}
	
	//setters
	 public void setColor(Color aShapeColor) {
		 this.shapeColor = aShapeColor;
	 }
	 
	 public void setWidth(int width) {
		 this.width = width;
	 }
	    
	 public void setHeight(int height) {
		 this.height = height;
	 }
	 
	 public void setUpperX(int upperX) {
		 this.x = upperX;
	 }
		
	 public void setUpperY(int upperY) {
		 this.y = upperY;
	 }
}