package Biswajit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		List<WebElement> allnavigationoptionmenuoption = driver.findElements(By.xpath("//div[@class='desktop-navLink']/a"));
		for (WebElement options : allnavigationoptionmenuoption) {
			String optionName = options.getText();
			System.out.println(optionName);
	
			}
		driver.quit();
	}

}
