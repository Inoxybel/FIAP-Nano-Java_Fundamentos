package Exceptions;

public class TryCatch {

	public static void main(String[] args) {

		try {
			
			int x = 10 / 0;
			
		}catch (Exception e) {		
			e.printStackTrace();			
		}
		
	}

}
