package com.ontariotechu.sofe3980U;



/**
 * Hello world!
 *
 */
public class App
{
	/**
	 * Main program:  The entry point of the program. The local time will be printed first,
	 *      Then it will create two binary variables, add them and print the result.
	 *
	 * @param args: not used
	 */
	public static void main( String[] args )
	{
		
		Binary binary1=new Binary("00010001000");
		System.out.println( "First binary number is "+binary1.getValue());
		Binary binary2=new Binary("111000");
		System.out.println( "Second binary number is "+binary2.getValue());
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "The sum of the binary numbers is "+sum.getValue());
		Binary orResult = Binary.or(binary1, binary2);
		System.out.println("Their OR result is: " + orResult.getValue());
		Binary andResult = Binary.and(binary1, binary2);
		System.out.println("Their AND result is: " + andResult.getValue());
		Binary multiplyResult = Binary.multiply(binary1, binary2);
		System.out.println("Their multiplication result is: " + multiplyResult.getValue());
		System.out.println("Thank you for using the Binary Calculator. Goodbye!");
	}
}




