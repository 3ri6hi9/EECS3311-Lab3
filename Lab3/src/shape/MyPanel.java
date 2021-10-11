package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	List<Shape> shapeList = new ArrayList<Shape>();
	static MyPanel panel = new MyPanel();
	static JFrame frame = new JFrame("EECS3311 - Lab3");
	
	/**
	 * This method displays the created rectangles.
	 */
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;
      
      for (Shape shape: shapeList) {
    	  g2d.setColor(shape.getColor());
    	  shape.drawShape(g2d);
      }
      
      repaint();
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
	   if (e.getActionCommand() == "Load shapes") {
		   shapeList.clear();
		   int[] randomValues = new int[8];
		   int[] colorValues = new int[18];
		   
		   for (int i = 0; i <= 7; i++) {
			   randomValues[i] = (int) (10 + (Math.random() * 80));
		   }
		   
		   for (int j = 0; j <= 17; j++) {
			   colorValues[j] = (int) (Math.random() * 255);
		   }
		   
		   Color color1 = new Color(colorValues[0], colorValues[1], colorValues[2]);
		   Rectangle shape1 = ShapeFactory.getRectangle(30, 30, randomValues[0], randomValues[1], color1);
		   shapeList.add(shape1);
		   
		   Color color2 = new Color(colorValues[3], colorValues[4], colorValues[5]);
		   Circle shape2 = ShapeFactory.getCircle(120, 120, randomValues[2], randomValues[2], color2);
		   shapeList.add(shape2);
		   
		   Color color3 = new Color(colorValues[6], colorValues[7], colorValues[8]);
		   Square shape3 = ShapeFactory.getSquare(210, 210, randomValues[3], randomValues[3], color3);
		   shapeList.add(shape3);
		   
		   Color color4 = new Color(colorValues[9], colorValues[10], colorValues[11]);
		   Circle shape4 = ShapeFactory.getCircle(300, 300, randomValues[4], randomValues[4], color4);
		   shapeList.add(shape4);
		   
		   Color color5 = new Color(colorValues[12], colorValues[13], colorValues[14]);
		   Rectangle shape5 = ShapeFactory.getRectangle(390, 390, randomValues[5], randomValues[6], color5);
		   shapeList.add(shape5);
		   
		   Color color6 = new Color(colorValues[15], colorValues[16], colorValues[17]);
		   Square shape6 = ShapeFactory.getSquare(480, 480, randomValues[7], randomValues[7], color6);
		   shapeList.add(shape6);
		   
	   }
	   if (e.getActionCommand() == "Sort shapes") {
		   SortingTechnique.sortShapes(shapeList);
	   }
   }
   
   
   /**
    * This is the main method of the class.
    * @param args
    */
   public static void main(String[] args) {
	  
	  JButton button1 = new JButton();
	  button1.setText("Load shapes");
      button1.addActionListener(panel);
      button1.setActionCommand("Load shapes");
      
      JButton button2 = new JButton();
      button2.setText("Sort shapes");
      button2.addActionListener(panel);
      button2.setActionCommand("Sort shapes");
      
      panel.add(button1);
      panel.add(button2);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(panel);
      frame.setSize(630, 630);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}