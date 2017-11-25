/**
 * 
 */
package quadratic;

import java.util.Scanner;

/**
 * @author Scott
 * This program will print the (real) roots of the quadratic equation ax^2 + bx + c = 0.
 * It does not attempt to handle negative discriminants, so many values will result in NaN ("Not a Number") errors.
 *
 */
public class Quadratic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Grab the values from user console input for A, B, and C.
		// This is similar to what we did in AbsoluteValue.
		Scanner scanner = new Scanner(System.in); // This is special code that says "I want to eventually read some user input from the console window"
		String input;
		
		System.out.println("This program computes the roots of the quadratic equation for REAL (not complex) roots.");
		System.out.println("Enter a number for value a:");
		input = scanner.nextLine();     // This is the special code that waits for the user to type something into the console and hit enter.
		double a = Double.parseDouble(input);  // This convert the ASCII string into the actual "real" number decimal value (remember ASCII from Level 1?
		                                       // Even numbers have an ASCII value.  The number 7, in ASCII, is actually 55!
		System.out.println("Enter a number for value b:");
		input = scanner.nextLine();  // We had already defined "input" as a String above.  You can only define it once so here we just use the variable.
		double b = Double.parseDouble(input);  // get the value for b.
		
		//To Do:  Create the user input for getting value c
		
		// To Do:  Using the functions Math.sqrt(x) and Math.pow(x,y), create the two roots of the solution.
		//         Call them x1 and x2.  They should be doubles, just like a, b, and c.
		// Hint:   Be very careful of operator precedence and use of parentheses!!!!!
		

		// To Do: Print the two values.  Ideally your output should look like:
		//        The roots of the equation are -1.0 and -0.5	
	
		scanner.close(); // This tells the program that we're done using the console scanner and it can be turned off.
	}
}
