# CheesePooves

## personnel
Ela Gulsen, Thomas Lee


## statement of problem

objective: return the boolean value of the statement ìthere exists one
path through a maze starting at a designated beginning ending at treasureî
definition: maze grid with barriers
looping disallowed: reaching any stepping stone at most once 
shortest way (vn)

## recursive abstraction
When I am asked to return the boolean value of the statement ìthere exists one
path through a maze starting at a designated beginning ending at treasureî,
the recursive abstraction can find a path starting from one step adjacent
from the former designated starting point and ending at the treasure.

## base case
The explorer's designated starting point is on the treasure, and the path
is recorded.

## English or pseudocode description of algorithm
if (explorer on treasure) base case;
else {
	for ( int t = 0; t < 4; t++ ) {
		if ( t == 0 ) move( "up" );
		else if ( t == 1 ) move( "down" );
		else if ( t == 2 ) move( "left" );
		else move( "right" );
		if (isLegal) recursive abstraction; 
	}
	go back to the last step; 
}

## class(es), with fields and methods
MazeMap class
* isLegal()
* move( String direction )
* remove 

MazeSolver class
* findSolution( MazeMap maze )

## version*n* wish list
* All of the different solutions for the maze
* Number of solutions 
* Able to detect the legality of looping and disclude looping paths from 
the valid paths
