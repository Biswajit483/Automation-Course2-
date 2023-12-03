package PracticeSelenium;

import java.awt.Dimension;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Dimension targetSeleniumsize = new Dimension(200,800);
	driver.manage().window().setSize(targetSeleniumsize);
	driver.get("https://www.selenium.dev/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	Dimension targetMyntraSize = new Dimension(800,300);
	driver.manage().window().setSize(targetMyntraSize);
	driver.get("https://www.myntra.com/");
	Set<String> allwindowsId = driver.getWindowHandles();
	for (String wid: allwindowsId) {
	     driver.switchTo().window(wid).getCurrentUrl();
	}
	
	
	
	
	}

}
