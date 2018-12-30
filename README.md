# JAVA TEST DRIVEN DEVELOPMENT

This repo is for practice code in building best practices for test driven development code base in JAVA

Look at the JAVA code in this repo under the package class BiggerAndSmaller, is this production ready? **NO**

If we simply try 

`algorithm.find(new int[] {2,3,4});`

We will get a bug - possibly to do with initialisation. In our code case, originally we had 

` if get n > bigger .... else if n < smaller `

The issue is the else if - the question is, does this happen in the real world? ** YES ** 

Hence Test Driven Development i.e. Test in parallel as you build your code, but critically automate it. Some key points to consider. 

1. Software should not be tested manually Ad-Hoc
2. It is impossible to cover all test cases manually even if you wanted to - consider A-B testing, and how interdependent components change given a small alteration to one element. As code grows in complexity, so does the impact of a minor change. 


## Manual Testing 

Manual testing normally comes in three parts 

1. **Scenario** , such as a given order 'Can you test for me that login functionality works?' , 'what happens if a enter a wrong password'. 
2. You then **Excercise** the function with an action, such as you go to the login add in your information and press select
3. Then you **Validate** the application worked as expected. 

## Deeper Look 

Take a look at the code base below 

```
package udemyTDD.numbers;

public class Program {
	// main class to excercise our code
	public static void main(String[] args) {
		BiggerAndSmaller algorithm = new BiggerAndSmaller();
		
		algorithm.find(new int[] {2,3,4});
		
		System.out.println(algorithm.getBigger());
		System.out.println(algorithm.getsmaller());
	}

}

```

Notice that we almost have a complete automated test. Because as soon as you invoke this program, it will run forever to completion, it will run the #algorithm.find# object with a set number of parameters (123). 

The only issue is there is a manual validation at the print section, because it still depends on a human to check it. 

## Potential Solution 

Running the boolean statements below should get us a step closer to automation...

`
System.out.println(algorithm.getBigger() == 4);  
System.out.println(algorithm.getsmaller() == 2);
`
This should print out the following: 

`
TRUE
TRUE
`


