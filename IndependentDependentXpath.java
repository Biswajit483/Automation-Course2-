package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependentXpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=one+plus+mobile&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_ps&as-pos=1&as-type=HISTORY&suggestionId=one+plus+mobile%7CMobiles&requestId=1832b3e6-62a8-47f2-9530-235a24700291");
	   driver.findElement(By.xpath("(//div[(text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 128 GB)')])[1]/../..//div[@class='_30jeq3 _1_WHN1']")).click();
	
	
	
	}

}
