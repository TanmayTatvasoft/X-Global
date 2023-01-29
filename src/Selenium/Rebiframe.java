package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rebiframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	    driver.manage().window().maximize();
	    driver.switchTo().frame("packageListFrame");
	    String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome']")).getText();
	    System.out.println(text);
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("packageFrame");
	    String text1 = driver.findElement(By.xpath("//a[text()='AddHasFullPageScreenshot']")).getText();
	    System.out.println(text1);
	    
	    
	
	}

}
