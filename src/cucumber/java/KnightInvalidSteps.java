import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.*;

public class KnightInvalidSteps {
	private ChessSteps steps;
	private Knight anotherKnight = null;
	
	public KnightInvalidSteps(ChessSteps steps) {
		this.steps = steps;
	}
	
	@Given("^a second ([a-z]+) knight is placed on ([a-h]) (\\d+)$")
	public void a_second_black_knight_is_placed_on(String color, char x, int y) throws Throwable {
	    this.anotherKnight = new Knight(color);
	    this.steps.board.addPiece(this.anotherKnight, x, y);
	}

	@Then("^the black ([a-z]+) remains at ([a-h]) (\\d+)$")
	public void the_black_knight_remains_at_d(char x, int y) throws Throwable {
	    assertEquals(x, this.steps.knight.x);
	    assertEquals(y, this.steps.knight.y;
	}

	@Then("^the user is told that the move failed$")
	public void the_user_is_told_that_the_move_failed() throws Throwable {
	    assertNotEquals(0, this.steps.outstream.toByteArray().length);
	}
}