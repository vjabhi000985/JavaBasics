import java.util.*;

class scannerClass{
	public static void main(String [] args){

		// Declaring Varibles
		int num1, num2, res;

		// Creating Scanner Class Object.
		Scanner sc = new Scanner(System.in);

		// Taking Input using scanner class.
		System.out.print("Enter first number:");
		num1 = sc.nextInt();

		System.out.print("Enter second number:");
		num2 = sc.nextInt();

		res = num1 + num2;

		System.out.println("The result is:"+res);

	}
}