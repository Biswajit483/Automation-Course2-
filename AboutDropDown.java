package Biswajit;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import http://org.openqa.selenium.By ;

import org.openqa.selenium.By;
//org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AboutDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement monthDropDown = driver.findElement(By.id("month"));
		//create the Object for Slelect Class
		Select monthSelect = new Select(monthDropDown);
		//check the type of dropdown
		if (monthSelect.isMultiple()) {
		System.out.println("Boolean True - Multi-Select");
		}else {
		System.out.println("Boolean False - Single-Select.");
		}
		//get the default selected option in the month dro pdown
		WebElement selectedOption = monthSelect.getFirstSelectedOption();
		System.out.println(selectedOption.getText());
		//capture all the options present in the month drop down
		List<WebElement> allMonthOptions = monthSelect.getOptions();
		for (WebElement monthOption : allMonthOptions) {
		System.out.println(monthOption.getText());
		}
		driver.manage().window().minimize();
		driver.quit();
		}
		}

}
