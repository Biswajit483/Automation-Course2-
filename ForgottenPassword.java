package Biswajit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgottenPassword {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
//		WebElement linktext=driver.findElement(By.linkText("Forgotten password?"));
//		Thread.sleep(2000);
		
//		linktext.click();
		driver.get("https://shop-global.malaicha.com/");
		driver.manage().window().maximize();
	   WebElement loginregister=driver.findElement(By.id("my-acc-btn"));
	   loginregister.click();
	   Thread.sleep(3000);
	   WebElement emailid=driver.findElement(By.name("username"));
	   emailid.sendKeys("sahoobiswajit158@gmail.com");
	   WebElement password=driver.findElement(By.name("pin"));
	   password.sendKeys("i live u");
	   WebElement login=driver.findElement(By.cssSelector("button[type='submit']"));
	   Thread.sleep(3000);
	   login.click();
	   //driver.close();
	   
	}

}
