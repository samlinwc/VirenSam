import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.Scanner;
import javax.swing.JLabel;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.JPanel;

import javax.swing.*;
 
  public class Camera {
	  
		static ArrayList<Integer> inputintegers = new ArrayList<Integer>();
		static JButton addtolist = new JButton();
 		static Scanner input = new Scanner(System.in);
 		static JSlider cam = new JSlider();
	  
 	public static void main (String args[]){
 		JFrame myFrame = new JFrame ("Matthew Damon on Mars");
		myFrame.setSize(300, 600);
	
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel userinp = new JLabel("Enter input: ");

		cam = new JSlider(0, 15, 0);
		cam.setPaintLabels(true);

		JTextField enterval = new JTextField();
		enterval.setPreferredSize(new Dimension(100,80));
		
 		addtolist = new JButton("Enter");
 		addtolist.setPreferredSize(new Dimension(50,20));
 		JTextField enterval1 = new JTextField();
 		
 		panel.add(addtolist);

 		Hashtable<Integer, JLabel> table = new Hashtable<Integer, JLabel>();
 		table.put(0, new JLabel("0"));
 		table.put(1, new JLabel("1"));
 		table.put(2, new JLabel("2"));
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
 		
 		myFrame.add(cam, BorderLayout.SOUTH);
 		myFrame.add(userinp, BorderLayout.NORTH);
 		myFrame.add(enterval1, BorderLayout.NORTH);
 		myFrame.add(panel, BorderLayout.CENTER);
 		
 		myFrame.setVisible(true);

	}

 	static void buttonAction() {
		addtolist.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				inputintegers.add(input.nextInt());		
				cam.setValue(2);
				
			}
			
		});
 	} 	
  }
  