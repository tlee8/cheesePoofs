/**
	Represent solutions to solve a maze in which looping does not occur.
	
	(i.e., the "explorer" steps on each step exactly once.)
	
	Uses the Maze class to represent a maze board.
	
	*/

import java.util.ArrayList;
	
public class MazeSolver {

    // ArrayList< Maze > solutions; // to hold valid solutions found during the solving
				     // process
    private Maze inProgress; 	     // used during the solver method to find a solution
	// private int steps;
	// "steps" is held off for now - until a later version
	
	
	// a constructor that updates solutions such that all correct paths that exist
	// for the maze are included.
	public MazeSolver( Maze maze ) {
	    inProgress = maze;
		steps = 0;
		}
	
	
	
	// CHANGE TO PRIVATE
	public boolean solve() {
		// base case
		if (inProgress.explorerIsOnA() == inProgress.TREASURE) {
			System.out.println("Current board:" + "\n" + inProgress);
			return true;
	    }
	    if (inProgress.explorerIsOnA() == inProgress.WALL) {
			return false;
	    }
		// recursive case
		// tries different directions, sees if they're solvable, and if so,
		// returns true
		Maze snapshot = new Maze( inProgress);
		System.out.println("Current board: " +"\n" + inProgress);
		for( int dir = 0; dir < 4; dir++) {
			inProgress.dropA(inProgress.WALL);
			inProgress.go( (int) Math.pow(2, dir));
			
			if ( (inProgress.explorerIsOnA() == inProgress.STEPPING_STONE ||
				  inProgress.explorerIsOnA() == inProgress.TREASURE)
				&& solve()) { 
				return true;
			}
			
			else {
				inProgress = new Maze( snapshot);
				
			}
		}
		// if the maze isn't solvable
		return false;
		
	}
}