/**
 * 
 */
package echo;

/**
 * @author Scott
 * 
 * This program simply takes all command-line input from the user, and echoes it to the Console via println
 *
 */
public class Echo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfArgs; // This is an integer variable that will hold the number of words the user provided.
		
		// To do:  set the numberOfArgs variable equal to the number of actual args-- remember, this is a variable called args.length		// integers can be set just like strings, so this should look pretty similar.
		
		
		// We want to print the entire list of args (whatever they are!), all on one line, separated by spaces...
		// The for() loop is coded for you.  You just need to add the .print() of nextArg where requested.
		for (int i=0 /*starting with the 0th arg)*/; i<numberOfArgs /* up until you've reached the number of words provided by the user*/; i++ /*incrementing i each time*/) {
			String nextArg = args[i]; // Grab the next arg in the list and put it in a temporary variable for us to use when printing
			//To Do:  print nextArg, but use the variant that doesn't move to the next line of the Console.
			//        Remember:  you can use ctl-Space to get command completion if you can't recall the exact syntax.
			//        Do you need to do anything else besides the arg to get it to print properly...?  (hint, hint...)
			
		}
			
		// To do:  Since we never move to a new line, print one here at the very end just to clean things up.
		// you can simply do a println of an empty string "" to do this.

	}

}
