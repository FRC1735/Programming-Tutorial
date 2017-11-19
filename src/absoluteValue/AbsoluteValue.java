/**
 * 
 */
package absoluteValue;

import java.util.Scanner;

/**
 * @author Scott
 *
 */
public class AbsoluteValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    // Rather than force the rather clunky process for using command-line inputs to the program, let's instead
		// let the user type the input as part of the program execution.  It's a lot easier to program and to run this way!
		// Don't worry about this syntax/command, as FRC robots never take human input this way; it's just for easier Java programming...
		System.out.println("Enter a number.  I will tell you its absolute value:");
		int inputValue; // Define our input as being an integer
		Scanner scanner = new Scanner(System.in); // This is the special code that says "I want to eventually read some user input from the console window"
		String input = scanner.nextLine(); // This is the special code that waits for the user to type something into the console and hit enter.
		inputValue = Integer.parseInt(input);  // This convert the ASCII string into the actual integer value (remember ASCII from Level 1?
		                                       // Even numbers have an ASCII value.  The number 7, in ASCII, is actually 55!				
		//To Do:  Define an integer variable to hold the absolute value result.  Call this variable absoluteValue.
		
		
		//To Do:  Calculate the absolute value using Math.abs().  you will see some autocompletion options after you type "Math."
		//        You can type more characters to see more refined completions that match.
		//        Remember, we're taking the absolute value of an int here. (hint, hint).  Double clicking on an autocompletion option will
		//        fill it in on the line, and highlight any variables that may need to be modified.  you can then just type the var name and it will
		//        overwrite the placeholder value (which should be "a" in this case).
		
		
		//To Do:  Print the resulting absolute value to the screen.  Ideally, you want the output to look like the following line:
		//        The absolute value of -7 is 7.
		//        You already have the input value and the absolute value stored in varables above, so you just need to do
		//        the same concatenate-several-things-in-a-single-print-statement stuff you did back in HelloWorldString (hint, hint...)

		scanner.close(); // This tells the program that we're done using the console scanner and it can be turned off.

	}

}
