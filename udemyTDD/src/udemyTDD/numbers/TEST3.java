package udemyTDD.numbers;

import org.junit.Test;

import junit.framework.Assert;

public class TEST3 {
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
	
	@Test
	public void numbersDecreasingOrder() {
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {4,3,2});
		
		Assert.assertEquals(4, algorithm.getBigger());
		Assert.assertEquals(2, algorithm.getsmaller());
		
	}

	@Test
	public void numbersAnyOrder() {
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {19,5,2,17,15,10});
		
		Assert.assertEquals(19, algorithm.getBigger());
		Assert.assertEquals(2, algorithm.getsmaller());
		 
	}
	@Test
	public void onlyOneNumber() {
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {16});
		
		Assert.assertEquals(16, algorithm.getBigger());
		Assert.assertEquals(16, algorithm.getsmaller());
		 
	}
	
	@Test
	public void repeatedNumbers() {
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {16,2,16,3,4,5,15,16});
		
		Assert.assertEquals(16, algorithm.getBigger());
		Assert.assertEquals(2, algorithm.getsmaller());
		 
	}
}
 