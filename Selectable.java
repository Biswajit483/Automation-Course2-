package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/selectable/#serialize");
	driver.switchTo().frame(0);
		WebElement one = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement seven = driver.findElement(By.xpath("//li[text()='Item 6']"));
		Actions actions=new Actions(driver);
		actions.scrollByAmount(0, 300).pause(3000).clickAndHold(one).moveToElement(seven).perform();
		
	
	}

}
