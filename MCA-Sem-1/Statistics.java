import java.util.*;
class Statistics{
	//Finding out the mean of a given array.
	public static int findMean(int [] array){
		//Declaring the variables.
		int sum=0, avg=0, length;

		//Getting the length of the array and storing it in len variable.
		length = array.length;

        //Using for loop to sum-up the integer elements inside the array.
		for(int j=0; j<length; j++) 
			sum += array[j];    
		
		//Calculating the average or mean by dividing the sum with the len. 
		avg = sum / length;

		return avg;
	}
	//Finding out the mean of a given array.
	public static int findMedian(int [] array){
		int res;
		int length = array.length;
		int [] sorted = new int[length];

		//This method firstly sort the array.
		System.arraycopy(array,0,sorted,0,sorted.length);
		Arrays.sort(sorted);

		//It will return the average of two middle elements of the given array.
		if(length % 2 == 0)
			res = (sorted[(sorted.length / 2) - 1] + sorted[(sorted.length / 2)]) / 2;

		//Otherwise, it returns middle element if the length of arrray is odd.
		else
			res = sorted[(sorted.length / 2)];

		return res;
	}
	//Method to calculate the mode of a given number.
	public static int findMode(int [] array){
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
		int mean, median, mode, size, choice;

		System.out.println("How many numbers would you like to enter ?"); 
		size = in.nextInt();

		int [] arr = new int[size];

		System.out.println("Enter values separated by space, to find out the mean and median:");
		for(int i = 0; i < arr.length; ++i)
			arr[i] = in.nextInt();

		System.out.println("Please enter your choice:Press 1-Mean, 2-Median or 3-Mode?"); 
		choice = in.nextInt();

		switch(choice){
			case 1:
			    mean = Statistics.findMean(arr);
			    System.out.println("Mean="+mean);
			    break;
			case 2:
			    median = Statistics.findMedian(arr);
			    System.out.println("Median="+median);
			    break;
			case 3:
			    mode = Statistics.findMode(arr);
			    System.out.println("Mode="+mode);
			    break;
			default:
			    System.out.println("Invalid option!!!!");
			    break;
		}

		in.close(); 
	}
}