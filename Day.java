import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class Day{

	private JFrame day = new JFrame();
	private JPanel controlPanel = new JPanel();
	private JLabel JLwage = new JLabel("calculate with hourly wage", JLabel);
	private JLabel JLincome = new JLabel("calculate with yearly income", JLabel);
	private JButton JBwage = new JButton("wage", JButton.CENTER); //button to choose whether or not to use hourly wage	
	private JButton JBincome = new JButton("income", JButton.CENTER); //or yearly income
	private JButton done = new JButton("done");
	private JTextField JTFwage = new JTextField(10); //textbox 
	private JTextField JTFincome = new JTextField(10);
	boolean buttonClick = false;

	public void setup(){
		day = new JFrame("Day");
		day.setVisible(true);
		day.setSize(500,500);
		day.add(controlPanel);
		day.setVisible(true);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
	}


	public void wageButton(){
		wage.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent a){
				add.JTFwage();
				}
			}
		});
	}

	public void incomeButton(){
		wage.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent b){
				add.JTFincome();
				}
			}
		});
	}

	public void doneButton(){
		done.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent e){
				//do the calculation take in all the info
			}
		});
	}

	public static void main(String[] args){
		if(JBwage = true){
			add.done;
			wageButton;
		}
		if(JBincome = true){
			add.done;
			incomeButton;
		}
		if(JBincome && JBwage = true){
			return error;                               //registers as an error
		}

	}
}
