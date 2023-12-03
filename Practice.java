package Biswajit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//WebElement unm=driver.findElement(By.id("email"));
	//unm.sendKeys("sahoobiswajit158@gmail.com");
	//driver.findElement(By.name("pass")).sendKeys("bisu");
	//driver.findElement(By.id("royal_login_button")).click();
	
	//driver.findElement(By.linkText("privacy policy"));
	//driver.findElement(By.partialLinkText("data")).click();
	//input[@id='email']
	//input[@id='pass']
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("welcome");
	driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Back");
	
	}


}
