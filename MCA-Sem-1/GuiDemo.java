import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GuiDemo{
	JFrame frm;
	JTextField txt;
	JButton[] numbersButtons = new JButton[10];
	JButton[] functionButtons = new JButton[8]; 
	JButton add,sub,mul,div,dec,equ,del,clr;
	JPanel panel;

	Font myFont = new Font("Ink Free",Font.BOLD,30);

	double num1=0,num2=0,result=0;
	char operator;

	GuiDemo(){
		frm = new JFrame("Calculator");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(420,550);
		frm.setLayout(null);

		txt = new JTextField();
		txt.setBounds(50,25,300,50);
		txt.setFont(myFont);

		frm.add(txt);
		frm.setVisible(true);
	}

	public static void main(String[] args){
		GuiDemo calc = new GuiDemo();
	}
}