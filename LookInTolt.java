package Biswajit;

import java.awt.Desktop.Action;
import java.time.Duration;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LookInTolt {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/");
		WebElement loginbutton = driver.findElement(By.name("login"));
		Actions actions=new Actions(driver);
		//actions.click(loginButton).perform();
	    actions.moveToElement(loginbutton)
.click().perform();
	    WebElement button = driver.findElement(By.id("loginButton"));
	    actions.pause(2000).contextClick(button).perform();
		 actions.moveToElement(button).contextClick().perform();

	}

}
