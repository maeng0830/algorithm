package backtracking;

public class ex1 {

	public static final int X = 7;
	public static final int Y = 3;

	public static void main(String[] args) {
		int[][] mapArray = {
				{1, 1, 1, 1, 1, 1, 1, 1},
				{0, 0, 0, 0, 0, 0, 0, 1},
				{1, 1, 1, 0, 1, 1, 1, 1},
				{1, 0, 0, 0, 0, 0, 0, 0},
				{1, 1, 1, 1, 1, 1, 1, 1}
		};

		boolean[][] checkArray = {
				{false, false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false, false},
				{false, false, false, false, false, false, false, false},
		};

		logic(mapArray, checkArray, 0, 1);

	}

	public static void logic(int[][] mapArray, boolean[][] checkArray, int x, int y) {
		if (x == X && y == Y) {
			System.out.printf("(%d, %d)", x, y);
			return;
		} else if (0 > x || y < 0 || x > mapArray[y].length - 1 || y > mapArray.length - 1) {
			return;
		} else if (mapArray[y][x] == 1) {
			return;
		} else if (checkArray[y][x]) {
			return;
		}

		checkArray[y][x] = true;
		System.out.printf("(%d, %d)", x, y);

		logic(mapArray, checkArray, x, y - 1);
		logic(mapArray, checkArray, x, y + 1);
		logic(mapArray, checkArray, x - 1, y);
		logic(mapArray, checkArray, x + 1, y);

	}

}
