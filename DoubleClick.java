package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://webdriveruniversity.com/index.html");
			WebElement ele = driver.findElement(By.id("button-clicks"));
			Actions actions=new Actions(driver);
			actions.scrollByAmount(0, 200).pause(2000).doubleClick(ele).perform();
			
			
			
			
			
			
	}

}
