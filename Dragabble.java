package Biswajit;

import java.awt.Desktop.Action;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dragabble {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
     driver.get("https://jqueryui.com/droppable/");
     driver.switchTo().frame(0);
     WebElement draggableobj = driver.findElement(By.id("draggable"));
     Actions actions=new Actions(driver);
    actions.dragAndDropBy(draggableobj, 100, 100).perform();
	}
}

