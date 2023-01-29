package Selenium.Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifeecation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
		c.addArguments("disable-notifications");
		//c.addArguments("-window.maximize");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
	}

}
