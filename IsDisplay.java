package Biswajit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9062010%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwo7iiBhAEEiwAsIxQETWiWXUWwPVMrYqfPZWZBK59BB5lJh2q7b_lZvy0IaowktHqCzF_jRoCfHYQAvD_BwE");
		List<WebElement> alldropdown =driver.findElements(By.tagName("select"));
	System.out.println(alldropdown.size());
	for (WebElement dropdown:alldropdown ) {
		if(dropdown.isDisplayed()){
			System.out.println("Boolean true");
		}
		else
		{
			System.out.println("Boolean false");
		}
		
	}
//	driver.quit();
	
	}

}
