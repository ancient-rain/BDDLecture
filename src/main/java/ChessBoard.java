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
		
	}
	
	public void movePiece(Knight knight, char x, int y) {
		knight.x = x;
		knight.y = y;
	}
}
