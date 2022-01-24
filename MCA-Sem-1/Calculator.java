import java.awt.*;
import javax.swing.*;

public class Calculator{
	public static void main(String [] args){
		JFrame frm;
		JPanel panel;
	    TextField txt;
	    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,beq,badd,bsub,bmul,bdiv,bdec,bmod,b0,bzeros,bclr,bdel;
		frm = new JFrame("Simple Calculator");
		txt = new TextField();
		txt.setBounds(50,45,300,50);
		txt.setEditable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setBounds(50,100,300,380);
		panel.setLayout(new GridLayout(5,3,10,10));
		Color frame = new Color(255,255,255);
		Color button = new Color(188,254,248);
		// panel.setBackground(Color.BLACK);
		txt.setBackground(frame);
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		beq = new Button("=");
		badd = new Button("+");
		bsub = new Button("-");
		bmul = new Button("X");
		bdiv = new Button("/");
		bdec = new Button(".");
		bmod = new Button("%");
		b0 = new Button("0");
		bzeros = new Button("00");
		bdel = new Button("Del");
		bclr = new Button("C");

		b1.setBackground(button);
		b2.setBackground(button);
		b3.setBackground(button);
		b4.setBackground(button);
		b5.setBackground(button);
		b6.setBackground(button);
		b7.setBackground(button);
		b8.setBackground(button);
		b9.setBackground(button);
		beq.setBackground(button);
		badd.setBackground(button);
		bsub.setBackground(button);
		bmul.setBackground(button);
		bdiv.setBackground(button);
		bdec.setBackground(button);
		bmod.setBackground(button);
		b0.setBackground(button);
		bzeros.setBackground(button);
		bdel.setBackground(button);
		bclr.setBackground(button);

		frm.setLayout(null);

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(badd);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(bsub);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(bmul);
		panel.add(b0);
		panel.add(bmod);
		panel.add(bdec);
		panel.add(bdiv);
		panel.add(bzeros);
		panel.add(bdel);
		panel.add(beq);
		panel.add(bclr);

		frm.add(txt);
		frm.add(panel);

		frm.getContentPane().setBackground(frame);
		frm.setSize(420,550);
		frm.setVisible(true);
	}
}