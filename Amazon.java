package Biswajit;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://www.amazon.in/s?k=oneplus+mobiles&crid=26V3CU2Z8CM3X&sprefix=oneplus+mobi%2Caps%2C227&ref=nb_sb_ss_ts-doa-p_2_12");
	List<WebElement> product=d.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	List<WebElement> price=d.findElements(By.xpath("//span[@class='a-price-whole']"));
	for(int i=0;i<product.size();i++) {
		String p=product.get(i).getText();
		String p1=price.get(i).getText();
		System.out.println(p+"===>"+p1);
	
	}
	d.close();
	}

}
