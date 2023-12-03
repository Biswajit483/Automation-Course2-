package Biswajit;
import java.time.Duration;

import http://org.openqa.selenium.By ;

import org.openqa.selenium.By;
//org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingForm {
	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		// -- //form/parent::div[@id='loginFormDiv']
		WebElement parentForm = driver.findElement(By.xpath("//div[@id='loginFormDiv']/child::form"));
		WebElement username = parentForm.findElement(By.id("username"));
		username.clear();
		Thread.sleep(4000);
		username.sendKeys("admin");
		WebElement password = parentForm.findElement(By.id("password"));
		password.clear();
		Thread.sleep(4000);
		password.sendKeys("Test@123");
		WebElement submitButton = parentForm.findElement(By.xpath("//button[text()='Sign in']"));
		submitButton.submit();
		driver.manage().window().minimize();
		driver.quit();
		}
		}

