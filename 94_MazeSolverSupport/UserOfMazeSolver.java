/**
	Test MazeSolver by using incremental development.

	Specify which maze to use and where the explorer starts like...
		> java UserOfMazeSolver mazes/4cell_treasureWest 1 1
	Which creates a maze that looks like
		
	
*/


public class UserOfMazeSolver {

	public static void main(String[] commandLine){
	
		Maze maze = new Maze( commandLine[0]
                   , Integer.parseInt( commandLine[1])
                   , Integer.parseInt( commandLine[2])
                   );
		// creates a new maze based off of what was given by the command line
			
		
		test(maze);
			
	}
	
	public static void test( Maze maze) {
		
		System.out.println( "Original: " + maze +
							System.lineSeparator() +
							new MazeSolver( maze ) +
							System.lineSeparator());	
	
	}
	
}