package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RebPop {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@name='submit']")).click();
   Alert alt = driver.switchTo().alert();
   alt.accept();
	}

}
