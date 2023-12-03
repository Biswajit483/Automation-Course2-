package Biswajit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Smruti1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   driver.get("https://www.facebook.com/");
	   driver.findElement(By.id("email")).sendKeys("sahoobiswajit158@gmail.com");
	   driver.findElement(By.name("pass")).sendKeys("1234");
	   driver.findElement(By.name("login")).click();
		
	}

}
