public class RecursionDemo{
	static int factorial(int n){
		if(n==0){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	static int fibonnaci(int n){
		if(n==0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
		else{
			return fibonnaci(n-1)+fibonnaci(n-2);
		}
	}
	public static void main(String[] args){
		int nums = 5;
		System.out.println(factorial(nums));

		int range = 6;
		for(int i=0;i<range;i++){
			System.out.print(fibonnaci(i)+" ");
		}
	}
}