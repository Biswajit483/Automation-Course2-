package Biswajit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetPageSource {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		// System.out.println(driver.getPageSource());
		if (driver.getPageSource()
		.contains("Vtiger recognized in Gartner Peer Insights Customer Choice for Sales Force Autom...")) {
		System.out.println("Boolean True");
		} else {
		System.out.println("Boolean False");
		}
		driver.manage().window().minimize();
		driver.quit();
		}
		}


