import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class ChessSteps {
	public ChessBoard board = null;
	public Knight knight = null;
	public ChessBoard outstream = null;
	
	@Given("^an empty chessboard$")
	public void an_empty_chessboard() throws Throwable {
	    board = new ChessBoard();
	    outstream = new ChessBoard(outstream);
	}

	@Given("^the black knight is placed on (.) (\\d+)$")
	public void the_black_knight_is_placed_on(char x, int y) throws Throwable {
		knight = new Knight("black");
		board.addPiece(knight, x, y);
	}

	@When("^the black knight tries to move to (.) (\\d+)$")
	public void the_black_knight_tries_to_move_to(char x, int y) throws Throwable {
		board.movePiece(knight, x, y);
	}

	@Then("^the black knight is placed at (.) (\\d+)$")
	public void the_black_knight_is_placed_at(char x, int y) throws Throwable {
	    assertEquals(x, knight.x);
	    assertEquals(y, knight.y);
	}
}
