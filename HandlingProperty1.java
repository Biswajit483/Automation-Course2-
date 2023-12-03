package HandlingProperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingProperty1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
	     FileInputStream fis=new FileInputStream("./Data/propertyfile1.txt");
	        Properties p=new Properties();
	     p.load(fis);
	String username = p.getProperty("username");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
	System.out.println(username);
	Thread.sleep(2000);
	String pwd = p.getProperty("password");
	System.out.println(pwd);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	String email = p.getProperty("email");
	System.out.println(email);
	String url = p.getProperty("url");
	System.out.println(url);
   driver.close();
	}

}
