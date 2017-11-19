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
		int numberOfArgs = 0; // This is the definition of an integer variable that will hold the number of words the user provided.
		                      // We initialize the value to zero to avoid some complaints from the editor when the program isn't fully coded.
		
		// To Do:  set the numberOfArgs variable equal to the number of actual args-- remember, this is a variable called args.length
		// Remember, integers can be set just like strings, so this should look pretty similar to what you've done in previous exercises.
		
		
		// We want to print the entire list of args (whatever they are!), all on one line, *separated by spaces*...
		// The for() loop is coded for you.  You just need to add the .print() of nextArg where requested.
		// Note that programs typically start counting with zero instead of one!  This can be a little confusing until you get used to it.
		// This means that you count to four by going 0,1,2,3.  in mathematical terms you're not counting while x <=4, you're counting while x < 4.
		// Also, you can add one to a number (increment it) using a special operation called ++.  This is basically how you tell a program to count upwards...
		for (int i=0 /*starting with the 0th arg)*/; i<numberOfArgs /* up until you've reached the number of words provided by the user*/; i++ /*incrementing i each time*/) {
			String nextArg = args[i]; // Grab the next arg in the list and put it in a temporary variable for us to use when printing
			//To Do:  print nextArg, but use the variant that doesn't move to the next line of the Console.
			//        Remember:  you can use ctl-Space to get command completion if you can't recall the exact syntax.
			//        You already used the similar println in the previous programs, so you can look at those for hints if you can't remember.
			// HINT:  Do you need to do anything else besides printing the arg itself to get it to print properly...?
			//        When a program gets the args from the command line, it ignores the spaces and puts the individual words into the arg list.
			//        How might you get those spaces back?  What could you do to print a space?
			
		}
			
		// To do:  Since we never move to a new line, print one here at the very end just to clean things up.
		// you can simply do a println of an empty string "" to do this.  It won't print anything, and then will move to the next line.
		

	}

}
