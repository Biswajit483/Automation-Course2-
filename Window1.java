package Biswajit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Window1 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.cricbuzz.com/");
	String actualurl=driver.getCurrentUrl();
	System.out.println("actualurl="+actualurl);
	
	}

}
