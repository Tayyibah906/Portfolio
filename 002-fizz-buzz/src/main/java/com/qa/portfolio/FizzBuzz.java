package com.qa.portfolio;

public class FizzBuzz {

	/**
	 * Gives string output of a numeric value by applying the fizzbuzz rules: <br>
	 * <ul>
	 * <li>If the number is divisible by 3 it will return "fizz"</li>
	 * <li>If the number is divisible by 5 it will return "buzz"</li>
	 * <li>If the number is divisible by 3 and 5 it will return "fizzbuzz"</li>
	 * <li>If the number is divisible by neither 3 or 5 it will return the 
	 * value of the the number as a string</li>
	 * </ul>
	 * @param number
	 * @return 
	 * @return "fizz", "buzz", "fizzbuzz" or numeric value as a string
	 */
	public void fizzBuzz(int number) {
		for (int i = 1; i <= number; i++) 
        {
            if (((i % 3) == 0) && ((i % 5) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 3) == 0)
                System.out.println("fizz");
            else if ((i % 5) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }

		
	}
}
