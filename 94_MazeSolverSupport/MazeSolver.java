/**
	Represent solutions to solve a maze in which looping does not occur.
	
	(i.e., the "explorer" steps on each step exactly once.)
	
	Uses the Maze class to represent a maze board.
	
	*/

import java.util.ArrayList;
	
public class MazeSolver {

    // ArrayList< Maze > solutions; // to hold valid solutions found during the solving
				     // process
    Maze inProgress; 	     // used during the solver method to find a solution


	// a constructor that updates solutions such that all correct paths that exist
	// for the maze are included.
	public MazeSolver( Maze maze ) {
	    // base case
	    Maze inprogress = maze;
 
	    if (maze.explorerIsOnA() == maze.TREASURE) {
		System.out.println("Solved");
		return;
	    }
	    if (maze.explorerIsOnA() == maze.WALL) {
		return;
	    }
		
	}


	// returns a String representing the board
	public String toString() {
	    
	    System.out.println(inProgress.explorerIsOnA());
	    return inProgress.toString();
	    
	    
	}


}
