package Biswajit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new EdgeDriver();
	//
	driver.switchTo().newWindow(WindowType.WINDOW);
    Thread.sleep(1000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	Thread.sleep(1000);
	}

}
