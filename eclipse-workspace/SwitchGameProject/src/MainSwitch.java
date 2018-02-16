import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints; 
import javafx.scene.layout.GridPane;
import javafx.stage.Stage; 
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle; 
import javafx.scene.input.MouseEvent; 

public class MainSwitch extends Application{
	final int BOARD_SIZE = 8; 
	final int SQUARES = 64;
	GridPane board = new GridPane(); 
	

	public static void main(String args[])
	{

		launch(args);
	}
	public void start(Stage primaryStage) {
		buildBoard(board);
		putSquaresOnBoard(board);
		board.setPadding(new Insets(15, 15, 15, 15));
		Scene scene = new Scene(board, 700, 700);
		primaryStage.setTitle("Reversi");
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}
	private void buildBoard(GridPane board) {
		for(int i = 0; i < BOARD_SIZE; i++) {
			RowConstraints rc = new RowConstraints(); 
			rc.setMinHeight(SQUARES);
			rc.setMaxHeight(SQUARES);
			rc.setPrefHeight(SQUARES);
			rc.setValignment(VPos.CENTER);
			board.getRowConstraints().add(rc);
			
			ColumnConstraints cc = new ColumnConstraints();
			cc.setMinWidth(SQUARES);
			cc.setMaxWidth(SQUARES);
			cc.setPrefWidth(SQUARES);
			cc.setHalignment(HPos.CENTER);
			board.getColumnConstraints().add(cc);
			
		}
	}
	private void putSquaresOnBoard(GridPane board) {
		Color[] sqColors = new Color[] {Color.GREEN, Color.DARKGREEN};
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++) {
				board.add(new Rectangle(SQUARES, SQUARES,sqColors[(i+j)%2]),i,j);
			}
		}

	}
}