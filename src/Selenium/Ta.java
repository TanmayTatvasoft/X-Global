package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ta {
 public static void main(String[] args) throws Throwable {
	 System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.actitime.com/login.do");
	 driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
}

}
