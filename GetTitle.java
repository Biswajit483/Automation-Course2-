package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTitle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		String actualtitle = driver.getTitle();
		System.out.println("actualtitle="+actualtitle);
		String actualurl = driver.getCurrentUrl();
		System.out.println("actualurl="+actualurl);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.close();
		//driver.quit();
		
	}

}
