package udemyTDD.numbers;

import org.junit.Test;

import junit.framework.Assert;

public class TEST1 {
	// main class to excercise our code
	
	@Test
	public void numbersInIncreasingOrder() {
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {2,3,4});
		
		//System.out.println(algorithm.getBigger() == 4);
		//System.out.println(algorithm.getsmaller() == 2);
		Assert.assertEquals(4, algorithm.getBigger());
		Assert.assertEquals(2, algorithm.getsmaller());
		
	}

}
 