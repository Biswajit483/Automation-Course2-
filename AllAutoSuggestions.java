package Biswajit;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAutoSuggestions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	WebElement searchtextfield = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	searchtextfield .sendKeys("tshirt");
	List<WebElement> allautosuggestion = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
	 System.out.println( allautosuggestion .size());
	
	for (WebElement suggestion : allautosuggestion) {
		String suggestionName = suggestion.getText();
		System.out.println("suggestionName="+suggestionName);
		
	
	
	if(suggestion.getText().equals("shirtBohemian")) {
		suggestion.click();
		break;
	}
	}
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(10000);
	driver.quit();


}
}
