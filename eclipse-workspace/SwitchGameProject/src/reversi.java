
import java.util.ArrayList;
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
private boolean movePossible() {
	// check if space available
	getNonEmptyTiles(); // find all non-empty tiles
	if( nonEmpty.size() == (rows * cols) ) {
		// check if 2 adjacent cells have the same value if full
		for(int i = 0; i < rows; i++)
			for(int j = 0; j < cols; j++) {
				if(i < rows - 1 && j < cols - 1) {
					if(board[i][j] == board[i][j + 1] ||
						board[i][j] == board[i + 1][j]) {
						//status = GameStatus.IN_PROGRESS;
						return true;
					}
				}
				else if(i == rows - 1 && j < cols - 1) {
					if(board[i][j] == board[i][j + 1]) {
						//status = GameStatus.IN_PROGRESS;
						return true;
					}
				}
			}
		status = GameStatus.USER_LOST;
		return false;
	}
	status = GameStatus.IN_PROGRESS; // put here?
	return true;
}
public boolean checkTiles(Cell c){
	ArrayList<Cell> check;
	//Checking to the right of the placed tile
		for(int i = c.row + 1; i < getRows(); i++){
			if(c.getValue() == board[i][c.column].getValue()){
				//Flip all the tiles in between
			}	
		}

		//Checking to the left of the placed tile
		for(int i = c.row - 1; i >= 0; i--){
			if(c.getValue() == board[i][c.column].getValue()){
				//Flip all the tiles in between
			}	
		}

		//Checking above the placed tile
		for(int j = c.column + 1; j < getCols(); j++){
			if(c.getValue() == board[c.row][j].getValue()){
				//Flip all the tiles in between
			}	
		}

		//Checking to the left of the placed tile
		for(int j = c.column - 1; j >= 0; j--){
			if(c.getValue() == board[c.row][j].getValue()){
				//Flip all the tiles in between
			}	
		}

		//Checking the diagonal down-left of the placed tile
		for(int i = c.row - 1; i >= 0; i--){
			int j = c.column - c.row + i;
			if(c.getValue() == board[i][c.column].getValue()){
				//Flip all the tiles in between
			}	
		}

		//Checking the diagonal up-left of the placed tile
		for(int i = c.row - 1; i >= 0; i--){
			int j = c.column + c.row - i;
			if(c.getValue() == board[i][c.column].getValue()){
				//Flip all the tiles in between
			}	
		}

		//Checking the diagonal down-right of the placed tile
		for(int i = c.row + 1; i < getRows(); i++){
			int j = c.column - c.row + i;
			if(c.getValue() == board[i][c.column].getValue()){
				//Flip all the tiles in between
			}	
		}

		//Checking the diagonal up-right of the placed tile
		for(int i = c.row + 1; i < getRows(); i++){
			int j = c.column + c.row - i;
			if(c.getValue() == board[i][c.column].getValue()){
				//Flip all the tiles in between
			}
			return true;
		} return true;
}
}


