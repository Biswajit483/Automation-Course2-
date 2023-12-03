package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805955%7Cb%7Cfb%20sign%20up%7C&placement=&creative=550525805955&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9062009%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIlqussKCv_wIV1RRyCh0M7gyXEAAYASAAEgLM7_D_BwEhttps://demo.actitime.com/login.do");
		WebElement loginButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		loginButton.click();
	if(loginButton.isSelected()) {
		System.out.println("boolean true");
	}
	else {
		System.out.println("boolean false");
	}
	
	
	
	}

}
