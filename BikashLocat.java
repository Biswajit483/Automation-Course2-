package Biswajit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BikashLocat {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
      Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Redmi 9A (SeaBlue, 32 GB)']/../../..//div[@class='_30jeq3 _16Jk6d']")).click();
	//  driver.findElement(By.xpath("//a[text()='Login']")).click();
      driver.findElement(By.xpath("//p[text()='Java']/..//a[contains(@href,'https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.9.0/selenium-java-4.9.0.zip')]")).click();	
	
	
	}

}
