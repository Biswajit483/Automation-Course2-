package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup/");
		WebElement submitbutton = driver.findElement(By.name("websubmit"));
		if(submitbutton.isEnabled()) {
			System.out.println("boolean true");
		}
		else {
			System.out.println("boolean false");

		}
	
	
	
	}

}
