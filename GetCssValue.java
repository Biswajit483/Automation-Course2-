package Biswajit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		String fontsize = loginButton.getCssValue("font-size");
	System.out.println("fontsize="+fontsize);
	String boldness = loginButton.getCssValue("font-width");
	System.out.println("boldness:"+boldness);
	String fonttype = loginButton.getCssValue("font-family");
	System.out.println("fonttype:"+fonttype);
	
	
	}

}
