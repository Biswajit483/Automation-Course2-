package Biswajit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bisw1234 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.name("pwd"));
		 Dimension usernameDimension = username.getSize();
		System.out.println("usernameDimension:"+usernameDimension);
		int usernamewidth = usernameDimension.getWidth();
		System.out.println("usernamewidth:"+usernamewidth);
		int usernameheight = usernameDimension.getHeight();
		System.out.println("usernameheight:"+usernameheight);
		Dimension pwddimension = pwd.getSize();
		System.out.println("pwddimension:"+pwddimension);
		int pwdheight = pwddimension.getHeight();
		System.out.println("pwdheight:"+pwdheight);
		int pwdwidth = pwddimension.getWidth();
		System.out.println("pwdwidth:"+pwdwidth);
		driver.manage().window().minimize();
		driver.quit();
	}

}
