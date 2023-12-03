package Biswajit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Porn {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=porn+62&rlz=1C1CHBF_enIN1007IN1007&oq=porn&aqs=chrome.0.69i59j69i57j46i10i512j0i20i131i263i433i512j0i10i512j69i60.2333j0j7&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		driver.findElement(By.xpath("//h1[text()='free sex hd adult stepdaughter pornvids sex']")).click();
		//driver.findElement(By.className("vjs-icon-placeholder")).click();
		
	}

}
