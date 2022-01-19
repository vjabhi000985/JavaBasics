import java.awt.*;
class Graphics{
	Frame frm;
	Label lblUsrId, lblPwd;
	TextField txtUsrId, txtPwd;
	Button btnLogin, btnCancel;
	public void init(){
		frm = new Frame("Login here.......");
		lblUsrId = new Label("Enter User ID");
		lblPwd = new Label("Enter passowrd");
		txtUsrId = new TextField(10);
		txtPwd = new TextField(10);
		txtPwd.setEchoChar('*');
		btnLogin = new Button("Login");
		btnCancel = new Button("Cancel");

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
	public static void main(String [] args){
		Graphics gd = new Graphics();
		gd.init();
	}
}