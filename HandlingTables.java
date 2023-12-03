package Biswajit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingTables {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://irctc.com/contact.html");
	WebElement irctcOption = driver.findElement(By.xpath("//a[contains(.,' IRCTC ')]"));
	irctcOption.click();
	//Search the <table> inside HTMl docs.
	WebElement parentTable = driver.findElement(By.tagName("table"));
	//search the table content only inside the table.
	WebElement buddhistTrainRow = parentTable.findElement(By.xpath("//td[text()='Buddhist train']/parent::tr"));
//		System.out.println(buddhistTrainRow.getText());
	List<WebElement> buddhistCells = buddhistTrainRow.findElements(By.tagName("td"));
	for (WebElement cell : buddhistCells) {
	if (cell.getText().contains("Visit Website")) {
	String buddhistTrainUrl = cell.findElement(By.tagName("a")).getAttribute("href");
	System.out.println(buddhistTrainUrl);
	}else {
	System.out.println(cell.getText());	
	}
	}
	driver.manage().window().minimize();
	driver.quit();
	}
	}