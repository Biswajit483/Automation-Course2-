package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GetText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement password =driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		//WebElement password = driver.findElement(By.id("pass"));
		String subtagtext = password.getText();
		System.out.println("subtagtext="+subtagtext );
		String tagname = password.getTagName();
		System.out.println("tagname:"+tagname);
		String att = password.getAttribute("href");
		System.out.println("att="+att);
		String ft = password .getCssValue("font-size");
		System.out.println("ft:"+ft);
		String ft1 = password .getCssValue("font-family");
		System.out.println("ft1:"+ft1);
		String ft2 = password .getCssValue("font-weight");
		System.out.println("ft2:"+ft2);
		String ft3 = password .getCssValue("background-color");
		System.out.println("ft3:"+ft3);
		String hexacolor = Color.fromString(ft3).asHex();
		System.out.println("hexacolor="+hexacolor);
		Point loc = password.getLocation();
		System.out.println("loc="+loc);
		int startx = loc.getX();
		System.out.println("startx="+startx);
		int starty = loc .getY();
		System.out.println(" starty="+ starty);
		
		driver.close();
}	
	}


