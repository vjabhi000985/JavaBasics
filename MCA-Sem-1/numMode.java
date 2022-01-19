import java.util.*;
class numMode{
	//Method to calculate the mode of a given number.
	public static int mode(int [] array){
		/*
		int maxAppearances = 0, maxNumber = 0;

		for(int i=0; i<array.length; ++i){
			int count = 0;
			for(int j=0; j<array.length; ++j){
				if(array[j]==array[i])
					++count;
			}
			if(count > maxAppearances){
				maxAppearances = count;
				maxNumber = array[i];
			}
		}
		*/
		//Finding out the mode of the given array.
		int maxAppearances = -1, maxNumber = -1;

		for(int i=0; i<array.length; i++){
			int count = 0;
			for(int j=0; j<array.length; j++){
				if(array[i]==array[j])
					count++;
			}
			if(count > maxAppearances){
				maxNumber = array[i];
				maxAppearances = count;
			}
		}
		return maxNumber;
	}
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int len, res;

		System.out.println("Enter the number of elements:");
		len = in.nextInt();

		int [] arr = new int[len];

		System.out.println("Enter the elements:");
		for(int i=0; i<len;++i)
			arr[i]=in.nextInt();

		res = numMode.mode(arr);

		System.out.println("Mode="+res);

		in.close();
	}
}