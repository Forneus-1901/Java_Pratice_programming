package test;
import javax.swing.*;	
import java.awt.event.*;
import java.awt.*;


public class swing_gui{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFrame frame = new JFrame("My First GUI");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       JButton button = new JButton("Press");
	       frame.getContentPane().add(button); // Adds Button to content pane of frame
	       frame.setVisible(true);
	       button.addActionListener(new ActionListener() { 
	    	   public void actionPerformed(ActionEvent e) {
                   System.out.println("EXIT");
               }
	       } );

	    }
	}		
	


