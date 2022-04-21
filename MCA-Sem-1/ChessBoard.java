import java.awt.*;
import javax.swing.*;
public class ChessBoard extends JFrame{
	public static final int squareCount = 64;

	public ChessBoard(String title){
		Color blackColor = Color.BLACK;
		Color whiteColor = Color.WHITE;

		JButton chessButton = null;

		for(int i=1; i <= squareCount; i++){
			if(i%2==0){
				chessButton = new JButton();
				chessButton.setBackground(blackColor);
				add(chessButton);
			}else{
				chessButton = new JButton();
				chessButton.setBackground(whiteColor);
				add(chessButton);
			}
			if(i%8==0){
				Color temp = blackColor;
				blackColor = whiteColor;
				whiteColor = temp;
			}
		}
		this.setTitle(title);
		this.setLayout(new GridLayout(8,18));
		this.setSize(650,650);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		String title = "My Chess Board";
		ChessBoard chessboard = new ChessBoard(title);
	}
}