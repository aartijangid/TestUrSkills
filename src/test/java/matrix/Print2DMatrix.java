package test.java.matrix;

import java.util.Arrays;
import java.util.stream.Stream;


public class Print2DMatrix {
	
	
	public static void main(String[] args) {
		Print2DMatrix print2dMatrix = new Print2DMatrix();
		print2dMatrix.printMatrix();
		
		print2dMatrix.drawLine();
		
		String LINE_SEPERATOR = System
				.getProperty("line.separator");
		System.out.println(LINE_SEPERATOR); // "\n"
	}
	
	private void drawLine() {
		char[][] charMatrix = new char[1][9];
		
		int x1 = 0, y1 = 0, x2 = 8, y2 = 0;
		
		System.out.println("x1 " + x1);
		System.out.println("y1 " + y1);
		System.out.println("x2 " + x2);
		System.out.println("y2 " + y2);

		//Vertical line
		if (x1 == x2) {
			for (int i = y1; i <= y2; i++) {
				charMatrix[i][x1] = '-';
			}
		} else if (y1 == y2) { // horizonatal line
			Arrays.fill(charMatrix[y1], x1, x2, '-');
		} 
		System.out.println(Arrays.deepToString(charMatrix));
	}

	void printMatrix() {
		int[][] intArray = {{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println(Arrays.deepToString(intArray));
		Stream.of(intArray).map(Arrays::toString).forEach(System.out::println);
	}
	
}
