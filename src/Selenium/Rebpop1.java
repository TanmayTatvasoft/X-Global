package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rebpop1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions c= new ChromeOptions();
		c.addArguments("-disable-notifications");
		c.addArguments("start-maximized");
			WebDriver driver=new ChromeDriver(c);
			driver.get("https://www.hdfcbank.com/");
	

	}

}
