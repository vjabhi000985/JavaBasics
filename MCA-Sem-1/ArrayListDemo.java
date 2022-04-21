import java.util.*;
public class ArrayListDemo{
	public static void main(String[] args){
		ArrayList<Integer> arr= new ArrayList<Integer>(10);

		System.out.println("Before adding elements:"+arr);

		arr.add(78);
		arr.add(67);
		arr.add(71);
		arr.add(99);
		arr.add(671);

		System.out.println("After adding elements:"+arr);

		arr.remove(4);

		System.out.println("After removing an element:"+arr);
	}
}