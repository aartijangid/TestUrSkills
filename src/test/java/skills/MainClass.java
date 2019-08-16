package test.java.skills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class MainClass {
	public static void main(String[] args) {
		int i = 'a';
		System.out.println("int value of a " +i);

		System.out.println("Integer value of a " +new Integer('a'));

		char c='1';  
		int a=Integer.parseInt(String.valueOf(c));  
		System.out.println(a);  


		/******************************************/
		List arr = new ArrayList(); 
		arr.add(3);
		arr.add('a');
		arr.add("aarti");
		arr.add(22);
		arr.add("jangid");

		Vector v = new Vector();

		v.addAll(arr);

		System.out.println(v);

		v.clear();



		/*********************************************/

		Set setOfRawType = new HashSet<String>();
		setOfRawType = new HashSet<Integer>();

		/*********************************************/

		Set<String> set = new HashSet<String>();
		String str = "aarti";
		set.add(str);

		Class<List> str1 = List.class; //legal

		System.out.println(str1);

		/*********************************************/

		Object source = "Test";
		System.out.println(identical(source));

		/*********************************************/

		String books = String.join("|", "Effective Java", "Head First","Design Principles");

		System.out.println("Books: " + books);


		/*********************************************/
		String[] payCompanies = {"Amazon Pay", "Airtel Pay", "PayPal"};

		List<String> payCompaniesList = Arrays.asList(payCompanies);

		System.out.println(Arrays.asList(payCompanies));
		System.out.println(payCompaniesList);

		System.out.println(String.join(",", payCompaniesList));

		System.out.println(String.join(",", payCompanies));

		/*********************************************/
		List<String> stringList = new ArrayList<String>(Arrays.asList(payCompanies));
		stringList.forEach(s->System.out.println(s));

		/*********************************************/

	}

	public static <T> T identical(T source){
		return source;
	}
}
