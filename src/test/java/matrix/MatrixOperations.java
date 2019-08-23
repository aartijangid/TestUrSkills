package test.java.matrix;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixOperations {
	public static void main(String[] arg) {
		char[][] test2DMatrix = {{'-','-','-','-','-','-','-','-','-','-','-','-'},
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '|'},
				{'|', 'o', 'o', 'x', 'x', 'x', 'o', 'o', 'o', 'o', 'o', '|'},
				{'|', 'o', 'o', 'x', 0, 'x', 'o', 'o', 'o', 'o', 'o', '|'},
				{'|', 'o', 'o', 'x', 0, 'x', 'o', 'o', 'o', 'o', 'o', '|'},
				{'|', 'o', 'o', 'x', 0, 'x', 'o', 'o', 'o', 'o', 'o', '|'},
				{'|', 'o', 'o', 'x', 'x', 'x', 'o', 'o', 'o', 'o', 'o', '|'},
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '|'},
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '|'},
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '|'},
				{'-','-','-','-','-','-','-','-','-','-','-','-'}};
		
		// Handles empty indexes as well
		System.out.println("1. using traditional for loop: ");
		StringBuilder shapeAsString = new StringBuilder();

		for (int i = 0; i < test2DMatrix.length; ++i) { 
			for (int j = 0; j < test2DMatrix[i].length; j++) { 
				shapeAsString.append((test2DMatrix[i][j]) == 0 ? " " : test2DMatrix[i][j]); 
			} shapeAsString.append("\n"); 
		}
		
		System.out.println(shapeAsString);
		
		// below excludes empty indexes from 2D
		System.out.println("2. using Map: ");
		Stream.of(test2DMatrix).flatMap(Stream::of).forEach(System.out::println);

		System.out.println("3. using stream: ");
		Arrays.asList(test2DMatrix).stream().forEach(System.out::println);
		
		System.out.println("4. replacing inner loopp of columns: ");
		StringBuilder shapeAsString2 = new StringBuilder();
		
		for (int i = 0; i < test2DMatrix.length; ++i) {
			shapeAsString2.append(String.valueOf(test2DMatrix[i]));
			shapeAsString2.append("\n");
		}

		System.out.println(shapeAsString2);
		
	}
}
