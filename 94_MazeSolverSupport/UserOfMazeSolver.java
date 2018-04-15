/**
	Test MazeSolver by using incremental development.

	Specify which maze to use and where the explorer starts like...
		> java UserOfMazeSolver mazes/4cell_treasureWest.txt 1 1
	Which creates a maze that looks like
		
	
*/


public class UserOfMazeSolver {

	public static void main(String[] commandLine)
	  throws java.io.FileNotFoundException {
		// creates a new maze based off of what was given by the command line
		test(new Maze( commandLine[0]
                   , Integer.parseInt( commandLine[1])
                   , Integer.parseInt( commandLine[2])
                   ));
	}
	
	public static void test( Maze maze) {
		MazeSolver Fred = new MazeSolver( maze); 
		System.out.println(Fred.solve());
		//System.out.println( "Original: " + //maze +
		//					new MazeSolver( maze ) +
		//					System.lineSeparator());	
	}
	
}
