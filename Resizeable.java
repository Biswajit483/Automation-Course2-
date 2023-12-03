package Biswajit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Resizeable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		WebElement resizablebyright = driver.findElement(By.cssSelector("div[class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions actions=new Actions(driver);
		//actions.moveToElement(resizablebyright).clickAndHold().moveByOffset(150, 0).perform();
		actions.clickAndHold(resizablebyright).moveByOffset(250, 0).perform();
		
		//actions.clickAndHold(resizablebyright).moveByOffset(200, 0).release().perform();
		
	
	}

}
