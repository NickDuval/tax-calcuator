import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class Day{
	public static void main(String[] args){
	JButton JBwage = new JButton("wage");
	JBwage.setBounds(100,100,300,300); //button to choose whether or not to use hourly wage	
	JButton JBincome = new JButton("income");
	JBincome.setBounds(600,100,300,300); //or yearly income
	JButton single = new JButton("single");
	single.setBounds(100,100,300,300);
	JButton hoh = new JButton("HOH");
	hoh.setBounds(600,100,300,300);
	JButton jointly = new JButton("jointly");
	jointly.setBounds(100,600,300,300);
	JButton seperately = new JButton("seperately");
	seperately.setBounds(600,600,300,300);
	JButton done = new JButton("done");
	done.setBounds(400,1000,100,30);
	JTextField jtf = new JTextField(10); //textbox 
	JTextField state = new JTextField(2); //type two letter state code 
	boolean buttonClick = false;

	int Fs0 = 0;
	int Fs1 = 9526;
	int Fs2 = 38701;
	int Fs3 = 82501;
	int Fs4 = 157501;
	int Fs5 = 200001;
	int Fs6 = 500001;

	int Fhoh0 = 0;
	int Fhoh1 = 13601;
	int Fhoh2 = 51801;
	int Fhoh3 = 82501;
	int Fhoh4 = 157501;
	int Fhoh5 = 200001;
	int Fhoh6 = 500001;

	int Fmj0 = 0;
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

	JFrame day = new JFrame();
	day.setLayout(new GridLayout(4,1));
	day.setSize(new Dimension(1000,1130));
	day.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	day.setTitle("Tax App");
	day.setVisible(true);
	day.setResizable(false);
	day.add(JBwage);
	day.add(JBincome);
	}

//make tree map using binary to track which buttons pressed

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
								data * percent1 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fs2){
								data * percent2 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fs3){
								data * percent3 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fs4){
								data * percent4 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fs5){
								data * percent5 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fs6){
								data * percent6 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
						}
						else if(ActionEvent e = true){
							int data = jtf.getText();
							if(data >= Fmj0){
								data * percent0 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fmj1){
								data * percent1 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fmj2){
								data * percent2 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fmj3){
								data * percent3 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fmj4){
								data * percent4 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fmj5){
								data * percent5 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fmj6){
								data * percent6 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
						}
						else if(ActionEvent f = true){
							int data = jtf.getText();
							if(data >= Fhoh0){
								data * percent0 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fhoh1){
								data * percent1 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fhoh2){
								data * percent2 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fhoh3){
								data * percent3 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fhoh4){
								data * percent4 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fhoh5){
								data * percent5 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fhoh6){
								data * percent6 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
						}
						else(ActionEvent g = true){
							int data = jtf.getText();
							if(data >= Fms0){
								data * percent0 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fms1){
								data * percent1 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fms2){
								data * percent2 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fms3){
								data * percent3 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fms4){
								data * percent4 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fms5){
								data * percent5 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fms6){
								data * percent6 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
						}	
					}

					else(ActionEvent c = true){
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
								data * percent1 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fs2){
								data * percent2 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fs3){
								data * percent3 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fs4){
								data * percent4 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fs5){
								data * percent5 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fs6){
								data * percent6 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
						}
						else if(ActionEvent e = true){
							int data = jtf.getText();
							if(data >= Fmj0){
								data * percent0 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fmj1){
								data * percent1 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fmj2){
								data * percent2 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fmj3){
								data * percent3 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fmj4){
								data * percent4 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fmj5){
								data * percent5 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fmj6){
								data * percent6 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
						}
						else if(ActionEvent f = true){
							int data = jtf.getText();
							if(data >= Fhoh0){
								data * percent0 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fhoh1){
								data * percent1 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fhoh2){
								data * percent2 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fhoh3){
								data * percent3 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fhoh4){
								data * percent4 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fhoh5){
								data * percent5 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fhoh6){
								data * percent6 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
						}
						else(ActionEvent g = true){
							int data = jtf.getText();
							if(data >= Fms0){
								data * percent0 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fms1){
								data * percent1 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fms2){
								data * percent2 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fms3){
								data * percent3 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fms4){
								data * percent4 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fms5){
								data * percent5 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
							if else(data >= Fms6){
								data * percent6 = federalTax;
								//state info
								data - federalTax = gross
								system.out.println("gross wage for the day: " gross);
								sysem.out.println("federal tax taken off net is: " federalTax);
							}
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
					day.remove(JBwage);
					day.remove(JBincome);
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
					day.remove(JBwage);
					day.remove(JBincome);
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
					day.remove(single);
					day.remove(hoh);
					day.remove(jointly);
					day.remove(seperately);
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
					day.remove(single);
					day.remove(hoh);
					day.remove(jointly);
					day.remove(seperately);
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
					day.remove(single);
					day.remove(hoh);
					day.remove(jointly);
					day.remove(seperately);
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
					day.remove(single);
					day.remove(hoh);
					day.remove(jointly);
					day.remove(seperately);
				}
			}
		});
	}
