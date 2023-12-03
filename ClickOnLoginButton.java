package Biswajit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickOnLoginButton {

	public static void main(String[] args){
		WebDriver driver= new ChromeDriver();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		WebElement loginButton=driver.findElement(By.name("login"));
		
		loginButton.click();
		
	
		
				
			
				
		
	}

}
