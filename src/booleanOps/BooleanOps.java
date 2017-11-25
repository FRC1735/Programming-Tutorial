/**
 * 
 */
package booleanOps;

import java.util.Scanner;

/**
 * @author Scott
 * This example demponstrates the use of NOT, AND, OR, XOR.
 *
 */
public class BooleanOps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Grab the values from user console input for A and B
		Scanner scanner = new Scanner(System.in); // This is special code that says "I want to eventually read some user input from the console window"
		String input;
		
		System.out.println("This program computes the roots of the quadratic equation for REAL (not complex) roots.");
		System.out.println("For value a, enter true or false:");
		input = scanner.nextLine();     // This is the special code that waits for the user to type something into the console and hit enter.
		boolean a = Boolean.parseBoolean(input);  // This convert the ASCII string into the actual "real" number decimal value (remember ASCII from Level 1?
		                                       // Even numbers have an ASCII value.  The number 7, in ASCII, is actually 55!
		System.out.println("For value b, enter true or false:");
		input = scanner.nextLine();  // We had already defined "input" as a String above.  You can only define it once so here we just use the variable.
		boolean b = Boolean.parseBoolean(input);  // get the value for b.

		// To Do:  For the given a and b, print the not, and, or, and xor of the values.
		//         Note that for NOT, you should print the NOT of both a and b (we'll call these a' and b'); the others will have a single output value.
		//         Output should ideally look like this (but don't worry if the true/false cause the NOT line to be a column off from the others)
		//         a      b        Operation       Output
		//         true   false    NOT             a' = false, b' = true
		//                         AND             false
		//                         OR              true
		//                         XOR             true
		// Output using spaces (NOT line varies based on character length of true versus false)

		
		scanner.close(); // This tells the program that we're done using the console scanner and it can be turned off.		
	}

}
