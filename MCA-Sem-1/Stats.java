import java.util.*;
class Stats{
	public static int findMean(int [] array){
		//Declaring the variables.
		int sum=0, avg=0, len;

		//Getting the length of the array and storing it in len variable.
		len = array.length;

        //Using for loop to sum-up the integer elements inside the array.
		for(int j=0; j<len; j++) 
			sum += array[j];    
		
		//Calculating the average or mean by dividing the sum with the len. 
		avg = sum / len;

		return avg;
	}
	public static int findMedian(int [] array){
		/*This method firstly sort the array, and 
		returns middle element if the length of arrray is odd.
		Otherwise it will return the average of two miidele elements. 
		*/
		int res;
		int len = array.length;
		int [] sorted = new int[len];

		System.arraycopy(array,0,sorted,0,sorted.length);
		Arrays.sort(sorted);

		if(len % 2 == 0)
			res = (sorted[(sorted.length / 2) - 1] + sorted[(sorted.length / 2)]) / 2;

		else
			res = sorted[(sorted.length / 2)];

		return res;
	}
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int mean, median, size;

		System.out.println("How many numbers would you like to enter ?"); 
		size = in.nextInt();

		int [] arr = new int[size];

		System.out.println("Enter values separated by space, to find out the mean and median:");
		for(int i = 0; i < arr.length; ++i)
			arr[i] = in.nextInt();

		mean = Stats.findMean(arr);
		System.out.println("Mean="+mean);

		median = Stats.findMedian(arr);
		System.out.println("Median="+median);

		in.close();
	}
}