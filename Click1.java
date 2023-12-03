package Biswajit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	WebElement mobileno=driver.findElement(By.id("email"));
	mobileno.click();
	Thread.sleep(2000);
	WebElement login=driver.findElement(By.name("login"));
	login.click();
	driver.manage().window().minimize();
	driver.quit();
	
	
	}

}
