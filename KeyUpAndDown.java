package Biswajit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyUpAndDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		//WebElement emailtextfield = driver.findElement(By.id("email"));
		WebElement emailtextfield =driver.switchTo().activeElement();
		Actions actions=new Actions(driver);
//		actions.keyDown(Keys.SHIFT).sendKeys(emailtextfield,"abcd" ).build().perform();
//		actions.keyDown(Keys.CONTROL).sendKeys(emailtextfield,"a").build().perform();
//		actions.keyDown(Keys.CONTROL).sendKeys(emailtextfield ,"x").build().perform();
		actions.keyDown(Keys.SHIFT).sendKeys(emailtextfield,"a").keyUp(Keys.SHIFT).sendKeys(emailtextfield,"b")
		.keyDown(Keys.SHIFT).sendKeys(emailtextfield,"c").keyUp(Keys.SHIFT).sendKeys(emailtextfield,"d")
        .build().perform();
	
		
	}

}
