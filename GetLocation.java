package Biswajit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement username = driver.findElement(By.id("username"));
	WebElement pwd = driver.findElement(By.name("pwd"));
	Point usenamecoordinates = username.getLocation();
System.out.println("usenamecoordinates:"+usenamecoordinates);
int usernamestartX = usenamecoordinates.getX();
System.out.println("usernamestartX:"+usernamestartX);
int usernamestartY = usenamecoordinates.getY();
System.out.println("usernamestartY:+usernamestartY");
driver.manage().window().minimize();
driver.quit();

}
}
