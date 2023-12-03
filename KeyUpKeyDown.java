package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKeyDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		//WebElement emailtextfield = driver.findElement(By.id("email"));
		WebElement emailtextfield=driver.switchTo().activeElement();
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys( emailtextfield,"abcd").build().perform();
		
		
	}
	

}
