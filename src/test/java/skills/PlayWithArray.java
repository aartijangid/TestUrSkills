package test.java.skills;

public class PlayWithArray {
	public static void main(String[] arg) {
	char array[] = {'a', 'b', 'c', 'd'};
	
	@SuppressWarnings("rawtypes")
	Class classArray = array.getClass();
	String name = classArray.getName();
	System.out.println(name);
	}
}
