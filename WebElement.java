package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
	    org.openqa.selenium.WebElement username = driver.findElement(By.id("username"));
	   username.sendKeys("admine");
	   Thread.sleep(2000);
	   username.clear();
	   username.sendKeys("admin");
	org.openqa.selenium.WebElement pwd = driver.findElement(By.name("pwd"));
	pwd .sendKeys("manager");
	Thread.sleep(2000);
	org.openqa.selenium.WebElement loginbutton = driver.findElement(By.id("loginButton"));
	loginbutton.click();
	driver.manage().window().minimize();
	//driver.quit();
	
	}

}

