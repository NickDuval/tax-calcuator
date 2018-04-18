import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Day2{
	int wageTp = 0;
	int incomeTp = 0;
	int singleTp = 0;
	int jointlyTp = 0;
	int hohTp = 0;
	int sepratelyTp = 0;
	JFrame day;
	JPanel controlPanel;
	JButton wageBT;
	JButton incomeBT;



	int[] fs = {0, 9526, 38700, 82501, 157501, 200001, 500001};

	int[] fhoh = {0, 13601, 51801, 82501, 157501, 200001, 500001};

	int[] fmj = {0, 19051, 77401, 165001, 315001, 400001, 600001};

	int[] fms = {0, 9526, 38700, 82501, 157501, 200001, 300001};

	double[] percent = {.1, .12, .22, .24, .32, .35, .37};

	public static void main(String args[]){
		Day2 Gui = new Day2();
		Gui.showGui();
	}

	public Day2(){
		prepareGUI();
	}

	private void prepareGUI(){
		day = new JFrame("Day");
		day.setSize(1000,1130);
		day.setLayout(new GridLayout(4,1));
		day.setLocationRelativeTo(null);
		day.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		day.setResizable(false);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		day.add(controlPanel);
	}	

	private void showGui(){
		day.setTitle("Tax App");
		wageBT = new JButton("wage");
		wageBT.setBounds(100,100,300,300); //button to choose whether or not to use hourly wage	
		wageBT.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {     
            	//salary();
           		wageTp = 1;    
        	}
      	}); 
		controlPanel.add(wageBT);

		JButton income = new JButton("income");
		incomeBT.setBounds(600,100,300,300); //or yearly income
		incomeBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {     
				//salary();
				incomeTp = 1;    
			}
		}); 
		controlPanel.add(incomeBT);

		// JButton single = new JButton("single");
		// single.setBounds(100,100,300,300);
		// JButton hoh = new JButton("HOH");
		// hoh.setBounds(600,100,300,300);
		// JButton jointly = new JButton("jointly");
		// jointly.setBounds(100,600,300,300);
		// JButton seprately = new JButton("seprately");
		// seprately.setBounds(600,600,300,300);
		// JButton done = new JButton("done");
		// done.setBounds(400,1000,100,30);	
		// JButton home = new JButton("home");
		// home.setBounds(850,1070,100,30);
		// JTextField gross = new JTextField(7); //textbox 
		// JTextField hours = new JTextField(2);
		// JTextField state = new JTextField(2); //type two letter state code 
		// JTextField dependent = new JTextField(2); //number of dependents */
		day.setVisible(true);
	}
}