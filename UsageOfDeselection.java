package Biswajit;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfDeselection {
	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("C:\\Users\\sahoo\\Desktop\\Java Pratice\\Deselection.html");
	    Select select=new Select(driver.findElement(By.id("cars")));
	    select.selectByIndex(0);
	    select .selectByIndex(1);
	    select .selectByIndex(2);
	    select .selectByIndex(3);
	    select .selectByIndex(4);
	    select .selectByIndex(5);
	    if(select.isMultiple()) {
	    	System.out.println("Boolean True- multiselect");
	    }else {
	    	System.out.println("Boolean false- Singleselect");
	    }
	    Thread.sleep(2000);
	    //select.deselectAll();
	    //select.deselectByVisibleText("Hyundai i20");
	    //select.deselectByValue("4");
	    select.deselectByIndex(0);
	   
	}

}
