package application;

public class Spielfeld {

	public Spielfeld(int rows, int cols, int mines) {
		int[][] map = new int[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int z = 0; z < rows; z++) {
				
				System.out.print(map[i][z]);
				
			}
		}
	}

}
