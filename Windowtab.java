package Biswajit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowtab {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	//driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.switchTo().newWindow(WindowType.TAB);
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.quit();
}
}
