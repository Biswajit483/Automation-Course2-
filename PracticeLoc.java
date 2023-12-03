package Biswajit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLoc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://demo.actitime.com/login.do");
//		//WebElement acti=driver.findElement(By.id("username"));
//		WebElement acti1=driver.findElement(By.name("pwd"));
//	//acti.sendKeys("Bisu1234");
//	acti1.click();
//		driver.get("https://www.nbtindia.gov.in/");
//		WebElement search=driver.findElement(By.name("search"));
//		search.click();
//		driver.get("https://www.cowin.gov.in/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Search']")).click();
//		driver.get("https://afmc.nic.in/");
//		driver.findElement(By.linkText("Departments")).click();
//        driver.get("https://bn-in.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9062009%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwrpOiBhBVEiwA_473dKJCMTCOpPAXqz3XVo99jmLn81dz4YDlZk-TWRzlO42beuwhXvnn5BoCAdwQAvD_BwE");
//		driver.findElement(By.partialLinkText("English (UK)")).click();
//	   driver.get("https://www.naukri.com/");
//	  // Thread.sleep(2000);
//	   driver.findElement(By.id("login_Layer")).click();
//	  // Thread.sleep(2000);
//	   driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("ajit");
	driver.get("https://shop.malaicha.com/login");
	driver.findElement(By.xpath("//div[@id='app']")).click();
	
	
	driver.findElement(By.xpath("("
			+ "//button[text()='Register'])[1]")).click();
	}

}
