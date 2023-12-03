package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowPopups {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.nationalgeographic.com/animals");
	driver.switchTo().newWindow(WindowType.WINDOW);
	//driver.manage().window().setSize(new Dimension(100, 100));
	driver.manage().window().setSize(new Dimension(100,100));
	Set<String>allwindowsid=driver.getWindowHandles();
	Thread.sleep(2000);
	for (String wid : allwindowsid) {
		String windowTitle=driver.switchTo().window(wid).getTitle();
		if(windowTitle.equals("Animals")) {
			
		}else {
			driver.close();
		}
		
	}
}
}
