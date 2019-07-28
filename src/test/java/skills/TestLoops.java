package test.java.skills;

public class TestLoops {
	public static void main(String args[]) {
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
				if(i%5 == 0)
					System.out.println("multiple of 5 and 3");
				else 
					System.out.println("multiple of 3");
			}else if(i%5 == 0 && i%3 !=0) {
				System.out.println("multiple of only 5");
			}else 
				System.out.println(i);
		}
	}
}