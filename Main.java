package missingNumber;

/* PROMPT:
 * Given an array of integers, find the first missing positive integer 
 * The array can contain duplicates and negative numbers as well.
 * For example, the input [3, 4, -1, 1] should give 2. 
 * The input [1, 2, 0] should give 3.
 */

public class Main {

	public static void main(String[] args) {
		
		int numbers [] = {-1, 1, 2};
		
		for (int i = 0; i < numbers.length - 1; i++) {
			int j = i + 1;
			
				if ((numbers[i] + 1) != numbers[j]) {
					System.out.println(numbers[i] + 1);
					break;
				}
		}
	}
}
