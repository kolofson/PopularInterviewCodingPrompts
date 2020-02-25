package productArray;

import java.util.LinkedList;

/*
 * Given an array of integers, return a new array 
 * such that each element at index i of the new array 
 * is the product of all the numbers in the original array except the one at i.
 */

public class NewArray {

	public static void main(String[] args) {
		LinkedList<Integer> original = new LinkedList<Integer>();
		//add temp values
		original.add(2);
		original.add(9);
		original.add(3);
		original.add(12);
		original.add(6);
		LinkedList<Integer> array = new LinkedList<Integer>();
		//display original for comparison
		System.out.println("Original: \n\t" + original);
		int value = 1;
		//iterate through array
		for (int i = 0; i < original.size(); i++) {
			//remove index i
			int remove = original.get(i);
			original.remove(i);
			//get all values except i and multiply
			for (int j = 0; j < original.size(); j++) {
				value *= original.get(j);
			}
			array.add(value);
			//add index i back
			original.add(i, remove);
			value = 1;
		}
		//display result
		System.out.println("After: \n\t" + array);
	}

}
