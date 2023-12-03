package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadComplex {
	public static void main(String[] args) throws InterruptedException, AWTException {
		String addresstoconsiderd = "\"C:\\Users\\sahoo\\Desktop\\Java Pratice\\file\\BISWAJIT SAHOO.cv2022..pdf\"";
		StringSelection filecontent = new StringSelection(addresstoconsiderd);
		Toolkit initializedtollkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = initializedtollkit.getSystemClipboard();
		clipboard.setContents(filecontent, null);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.foundit.in/seeker/registration");
		WebElement FileuploadButton = driver.findElement(By.xpath("//div[@class='contentTitle']"));
		FileuploadButton.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
}
