package Biswajit;

import java.awt.Dimension;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Dimension targetseleniumsize=new Dimension(200,800);
		driver.manage().window().setSize(targetseleniumsize);
		driver.get("https://www.selenium.dev/");
		driver.switchTo().newWindow(WindowType.WINDOW);
        Dimension targetmyntrasize=new Dimension(800,300);
	    driver.manage().window().setSize(targetmyntrasize);
	    driver.get("https://www.myntra.com/");
	    Set<String>allwindowsid=driver.getWindowHandles();
	   for (String wid: allwindowsid) {
		   String windowsUrl=driver.switchTo().window(wid).getCurrentUrl();
		   if(windowsUrl.equals("https://www.facebook.com/")) {
			   driver.get("https://www.selenium.dev/");
			   Thread.sleep(2000);
			  Dimension seleniumsize=new Dimension(200,800);
			   driver.manage().window().setSize(seleniumsize);
			   Thread.sleep(2000);
		   }
		   else if(windowsUrl.equals("https://www.selenium.dev/"));
		   
			driver.get("https://www.instagram.com/accounts/login/");
			Thread.sleep(2000);
			driver.manage().window().minimize();
			Thread.sleep(2000);
			driver.manage().window().fullscreen();
			Thread.sleep(2000);
			//else if(windowsUrl.equals("https://www.myntra.com/"));
		   
			driver.get("https://www.cricbuzz.com/");
			Thread.sleep(2000);
			driver.close();
			Thread.sleep(2000);
			
			
		   }
	}
		
	}

