package udemyTDD.numbers;

public class BiggerAndSmaller {

	private int bigger = Integer.MIN_VALUE;
	private int smaller = Integer.MAX_VALUE;

	// This class takes a list of numbers and returns the biggest or smallest
	// will not do a sort, will do a bubble search
	
	public void find(int[] numbers) {
		for(int n : numbers){
			if(n > bigger) bigger = n;
			if(n < smaller) smaller = n;
			
		}
		
	}
	// at this point bigger and smaller are instantiated even if the getbigger isn't called
	
	
	public int getBigger() {
		return bigger;
	}
	
	public int getsmaller() {
		return smaller;
	}
	
}
