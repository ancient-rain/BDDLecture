import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class ChessSteps {
	public ChessBoard board = null;
	public Knight knight = null;
	public ByteArrayOutputStream stream = null;
	
	@Given("^an empty chessboard$")
	public void an_empty_chessboard() throws Throwable {
		stream = new ByteArrayOutputStream();
	    board = new ChessBoard(stream);
	}

	@Given("^the (black|white) knight is placed on (.) (\\d+)$")
	public void the_black_knight_is_placed_on(String color, char x, int y) throws Throwable {
		knight = new Knight(color);
		board.addPiece(knight, x, y);
	}

	@When("^the (black|white) knight tries to move to (.) (\\d+)$")
	public void the_black_knight_tries_to_move_to(String color, char x, int y) throws Throwable {
		board.movePiece(knight, x, y);
	}

	@Then("^the (black|white) knight is placed at (.) (\\d+)$")
	public void the_black_knight_is_placed_at(String color, char x, int y) throws Throwable {
		assertEquals(color, knight.color);
	    assertEquals(x, knight.x);
	    assertEquals(y, knight.y);
	}
}
