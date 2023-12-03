package Biswajit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.freejobalert.com/");
	String actualloginpageurl=driver.getCurrentUrl();
	System.out.println("actualloginpageurl="+actualloginpageurl);
	//driver.close();
}
}
