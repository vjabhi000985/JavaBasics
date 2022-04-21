class BreakDemo{
	public static void main(String[] args){
		//1.Break Statement
		for(int i=1; i<=10;i++){
			//If the value of i is 5 the loop terminates
			if(i==5){
				break;
			}
			System.out.println(i);
		}
		System.out.println("--------------------------------");

		//2.Labeled Break Statement
		//The for loop is labeled as first.
		first:
		   for(int i=1; i<=5;i++){
		   	//The inner for loop is labeled as second.
		   	second:
		   	    for(int j=1;j<=5;j++){
		   	    	System.out.println("i="+i+"; j="+j);
		   	    }
		   	    // the break statement breaks the first for loop.
		   	    if(i==2)
		   	    	break first;
		   }
		System.out.println("-------------------------------");
	}
}