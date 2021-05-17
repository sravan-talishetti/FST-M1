package activities;

class CustomException extends Exception {
	private String message = null;
	
	public CustomException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}

public class Activity8 {
	
	public static void main(String[] args) {
		try {
			Activity8.exceptionTest("print on console");
			Activity8.exceptionTest(null);
			Activity8.exceptionTest("wont excute");
		}catch(CustomException ce) {
			System.out.println("From catch block - " + ce.getMessage());
		}
	}
	public static void exceptionTest(String str) throws CustomException {
		if(str == null) {
			throw new CustomException("String value is null");
		} else {
			System.out.println(str);
		}
		
	}
}
