package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screen {
	public static void main (String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			//TakesScreenshot ts = (TakesScreenshot)driver;
			WebElement ts = driver.findElement(By.xpath("//div[@class='o3j99 qarstb']"));
			File src= ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\tanma\\OneDrive\\Desktop\\New folder\\Google.jpg");
			Files.copy(src, dest);
	}

}
