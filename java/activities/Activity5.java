package activities;

abstract class Book{
	String title;
	
	abstract void setTitle(String s);
	String getTitle() {
		return title;
	}
}

class MyBook extends Book {

	@Override
	public void setTitle(String s) {
		// TODO Auto-generated method stub
		title = s;
	}
	
}

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "Hover Car Racer";
		Book newNovel = new MyBook();
		newNovel.setTitle(title);
		System.out.println("The Title is - " + newNovel.getTitle());
	}

}
