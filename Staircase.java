package staircaseDilemna;

public class Staircase {
	
	static int waysToClimb(int steps) {
		
		if (steps >= 3) {
			int[] res = new int[steps + 1]; 
	        res[0] = 1; 
	        res[1] = 1; 
	        res[2] = 2; 
	  
	        for (int i = 2; i <= steps; i++) {
	            res[i] = res[i - 1] + res[i - 2]; 
	        }
	        return res[steps];
		} else if (steps == 2) {
			return 2;
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		//get staircase step total
		System.out.println("Staircase Steps:");
		//run algorithm and display result(s)
		int stairs = (int) (Math.random() * 10 ) + 1;
		System.out.println("Steps: " + stairs);
		System.out.println(waysToClimb(stairs));
	}
}
