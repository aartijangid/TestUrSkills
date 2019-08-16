package test.java.skills;

import java.util.Arrays;

public class ZigZagArray {
	public static void main(String[] args) {
		
		//O(n) approach
		int[] arr = new int[] {4, 3, 7, 8, 6, 2, 1};
		
		//flag to keep track of swapping order, i.e either increasing or decrasing order logic
		Boolean isGreaterOrder = true;
		
		//Swap elements in in alternate order
		for(int i=0;i<arr.length-1;i++) {
			//if it is increasing order
			if(isGreaterOrder) {
				if(arr[i]<arr[i+1]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				isGreaterOrder = !isGreaterOrder;
			}
			else {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				isGreaterOrder = !isGreaterOrder;
			}
		}
		
		StringBuilder str = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			str.append(arr[i]).append(' ');
		}
		System.out.print(str);
	}
}
