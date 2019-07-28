package test.java.skills;

import java.util.stream.IntStream;

public class ReverseStringJava8 {
	
	public static void main(String[] args) {

        char[] charArray = "Aarti".toCharArray();
        
        IntStream.range(0, charArray.length)
            .mapToObj(i -> charArray[(charArray.length - 1) - i])
            .forEach(System.out::print);
    }
}
