import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class Day{
	public static void main(String[] args){
	JButton wage = new JButton("wage");
	wage.setBounds(100,100,300,300); //button to choose whether or not to use hourly wage	
	JButton income = new JButton("income");
	income.setBounds(600,100,300,300); //or yearly income
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
	JButton home = new JButton("home");
	home.set bounds(850,1070,100,30);
	JTextField gross = new JTextField(7); //textbox 
	JTextField state = new JTextField(2); //type two letter state code 
	JTextField dependent = new JTextField(2); //number of dependents
	//add hours worked today

	int fs[] = new int[7];
	int fs[0] = 0;
	int fs[1] = 9526;
	int fs[2] = 38700;
	int fs[3] = 82501;
	int fs[4] = 157501;
	int fs[5] = 200001;
	int fs[6] = 500001;

	int fhoh[] = new int[7];
	int fhoh[0] = 0;
	int fhoh[1] = 13601;
	int fhoh[2] = 51801;
	int fhoh[3] = 82501;
	int fhoh[4] = 157501;
	int fhoh[5] = 200001;
	int fhoh[6] = 500001;

	int fmj[] = new int[7];
	int fmj[0] = 0;
	int fmj[1] = 19051;
	int fmj[2] = 77401;
	int fmj[3] = 165001;
	int fmj[4] = 315001;
	int fmj[5] = 400001;
	int fmj[6] = 600001;

	int fms[] = new int[7];
	int fms[0] = 0;
	int fms[1] = 9526;
	int fms[2] = 38701;
	int fms[3] = 82501;
	int fms[4] = 157501;
	int fms[5] = 200001;
	int fms[6] = 300001;

	double percent[] = new double[7];
	double percent[0] = .1;
	double percent[1] = .12;
	double percent[2] = .22;
	double percent[3] = .24;
	double percent[4] = .32;
	double percent[5] = .35;
	double percent[6] = .37;

	JFrame day = new JFrame();
	day.setLayout(new GridLayout(4,1));
	day.setSize(new Dimension(1000,1130));
	day.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	day.setTitle("Tax App");
	day.setVisible(true);
	day.setResizable(false);
	day.add(wage);
	day.add(income);
	}

	/*
	@ action listeners for buttons
	@ wageButton
	@ incomeButton
	@ singleButton
	@ jointlyButton
	@ hohButton
	@ seperatlyButton
	@ doneButton
	*/

	public void wageButton(){
		wage.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent b){
				if(b.getActionCommand().equals("wage")){
					salary();
				}
			}
		});
	}

	public void incomeButton(){
		income.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent c){
				if(c.getActionCommand().equals("income")){
					salary();
				}
			}
		});
	}

	public void singleButton(){
		single.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent d){
				if(d.getActionCommand().equals("single")){
					filerCondition();
				}
			}
		});
	}

	public void jointlyButton(){
		jointly.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent e){
				if(e.getActionCommand().equals("jointly")){
					filerCondition();
				}
			}
		});
	}

	public void hohButton(){
		hoh.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent f){
				if(f.getActionCommand().equals("hoh")){
					filerCondition();
				}
			}
		});
	}

	public void seperateButton(){
		seperately.addActionListerner(new ActionListener(){
			public void actionPreformed(ActionEvent g){
				if(g.getActionCommand().equals("seperately")){
					filerCondition();
				}
			}
		});
	}

	//add doneButton

	/*
	@ used in button classes 
	@ for filerCondition
	@ and salary
	*/

	public void filerCondition(){
		system.out.println("please write your hourly wage only in numbers");
		day.add(jtf)
		day.add(done);
		day.remove(single);
		day.remove(hoh);
		day.remove(jointly);
		day.remove(seperately);
	}

	public void salary(){
		day.add(single);
		day.add(hoh);
		day.add(jointly);
		day.add(seperately);
		day.remove(wage);
		day.remove(income);
	}

	/*
	@ tax from how they are filed
	@ single
	@ jointly
	@ head of house
	@ seperatly
	*/

	public void singleTax(){
		for(i = 6; i >= 0; i = i-1){
			if(gross >= fs[i]){
				gross * percent[i] = federalTax;
				//state info
				gross - federalTax = net;
				system.out.println("gross wage for the day: " + gross);
				system.out.println("net wage for the day: " + net);
				sysem.out.println("federal tax taken off net is: " + federalTax);
			}else{
				system.out.println("error: use only numbers please! :)");
			}
		}
	}

	public void jointlyTax(){
		for(i = 6; i >= 0; i = i-1){
			if(gross >= fmj[i]){
				gross * percent[i] = federalTax;
				//state info
				gross - federalTax = net;
				system.out.println("gross wage for the day: " + gross);
				system.out.println("net wage for the day: " + net);
				sysem.out.println("federal tax taken off net is: " + federalTax);
			}else{
				system.out.println("error: use only numbers please! :)");
			}
		}
	}

	public void hohTax(){
		for(i = 6; i >= 0; i = i-1){
			if(gross >= fhoh[i]){
				gross * percent[i] = federalTax;
				//state info
				gross - federalTax = net;
				system.out.println("gross wage for the day: " + gross);
				system.out.println("net wage for the day: " + net);
				sysem.out.println("federal tax taken off net is: " + federalTax);
			}else{
				system.out.println("error: use only numbers please! :)");
			}
		}
	}

	public void seperatlyTax(){
		for(i = 6; i >= 0; i = i-1){
			if(gross >= fms[i]){
				gross * percent[i] = federalTax;
				//state info
				gross - federalTax = net;
				system.out.println("gross wage for the day: " + gross);
				system.out.println("net wage for the day: " + net);
				sysem.out.println("federal tax taken off net is: " + federalTax);
			}else{
				system.out.println("error: use only numbers please! :)");
			}
		}
	}
}
