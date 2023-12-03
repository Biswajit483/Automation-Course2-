package Biswajit;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Getwindowhandels {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.cricbuzz.com/");
	String actualurl=driver.getCurrentUrl();
	Thread.sleep(2000);
	Set<String>allwindosid=driver.getWindowHandles();
	System.out.println("allwindosid="+allwindosid);
	driver.quit();
	
	}

}
