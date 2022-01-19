import java.util.*;
class SimpleCalculator{ 
	public static void main(String [] args){
		//Declaring the variables.
		String op;
		Double num1, num2, res;

		//Creating the object of the scanner class.
		Scanner in = new Scanner(System.in);

		//Entering the operator for desired calculation.
		System.out.println("Choose an operation: Add-A, Subtract-S, Multiply-M, Divide-D or Remainder-R:");
		op = in.next();

		//Asking the numbers.
		System.out.println("Enter the first number:");
		num1 = in.nextDouble();

		System.out.println("Enter the second number:");
		num2 = in.nextDouble();

		//Using Switch case.
		switch(op.toUpperCase()){
			case "A":
			    res = num1 + num2;
			    System.out.println(num1 + " + " + num2 + " = " + res);
			    break;

			case "S":
			    res = num1 - num2;
			    System.out.println(num1 + " - " + num2 + " = " + res);
			    break;

			case "M":
			    res = num1 * num2;
			    System.out.println(num1 + " * " + num2 + " = " + res);
			    break;

			case "D":
			    res = num1 / num2;
			    System.out.println(num1 + " / " + num2 + " = " + res);
			    break;

			case "R":
			    res = num1 % num2;
			    System.out.println(num1 + " % " + num2 + " = " + res);
			    break;

			default:
			    System.out.println("Invalid opetarion!!");
			    break;
		}
		in.close();
	}
}