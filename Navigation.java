package Biswajit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	driver.findElement(By.linkText("Images")).click();
	driver.navigate().forward();
	Thread.sleep(2000);
	System.out.println("forward done");
	driver.navigate().back();
	System.out.println("backward done");
	Thread.sleep(3000);
	driver.navigate().refresh();
	System.out.println("refresh done");
	
		
		
	}

}
