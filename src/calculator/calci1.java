package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
     double first;
     double second;
     double result;
     String operation;
     String answer;
	private JLabel display;
	private String input;
	private JLabel textdisplay;
	private double firstnumber;
	private JLabel textdispaly;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci1 window = new calci1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 386, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton but10 = new JButton("\uF0E7");
		but10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (textField.getText().length()>0);
				{
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
			}
		});
		
		
		int num;
		JTextField in  = new JTextField(20);
		
		but10.setFont(new Font("Wingdings", Font.BOLD, 28));
		but10.setBounds(28, 182, 74, 54);
		frame.getContentPane().add(but10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 40));
		textField.setBounds(10, 10, 352, 124);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton bit7 = new JButton("7");
		bit7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bit7.getText();
				textField.setText(number);
			}
		});
		bit7.setFont(new Font("Tahoma", Font.BOLD, 28));
		bit7.setBounds(28, 240, 74, 54);
		frame.getContentPane().add(bit7);
		
		JButton bit4 = new JButton("4\r\n");
		bit4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bit4.getText();
				textField.setText(number);
			}
		});
		bit4.setFont(new Font("Tahoma", Font.BOLD, 28));
		bit4.setBounds(28, 299, 74, 54);
		frame.getContentPane().add(bit4);
		
		JButton bit1 = new JButton("1");
		bit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bit1.getText();
				textField.setText(number);
			}
		});
		bit1.setFont(new Font("Tahoma", Font.BOLD, 28));
		bit1.setBounds(28, 359, 74, 54);
		frame.getContentPane().add(bit1);
		
		JButton but0 = new JButton("0");
		but0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+but0.getText();
				textField.setText(number);
			}
		});
		but0.setFont(new Font("Tahoma", Font.BOLD, 28));
		but0.setBounds(28, 419, 74, 54);
		frame.getContentPane().add(but0);
		
		JButton but11 = new JButton("C");
		but11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		but11.setFont(new Font("Tahoma", Font.BOLD, 28));
		but11.setBounds(112, 182, 74, 54);
		frame.getContentPane().add(but11);
		
		JButton bit8 = new JButton("8");
		bit8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bit8.getText();
				textField.setText(number);
			}
		});
		bit8.setFont(new Font("Tahoma", Font.BOLD, 28));
		bit8.setBounds(112, 240, 74, 54);
		frame.getContentPane().add(bit8);
		
		JButton bit5 = new JButton("5");
		bit5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bit5.getText();
				textField.setText(number);
			}
		});
		bit5.setFont(new Font("Tahoma", Font.BOLD, 28));
		bit5.setBounds(112, 299, 74, 54);
		frame.getContentPane().add(bit5);
		
		JButton bit2 = new JButton("2");
		bit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bit2.getText();
				textField.setText(number);
			}
		});
		bit2.setFont(new Font("Tahoma", Font.BOLD, 28));
		bit2.setBounds(112, 359, 74, 54);
		frame.getContentPane().add(bit2);
		
		JButton butDot = new JButton(".");
		butDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		butDot.setFont(new Font("Tahoma", Font.BOLD, 28));
		butDot.setBounds(112, 419, 74, 54);
		frame.getContentPane().add(butDot);
		
		JButton but12 = new JButton("00");
		but12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+but12.getText();
				textField.setText(number);
			}
		});
		but12.setFont(new Font("Tahoma", Font.BOLD, 28));
		but12.setBounds(195, 182, 74, 54);
		frame.getContentPane().add(but12);
		
		JButton bit9 = new JButton("9");
		bit9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bit9.getText();
				textField.setText(number);
			}
		});
		bit9.setFont(new Font("Tahoma", Font.BOLD, 28));
		bit9.setBounds(196, 240, 74, 54);
		frame.getContentPane().add(bit9);
		
		JButton bit6 = new JButton("6");
		bit6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bit6.getText();
				textField.setText(number);
			}
		});
		bit6.setFont(new Font("Tahoma", Font.BOLD, 28));
		bit6.setBounds(196, 299, 74, 54);
		frame.getContentPane().add(bit6);
		
		JButton bit3 = new JButton("3");
		bit3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+bit3.getText();
				textField.setText(number);
			}
		});
		bit3.setFont(new Font("Tahoma", Font.BOLD, 28));
		bit3.setBounds(196, 359, 74, 54);
		frame.getContentPane().add(bit3);
		
		
	
		
		JButton butEqul = new JButton("=");
		butEqul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  String answer;
			  second=Double.parseDouble(textField.getText());
			  if(operation=="+");
			  {
				  result=first+second;
				  answer=String.format("%.2f",result);
				  textField.setText(answer);
				  
			  }
			   if(operation=="-")
			  {
				  result=first-second;
				  answer=String.format("%.2f",result);
				  textField.setText(answer);
			  }
			  else if(operation=="*")
			  {
				  result=first*second;
				  answer=String.format("%.2f",result);
				  textField.setText(answer);
			  }
			  else if(operation=="/")
			  {
				  result=first/second;
				  answer=String.format("%.2f",result);
				  textField.setText(answer);
			  }
			  else if(operation=="%")
				  {
					  result=first%second;
					  answer=String.format("%.2f",result);
					  textField.setText(answer);
				  }
			  }
		});
		butEqul.setFont(new Font("Tahoma", Font.BOLD, 28));
		butEqul.setBounds(196, 419, 74, 54);
		frame.getContentPane().add(butEqul);
		
		JButton butAdd = new JButton("+");
		butAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			
			}
		});
		butAdd.setFont(new Font("Tahoma", Font.BOLD, 28));
		butAdd.setBounds(279, 182, 74, 54);
		frame.getContentPane().add(butAdd);
		
		JButton butSub = new JButton("-");
		butSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			
			}
		});
		butSub.setFont(new Font("Tahoma", Font.BOLD, 28));
		butSub.setBounds(280, 240, 74, 54);
		frame.getContentPane().add(butSub);
		
		JButton butMul = new JButton("*");
		butMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		butMul.setFont(new Font("Tahoma", Font.BOLD, 28));
		butMul.setBounds(280, 299, 74, 54);
		frame.getContentPane().add(butMul);
		
		JButton butDivid = new JButton("/");
		butDivid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		butDivid.setFont(new Font("Tahoma", Font.BOLD, 28));
		butDivid.setBounds(280, 359, 74, 54);
		frame.getContentPane().add(butDivid);
		
		JButton butPersonsign = new JButton("%");
		butPersonsign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
				}
		});
		butPersonsign.setFont(new Font("Tahoma", Font.BOLD, 28));
		butPersonsign.setBounds(280, 419, 74, 54);
		frame.getContentPane().add(butPersonsign);
		
		textField_1 = new JTextField();
		textField_1.setBounds(28, 62, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 10, 362, 124);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		

	}
}
