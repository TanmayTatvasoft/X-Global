package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenpar {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement par = driver.findElement(By.cssSelector("img[class='lnXdpd']"));
	File src=par.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\tanma\\OneDrive\\Desktop\\Study\\Gorrila.jpg");
	Files.copy(src, dest);
		
	}

}
