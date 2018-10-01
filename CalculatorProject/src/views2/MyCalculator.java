package views2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MyCalculator 
{
	JFrame frame;
	JLabel label = new JLabel();
	JTextField textField = new JTextField(300);

	JButton buttonZero = new JButton("0");
	JButton buttonOne = new JButton("1");
	JButton buttonTwo = new JButton("2");
	JButton buttonThree = new JButton("3");
	JButton buttonFour = new JButton("4");
	JButton buttonFive = new JButton("5");
	JButton buttonSix = new JButton("6");
	JButton buttonSeven = new JButton("7");
	JButton buttonEight = new JButton("8");
	JButton buttonNine = new JButton("9");
	JButton buttonDot = new JButton(".");
	JButton buttonClear = new JButton("C");
	JButton buttonDelete = new JButton("DEL");
	JButton buttonEqual = new JButton("=");
	JButton buttonMul = new JButton("x");
	JButton buttonDiv = new JButton("/");
	JButton buttonPlus = new JButton("+");
	JButton buttonMinus = new JButton("-");

	MyCalculator() 
	{
		prepareGUI();
		addComponents();
	}

	public void prepareGUI() 
	{
		frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setSize(300, 500);
		frame.getContentPane().setLayout(new GridLayout(5,4));
		frame.getContentPane().setBackground(Color.RED);
		//frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void addComponents() 
	{
		//frame.add(label);
		//frame.add(textField);
		frame.add(buttonClear);
		frame.add(buttonDelete);
		
		frame.add(buttonSeven);
		frame.add(buttonEight);
		frame.add(buttonNine);
		frame.add(buttonDiv);
		
        frame.add(buttonFour);
        frame.add(buttonFive);
        frame.add(buttonSix);
        frame.add(buttonMul);
        
        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonMinus);
        
        frame.add(buttonDot);
        frame.add(buttonZero);
        frame.add(buttonEqual);
        frame.add(buttonPlus);
       
	}
}
