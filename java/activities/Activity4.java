package activities;

import java.util.Arrays;

public class Activity4 {
	
	static void ascendingOrder(int array[]) {
		int size = array.length, i;
		for(i = 1; i < size; i++) {
			int key = array[i];
			int j = i - 1;
			System.out.println("key value - " + key + ", j value - "+ j);
			while(j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				--j;
			}
			array[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,1,6,35, 25,28,33};
		System.out.println("Array before sorting - " + Arrays.toString(a));
		ascendingOrder(a);
		System.out.println("Array after sorting - " + Arrays.toString(a));
	}

}
