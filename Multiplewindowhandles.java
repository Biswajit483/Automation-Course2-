package Biswajit;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.devtools.v109.browser.model.WindowID;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiplewindowhandles {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.cricbuzz.com/");
String url=driver.getCurrentUrl();
Thread.sleep(2000);
Set<String>allwindosid=driver.getWindowHandles();
System.out.println("allwindosid");
for (String WindowID: allwindosid) {
	String actualUrl=driver.switchTo().window(WindowID).getCurrentUrl();
	if (actualUrl.equals("https://www.cricbuzz.com/"))
	{
		System.out.println(driver.getTitle());
		
	} else if (actualUrl.equals("https://www.facebook.com/"));
	{
//driver.close();
	}

}
}
}
