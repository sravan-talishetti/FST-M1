package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		hs.add("Developer");
		hs.add("Tester");
		hs.add("Architect");
		hs.add("Manager");
		hs.add("DevOps");
		hs.add("Deployment Team");
		System.out.println("List of all the objects");
		for(String s:hs) {
			System.out.println(s);
		}
		System.out.println("size of the objects - "+hs.size());
		System.out.println("Remove Architect from the Team - "+hs.remove("Architect"));
		System.out.println("Remove an object that is not present - "+hs.remove("Functional Lead"));
		System.out.println("Checking for Tester in the Team - "+hs.contains("Tester"));
		System.out.println("List of all the objects after all the functionalities - ");
		for(String s:hs) {
			System.out.println(s);
		}
	}
}
