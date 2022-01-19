import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class GraphicalDemo02 implements ActionListener
{
	JFrame frm;
	JLabel lblUsrId, lblPwd;
	JTextField txtUsrId;
	JPasswordField txtPwd;
	JButton btnLogin, btnCancel, btnReset;

	public void init(){
		frm = new JFrame("Login Screen.......");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lblUsrId = new JLabel("Enter User ID");
		lblPwd = new JLabel("Enter Password");
		txtUsrId = new JTextField(10);
		txtPwd = new JPasswordField(10);
		btnLogin = new JButton("Login");
		btnCancel = new JButton("Cancel");
		btnReset = new JButton("Reset");
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		// btnReset.addActionListener(this);

		frm.add(lblUsrId);
		frm.add(txtUsrId);
		frm.add(lblPwd);
		frm.add(txtPwd);
		frm.add(btnLogin);
		frm.add(btnCancel);
		frm.add(btnReset);

		frm.setLayout(new FlowLayout());
		frm.setSize(500,500);
		frm.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		JButton src = (JButton)e.getSource();

		if(src==btnLogin)
			System.out.println("You clicked the Login Button!!");
		else if(src==btnCancel)
			System.out.println("You clicked the Cancel Button!!");
		else if(src==btnReset)
			System.out.println("You clicked the Reset Button!!");
	}
	public static void main(String [] args){
		GraphicalDemo1 gd1 = new GraphicalDemo1();
		gd1.init();
	}
}