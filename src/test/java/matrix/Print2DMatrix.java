package test.java.matrix;

import java.util.Arrays;
import java.util.stream.Stream;


public class Print2DMatrix {
	public static void main(String[] args) {
		int[][] intArray = {{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println(Arrays.deepToString(intArray));
		Stream.of(intArray).map(Arrays::toString).forEach(System.out::println);
	}
}
