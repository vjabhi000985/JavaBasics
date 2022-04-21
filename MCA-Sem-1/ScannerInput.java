import java.util.*;

public class ScannerInput{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		Scanner sc = new Scanner("Hello world!!!Welcome to java programming!!");

		System.out.println("Enter the 1st number:");
		int x = in.nextInt();

		System.out.println("Enter the 2nd number:");
		int y = in.nextInt();

		System.out.println("Sum of two numbers is "+(x+y));

		while(sc.hasNext()){
			System.out.println(sc.next());
		}

		sc.close();
		in.close();
	}
}