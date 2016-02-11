package virensam;

import java.awt.BorderLayout;
import java.util.Hashtable;

import javax.swing.*;

public class Camera {
	public static void main (String args[]){
		JFrame myFrame = new JFrame ("Matthew Damon on Mars");
		myFrame.setSize(300, 600);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSlider cam = new JSlider(0,15,0);
		
		cam.setPaintLabels(true);
		
		Hashtable<Integer, JLabel> table = new Hashtable<Integer,JLabel>();
		
		table.put (0,new JLabel("0"));
		table.put (1,new JLabel("1"));
		table.put (2,new JLabel("2"));
		table.put(3, new JLabel("3"));
 		table.put(4, new JLabel("4"));
 		table.put(5, new JLabel("5"));
 		table.put(6, new JLabel("6"));
 		table.put(7, new JLabel("7"));
 		table.put(8, new JLabel("8"));
 		table.put(9, new JLabel("9"));
 		table.put(10, new JLabel("A"));
 		table.put(11, new JLabel("B"));
 		table.put(12, new JLabel("C"));
 		table.put(13, new JLabel("D"));
 		table.put(14, new JLabel("E"));
 		table.put(15, new JLabel("F"));
 		cam.setLabelTable(table);
 		
 		myFrame.add(cam, BorderLayout.NORTH);
 		myFrame.setVisible(true);
		
	}

}
