import java.awt.*;
class GraphicalDemo{
	Frame frm;
	Label lblUsrID, lblPwd;
	TextField txtUsrId, txtPwd;
	Button btnLogin, btnCancel;

	public void initComp(){
		frm = new Frame("Login Screen......");
		lblUsrID = new Label("Enter User ID");
		lblPwd = new Label("Enter your password");
		txtUsrId = new TextField(10);
		txtPwd = new TextField(10);
		txtPwd.setEchoChar('*');
		btnLogin = new Button("Login");
		btnCancel = new Button("Cancel");

		frm.add(lblUsrID);
		frm.add(txtUsrId);
		frm.add(lblPwd);
		frm.add(txtPwd);
		frm.add(btnLogin);
		frm.add(btnCancel);

		frm.setLayout(new FlowLayout());
		frm.setSize(500,350);
		frm.setVisible(true);
	}

	public static void main(String [] arg){
		GraphicalDemo gd = new GraphicalDemo();
		gd.initComp();
	}
}