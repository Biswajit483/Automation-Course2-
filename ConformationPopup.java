package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConformationPopup {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
		driver.get("https://www.ajio.com/");
		}
		catch(WebDriverException e) {
			String alertmessage=driver.switchTo().alert().getText();
			System.out.println("alertmessage="+alertmessage);
			driver.switchTo().alert().accept();
			
		}
		
		
	}

}
