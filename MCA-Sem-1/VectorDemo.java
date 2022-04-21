import java.util.*;
public class VectorDemo{
	public static void main(String[] args){
		//Creating a default vector.
		Vector list = new Vector();

		//Adding custom elements.
		//Using add method.
		list.add(1);
		list.add(4);
		list.add(67);
		list.add("Welcome");
		list.add("Abhi");
		list.add(100);

		//Creating a generic vector.
		Vector<Integer> nums = new Vector<Integer>();

		//Adding custom elements using add method.
		nums.add(567);
		nums.add(678);
		nums.add(0);

		//Updating the vector.
		nums.set(2,899);

		//Removing the elements using remove(index).
		//Removing the elements using remove(object).
		list.remove(5);

		//Printing the vector elements to the console.
		System.out.println("Vector elements are "+list);

		//Printing the generic vector elements to the console.
		System.out.println("Vector elements are "+nums);

	}
}