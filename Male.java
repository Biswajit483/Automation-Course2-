package Biswajit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Male {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9062009%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwo7iiBhAEEiwAsIxQEdlRWopi5MCX9K_F-waSRHDpelV6XsWAlqLIn_gVLFPDylCtG5x6TBoCh5cQAvD_BwE");
//		WebElement male=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
//		male.click();
	driver.get("https://www.facebook.com/");
	WebElement login = driver.findElement(By.name("login"));
	login.sendKeys(null);
	login.sendKeys(Keys.ENTER);
	}

}
