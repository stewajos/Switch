
import java.util.*;
import java.util.ArrayList;

public class reversi {
/** The number of rows (height) and columns (width). */
private int rows,cols;
/** The game board */
private Cell[][] board;
/** Enumerated variable to keep track of game status. */
private GameStatus status = GameStatus.IN_PROGRESS;
/** A list of all the non-empty tiles on the board */
private ArrayList<Cell> nonEmpty;

public int getRows(){
	return rows;
}

public int getCols(){
return cols;
}

public GameStatus getStatus(){
	return status; 
}
public ArrayList<Cell> getNonEmptyTiles() {
	// create a new ArrayList to store nonempty cells
	nonEmpty = new ArrayList<Cell>();
	
	// search through 2D array to find non-empty cells
	// store each non-empty cell in the ArrayList
	for(int i = 0; i < rows; i++) {
		for(int j = 0; j < cols; j++) {
			// create a cell for each non-empty location on board
			// to store within the ArrayList
			if(board[i][j] != null) {
				// assign the row, col of non-empty cell in cell object
				//c = new Cell(i, j, board[i][j]);
				// add this cell to the list
				nonEmpty.add(new Cell(i, j, board[i][j]));
			}
		}
	}
	return nonEmpty;
}
}
