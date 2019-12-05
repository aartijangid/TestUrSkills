/*
 *
 * This problem was recently asked by Google.
 *
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * Bonus: Can you do this in one pass?
 *
 * */

package test.java.skills;

import java.util.HashSet;

public class AddUpNumbers {
	public static void main(String args[]) {
		int[] numberArray = {10, 15, 3, 7};

		HashSet<Integer> hashSet = new HashSet<Integer>();

		for(int i = 0; i < numberArray.length; i++) {
			//	System.out.println(numberArray[i]);
			//	System.out.println(17 - numberArray[i]);

			if(hashSet.contains(17 - numberArray[i])) {
				System.out.println("true");
			} else
				hashSet.add(numberArray[i]);

		}
	}
}
