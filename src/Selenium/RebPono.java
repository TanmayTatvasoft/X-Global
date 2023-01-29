package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RebPono {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
		c.addArguments("disable-notifications");
		c.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(c);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
	}

}
