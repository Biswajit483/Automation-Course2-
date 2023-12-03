package Biswajit;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PerformAnAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		List<WebElement> allnavOptions = driver.findElements(By.xpath("//div[@class='desktop-navContent']"));
		for (WebElement webElement : allnavOptions) {
			Actions actions=new Actions(driver);
			actions.moveToElement(webElement).pause(1000).perform();
			
		}
		Thread.sleep(4000);
		driver.manage().window().minimize();
//		driver.quit();
	
	}
	}


