package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> itemList = new ArrayList();
		itemList.add("Sravan");
		itemList.add("Sai");
		itemList.add("Bob");
		itemList.add("John");
		itemList.add("Marley");
		System.out.println("Print all objects - ");
		for (String s:itemList) {
		System.out.println(s);
		}
		
		System.out.println("Third name in the list - "+itemList.get(2));
		System.out.println("Name that contains following Sravan - "+itemList.contains("Sravan"));
		System.out.println("size of the items in my names list - "+itemList.size());
		System.out.println("Remove Sai from the list - "+itemList.remove("Sai"));
		
		System.out.println("After removing sai from the list - ");
		for (String s:itemList) {
		System.out.println(s);
		}
	}

}
