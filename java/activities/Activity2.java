package activities;

import java.util.Arrays;

public class Activity2 {
	
	public static void main(String args[]) {
		int a[] = {10,77,10,54,-11,10};
		System.out.println("Original Array -"+Arrays.toString(a));
		int search = 10;
		int sum = 30;
		
		System.out.println("Results - " + result(a, search, sum));
	}
	public static boolean result(int numbers[], int search, int sum) {
		int temp = 0;
		for(int n : numbers) {
			if(n == search) {
				temp += search;
				if(temp == sum) {
					System.out.println("Sum of numbers -"+ temp);
					break;
				}
			}
		}
		return temp == sum;
	}
}
