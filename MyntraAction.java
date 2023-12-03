package PracticeSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraAction {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/shop/men");
	List <WebElement> allnavoption = driver.findElements(By.xpath("//div[@class='desktop-navLink']"));
	for (WebElement option : allnavoption) {
		Actions actions=new Actions(driver);
		actions.moveToElement(option).pause(2000).perform();
		
		
	}
	driver.manage().window().minimize();
	driver.quit();
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
}
