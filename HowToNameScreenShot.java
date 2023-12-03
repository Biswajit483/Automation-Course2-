package ElementScreenshot;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HowToNameScreenShot {
	public static void main(String[] args) {
//		LocalDateTime methodreturntype = LocalDateTime.now();
//	System.out.println(methodreturntype );	
//	
//	String updatetostringtype = methodreturntype .toString();
//		System.out.println(updatetostringtype);
//		String updatestring = updatetostringtype.replace(':', '_');
//		System.out.println(updatestring);
		
		String timestamp = LocalDateTime.now().toString().replace(':','_');
		System.out.println(timestamp );
	}	
	}


