package solveForK;
/*
 * Given a list of numbers and a number k, 
 * return whether any two numbers from the list add up to k.
 */
public class K {

	static boolean findSumOfK(int k, int list []) {
		boolean foundSum = false;
		for (int i = 0; i < list.length; i++) {
			for (int j = 1; j < list.length; j++) {
				System.out.println(list[i] + " " + list[j]);
				if ((list[i] + list[j]) == k) {
					foundSum = true;
					break;
				} else {
					foundSum = false;
				}
			}
			if (foundSum) {
				break;
			}
		}
		if (foundSum) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		int numbers [] = {17, 0, 6, 5, 3};
		System.out.println(findSumOfK(20, numbers));
	}

}
