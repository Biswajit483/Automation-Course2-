package ElementScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenShot {
	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com");
	WebElement loginbutton = driver.findElement(By.name("login"));
	File srcFile = loginbutton.getScreenshotAs(OutputType.FILE);
	File destFile=new File("./errorshots/"+LocalDateTime.now().toString());
	FileUtils.copyFile(srcFile, destFile);
	driver.manage().window().minimize();
	driver.close();
	
	}

}
