package Popups;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsCalculatescrollingHeight {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.Facebook.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		long scrollHeight = (long)jse.executeScript("returndocument.body.scrollHeight");
		System.out.println("scrollHeight="+scrollHeight);
		long scrollwidth=(long)jse.executeScript("returndocument.body.scrollwidth");
		System.out.println("scrollwidth="+scrollwidth);
	}

}
