class OperatorDemo{
	public static void main(String[] args){
		//1.Unary Operators
		int num = 10;
		boolean exp = true;
		System.out.println(++num);
		 //output: 11 and num = 11

		System.out.println(num++); 
		 //output: 11 and num = 12

		System.out.println(num--);
		 //output: 12 and num = 11

		System.out.println(--num); 
		 //output: 10 and num = 10

		System.out.println(~num);  
		 //output:-11 (-ve values of all +ve no.s starts from 0)

		System.out.println(!exp);  
		 //output:false
        System.out.println("--------------------------------------------");
        
		//2.Arithmetic Operators
		int firstNumber = 678;
		int secondNumber = 81;

		System.out.println("Addition="+(firstNumber+secondNumber));
		 //output: Addition=759

		System.out.println("Substraction="+(firstNumber-secondNumber));
		 //output: Substraction=597

		System.out.println("Multiplication="+(firstNumber*secondNumber));
		 //output: Multiplication=54918

		System.out.println("Division="+(firstNumber/secondNumber));
		 //output: Division=8

		System.out.println("Remainder="+(firstNumber%secondNumber));
		 //output: Remainder=30
		System.out.println("--------------------------------------------");
       
	
		//3.Left Shift & Right Shift Operators
		int leftNumber=16;
		int rightNumber=49;

		System.out.println("Number after left shift="+(leftNumber<<2));
		 //output: Number after left shift=64 (16 * 2^2 = 16 * 4 = 64)

		System.out.println("Number after right shift="+(rightNumber>>2));
		 //output: Number after left shift=12 (49 / 2^2 = 49 / 4 = 12)

		System.out.println("Number after >>> operation="+(rightNumber>>>4));
		 //output:Number after >>> operation=3 works same as right shift.

		System.out.println("Number after >>> operation="+(-rightNumber>>>4));
		 //output:Number after >>> operation=268435453.
		 //For negative no.s, >>> changes parity bit(MSB) to 0.
		System.out.println("--------------------------------------------");
        
		//4.Ternary operators: ? and :
		int first=789, second=9999;

		int maxNumber = first > second ? first : second;

		System.out.println("Maximum between two no.s="+maxNumber);
		 //output: Mximum between two no.s=9999
		System.out.println("--------------------------------------------");
        
		//5.Assignment Operators
		int x=16;
		x +=57;//output:73
		System.out.println("Result after(+=)="+x);

		x -=15;//output:58
		System.out.println("Result after(-=)="+x);

		x *=5;//output:290
		System.out.println("Result after(*=)="+x);

		x /=9;//output:32
		System.out.println("Result after(/=)="+x);
		System.out.println("--------------------------------------------");
        
		//6.Logical Operators: Logical AND(&&), OR(||)
		int a=78,b=89,c=100;

		System.out.println(a>b&&b>c);
		 //output:false

		System.out.println(a>b||b<c);
		 //output:true
		System.out.println("--------------------------------------------");
        
		//7.Bitwise Operators: Bitwise AND(&), OR(|), Exclusive-OR(^)
		int w=10,y=20,z=30;
		System.out.println(w>y&y++>z);
		 //output:false

		System.out.println(w>y|y++<z);
		 //output:true

		System.out.print("z^w="+(z^w));
		 //output: z^w=20

	}
}