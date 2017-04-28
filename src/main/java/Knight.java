
public class Knight {
	char x;
	int y;
	
	public Knight(String color) {

	}
	
	public boolean validMove(char row, int col) {
		int deltaX = Math.abs(row - x);
		int deltaY = Math.abs(col - y);
		
		return deltaX + deltaY == 3 && row != x && col != y;
	}
}
