package ElementScreenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NatGeoWebScreenShot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.nationalgeographic.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File filescreenshot = ts.getScreenshotAs(OutputType.FILE);
		String screenshotaddres = filescreenshot .getAbsolutePath();
		System.out.println(screenshotaddres );
		driver.manage().window().minimize();
		driver.quit();
		Thread.sleep(50000);
	}

}
