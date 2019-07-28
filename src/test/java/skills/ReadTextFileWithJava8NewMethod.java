package test.java.skills;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTextFileWithJava8NewMethod {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		// New method Files.newBufferedReader(Paths.get("file")) to return a BufferedReader in Java 8
		try (BufferedReader br = Files.newBufferedReader(Paths.get("books.txt"))) {

			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line).append("\n");
				String lineArray[] = line.split(";");
				if(lineArray.length != 4) {
					System.out.println("token missing");
				}
			}
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
		System.out.println(sb);
	}
}
