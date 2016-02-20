package virensam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 * 
 * @author Sam
 *
 */
public class Communication extends JFrame implements ActionListener{
	
	JTextField jtfinput;
	JButton jbsend;
	JSlider Camera;
	
	/**
	 * 
	 */
	public Communication(){
		super ("Matthew Damon on Mars");
		
		Camera = new JSlider(0,15,0);
		jtfinput = new JTextField();
		jbsend = new JButton("Send");
		
		jbsend.addActionListener(this);  //Action listener for button click event
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Camera.setPaintLabels(true);
		Camera.setPaintTicks(true);
		Camera.setMajorTickSpacing(1);
		
		Hashtable<Integer, JLabel> table = new Hashtable<Integer,JLabel>(); //Marking JSlider with the use of a Hashtable
		
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
 		Camera.setLabelTable(table);
	
		this.add(jtfinput,BorderLayout.CENTER);
 		this.add(Camera, BorderLayout.NORTH);
 		this.add(jbsend,BorderLayout.SOUTH);
	}

	/**
	 * Main method
	 * @param args Command line arguments
	 */
	public static void main(String args[]) {
		JFrame Communication = new Communication();
		Communication.setVisible(true);
		Communication.setSize(400, 500);
	}
	
	/**
	 * Action event where value of Camera is set to integer in jtfinput
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String input = jtfinput.getText();
		char characters[] = input.toCharArray();
		map.get(characters);
		
		
		
		Camera.setValue();
	}


	
}
