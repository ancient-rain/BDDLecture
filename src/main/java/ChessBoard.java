import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
	private OutputStream stream;
	private List<Knight> knights;
	
	public ChessBoard(OutputStream stream) {
		this.stream = stream;
		this.knights = new ArrayList<>();
	}
	
	public void addPiece(Knight knight, char x, int y) {
		knight.x = x;
		knight.y = y;
		knights.add(knight);
	}
	
	public void movePiece(Knight knight, char x, int y) throws IOException {
		if (validMove(knight, x, y)) {
			knight.x = x;
			knight.y = y;
		} else {
			stream.write("Move to location failed.\n".getBytes());
		}
	}
	
	private boolean validMove(Knight knight, char x, int y) {
		return !occupied(x, y) && knight.validMove(x, y);
	}
	
	private boolean occupied(char x, int y) {
		for (Knight k : knights) {
			if (k.x == x && k.y == y) {
				return true;
			}
		}
		return false;
	}
}
