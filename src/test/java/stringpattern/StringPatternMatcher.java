package test.java.stringpattern;

import java.util.regex.Pattern;

public class StringPatternMatcher {

	static Pattern pattern = Pattern
			.compile("[a-zA-Z]{1}(\\s\\d+)*(\\s[a-zA-z]{1})?");

	public static void main(String[] arg) {
		// input for canvas
		String canvasString = "c 20 10 ";
		if(pattern.matcher(canvasString).matches()) {
			System.out.println("canvas input pattern matched");
		}else
			System.out.println("canvas input pattern didnt matched");

		// input for line
		String lineString = "l 2 4 6 4";
		if(pattern.matcher(lineString).matches()) {
			System.out.println("line input pattern matched");
		}else
			System.out.println("line input pattern didnt matched");

		// input for line
		String rectangleString = "r 2 4 9 10";
		if(pattern.matcher(rectangleString).matches()) {
			System.out.println("rectangle input pattern matched");
		}else
			System.out.println("rectangle input pattern didnt matched");
		
		String bucketfill = "b 2 3 o";
		if(pattern.matcher(bucketfill).matches()) {
			System.out.println("bucketfill input pattern matched");
		}else
			System.out.println("bucketfill input pattern didnt matched");
		
		String quit = "q";
		if(pattern.matcher(quit).matches()) {
			System.out.println("quit input pattern matched");
		}else
			System.out.println("quit input pattern didnt matched");
		
		String incorrectInput = "ss  fdg 20 10 10 10";
		if(pattern.matcher(incorrectInput).matches()) {
			System.out.println("incorrectInput input pattern matched");
		}else
			System.out.println("incorrectInput input pattern didnt matched");
	}
}
