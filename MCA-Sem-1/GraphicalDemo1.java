import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class GraphicalDemo1 implements ActionListener
{
	JFrame frm;
	JLabel lblUsrId, lblPwd;
	JTextField txtUsrId;
	JPasswordField txtPwd;
	JButton btnLogin, btnCancel;

	public void init(){
		frm = new JFrame("Login Screen.......");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lblUsrId = new JLabel("Enter User ID");
		lblPwd = new JLabel("Enter Password");
		txtUsrId = new JTextField(10);
		txtPwd = new JPasswordField(10);
		btnLogin = new JButton("Login");
		btnCancel = new JButton("Cancel");
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);

		frm.add(lblUsrId);
		frm.add(txtUsrId);
		frm.add(lblPwd);
		frm.add(txtPwd);
		frm.add(btnLogin);
		frm.add(btnCancel);

		frm.setLayout(new FlowLayout());
		frm.setSize(500,500);
		frm.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		JButton src = (JButton)e.getSource();

		if(src==btnLogin)
			System.out.println("Login Button Clicked!");
		else if(src==btnCancel)
			System.out.println("Cancel Button Clicked!");
	}
	public static void main(String [] args){
		GraphicalDemo1 gd1 = new GraphicalDemo1();
		gd1.init();
	}
}