import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class Day{

	private JFrame day = new JFrame(JFrame.EXIT_ON_CLOSE);
	private JPanel controlPanel = new JPanel();
	private JButton JBwage = new JButton("wage"); //button to choose whether or not to use hourly wage	
	private JButton JBincome = new JButton("income", JButton.CENTER); //or yearly income
	private JButton single = new JButton("single");
	private JButton hoh = new JButton("HOH");
	private JButton jointly = JButton("jointly");
	private JButton seperately = new JButton("seperately");
	private JButton done = new JButton("done");
	private JTextField jtf = new JTextField(10); //textbox 
	private JTextField state = new JTextField(2); //type two letter state code 
	boolean buttonClick = false;

	int Fs0 = 0;
	int Fs1 = 9526;
	int Fs2 = 38701;
	int Fs3 = 82501;
	int Fs4 = 157501;
	int Fs5 = 200001;
	int Fs6 = 500001;

	int Fhoh0 = 0
	int Fhoh1 = 13601;
	int Fhoh2 = 51801;
	int Fhoh3 = 82501;
	int Fhoh4 = 157501;
	int Fhoh5 = 200001;
	int Fhoh6 = 500001;

	int Fmj0 = 0
	int Fmj1 = 19051;
	int Fmj2 = 77401;
	int Fmj3 = 165001;
	int Fmj4 = 315001;
	int Fmj5 = 400001;
	int Fmj6 = 600001;

	int Fms0 = 0;
	int Fms1 = 9526;
	int Fms2 = 38701;
	int Fms3 = 82501;
	int Fms4 = 157501;
	int Fms5 = 200001;
	int Fms6 = 300001;

	double percent0 = .1;
	double percent1 = .12;
	double percent2 = .22;
	double percent3 = .24;
	double percent4 = .32;
	double percent5 = .35;
	double percent6 = .37;

	public void setup(){
		day.setLayout(new GridLayout(3,1));
		day = new JFrame("Day");
		day.setVisible(true);
		day.setSize(500,500);
		day.setVisible(true);  

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
	}



	public void doneButton(){
		done.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent a){
				if(a.getActionCommand().equals("")){
					if(ActionEvent b = true){
						if(ActionEvent d = true){
							int data = jtf.getText();
							if(data >= Fs0){
								data * percent0 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fs1){

							}
						}
						else if(ActionEvent e = true){
							int data = jtf.getText();
						}
						else if(ActionEvent f = true){
							int data = jtf.getText();
						}
						else(ActionEvent g = true){
							int data = jtf.getText();
						}
					}

					else(ActionEvent c = true){
						if(ActionEvent d = true){
							int data = jtf.getText();
						}
						else if(ActionEvent e = true){
							int data = jtf.getText();
						}
						else if(ActionEvent f = true){
							int data = jtf.getText();
						}
						else(ActionEvent g = true){
							int data = jtf.getText();
						}
					}
				}
			}
		});
	}

	public void wageButton(){
		JBwage.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent b){
				if(b.getActionCommand().equals("wage")){
					day.add(single);
					day.add(hoh);
					day.add(jointly);
					day.add(seperately);
				}
			}
		});
	}

	public void incomeButton(){
		JBincome.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent c){
				if(c.getActionCommand().equals("income")){
					day.add(single);
					day.add(hoh);
					day.add(jointly);
					day.add(seperately);
				}
			}
		});
	}

	public void singleButton(){
		single.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent d){
				if(d.getActionCommand().equals("single")){
					day.add(jtf)
					day.add(done);
				}
			}
		});
	}

public void jointlyButton(){
		jointly.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent e){
				if(e.getActionCommand().equals("jointly")){
					day.add(jtf)
					day.add(done);
				}
			}
		});
	}

	public void hohButton(){
		hoh.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent f){
				if(f.getActionCommand().equals("hoh")){
					day.add(jtf)
					day.add(done);
				}
			}
		});
	}

	public void seperateButton(){
		seperately.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent g){
				if(g.getActionCommand().equals("seperately")){
					day.add(jtf)
					day.add(done);
				}
			}
		});
	}