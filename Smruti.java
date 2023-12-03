package Biswajit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smruti {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=redmi%209a&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		//driver.findElement(By.xpath("//div[text()='Redmi 9A (Sea Blue, 32 GB)']")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Redmi 9A (Sea Blue, 32 GB)']/../../..//div[@class='_24_Dny']"));
	
	
	
	}

}
