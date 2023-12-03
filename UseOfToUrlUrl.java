package Biswajit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfToUrlUrl {
	 public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.dassault-aviation.com/en/");
		    Thread.sleep(4000);
		    URL mainUrl=new Url("https://www.dassault-aviation.com/en/group/");
		   URL groupsPageUrl=new URL(mainUrl,"group/");
		   driver.navigate().to(groupsPageUrl);
		   Thread.sleep(4000);
		   URL defencePageUrl=new URL(mainUrl,"defence/");
		   driver.navigate().to(defencePageUrl);
		   URL civilPageUrl=new URL(mainUrl,"civil/");
		   driver.navigate().to(civilPageUrl);
		   Thread.sleep(4000);
		   URL spacePageUrl=new URL(mainUrl,"space/");
		   driver.navigate().to(spacePageUrl);
		   Thread.sleep(4000);
		   URL passionPageUrl=new URL(mainUrl,"passion/");
		   driver.navigate().to(passionPageUrl);
		   Thread.sleep(4000);
		   driver.manage().window().minimize();
		   driver.quit();
		 
		   }
		}


