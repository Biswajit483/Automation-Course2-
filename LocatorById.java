package Biswajit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.IDefaultProvider;

public class LocatorById {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement usernametextfield= driver.findElement(By.id("username"));
		usernametextfield.sendKeys("BISWAJIT1234");
		Thread.sleep(2000);
		WebElement passwordtextfield=driver.findElement(By.name("pwd"));
		passwordtextfield.sendKeys("love you");
		Thread.sleep(3000);
		WebElement loginbutton=driver.findElement(By.id("loginButton"));
		loginbutton.click();
		//driver.manage().window().minimize();
		//driver.quit();
	
	}

}
