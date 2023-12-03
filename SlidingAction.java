package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidingAction {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/child::span"));
		Actions actions=new Actions(driver);
		actions.moveToElement(slider).clickAndHold(slider).moveByOffset(100, 0).release(slider).build().perform();
		//actions.dragAndDropBy(slider,100, 0).perform();
		
		
}
}
