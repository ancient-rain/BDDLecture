import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class ChessSteps {
	ChessBoard board = null;
	
	@Given("^an empty chessboard$")
	public void an_empty_chessboard() throws Throwable {
	    board = new ChessBoard();
	}

	@Given("^the black knight is placed on d (\\d+)$")
	public void the_black_knight_is_placed_on_d(int y) throws Throwable {
		knight = new Knight("black");
		board.addPiece(knight, 'd', y);
	}

	@When("^the black knight tries to move to c (\\d+)$")
	public void the_black_knight_tries_to_move_to_c(int y) throws Throwable {
		board.movePiece(knight, 'c', y);
	}

	@Then("^the black knight is placed at c (\\d+)$")
	public void the_black_knight_is_placed_at_c(int y) throws Throwable {
	    assertEquals('c', knight.x);
	    assertEquals(y, knight.y);
	}
}
