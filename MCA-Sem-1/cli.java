class cli{
	public static void main(String [] args){

		int num1,num2,res;

	/* Incompatible Types Error : Required Integer, Found String.	
		num1 = args[0];
		num2 = args[1];
		res = num1 + num2;
	*/
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		res = num1 + num2;

		System.out.println("The result is:"+res);
	}
}