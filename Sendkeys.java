package Biswajit;

import javax.swing.text.TabExpander;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
Thread.sleep(2000);
WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
	Thread.sleep(2000);
//	WebElement password=driver.findElement(By.name("pwd"));
//	password.sendKeys("manager");
//	password.clear();
	username.sendKeys(Keys.TAB+"manager" +Keys.TAB+Keys.TAB+Keys.ENTER);
	
//	Thread.sleep(2000);
//	WebElement login=driver.findElement(By.id("loginButton"));
//	login.click();
//	Thread.sleep(2000);
//	driver.manage().window().minimize();
//	driver.quit();

	
	}			

}
