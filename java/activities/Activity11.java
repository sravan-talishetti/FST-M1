package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap();
		hm.put(1, "White");
		hm.put(2, "Yellow");
		hm.put(3, "Red");
		hm.put(4, "Green");
		hm.put(5, "Black");
		System.out.println("List of all colors in Hash-map - "+hm);
		System.out.println("Remove black from the list - "+hm.remove(5));
		System.out.println("After removing a color - "+hm);
		System.out.println("Checking whether green color is present - "+hm.containsValue("Green"));
		System.out.println("Size of the hash-map - "+hm.size());
	}

}
