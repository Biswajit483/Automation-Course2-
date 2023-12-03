package PracticeSelenium;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardSimulation {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("admin");
	Thread.sleep(2000);
	username.sendKeys(Keys.TAB+"manager"+Keys.TAB+Keys.TAB+Keys.ENTER);
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	loginButton.click();



}
}
