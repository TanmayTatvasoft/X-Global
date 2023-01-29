package Selenium.Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 20000",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	Set<String> allwindows = driver.getWindowHandles();
	ArrayList<String> ar=new ArrayList<String>(allwindows);
	String Childwindow = ar.get(0);
			System.out.println(Childwindow);
	String Parent = ar.get(1);
			System.out.println(Parent);
	
	
}
	

}
