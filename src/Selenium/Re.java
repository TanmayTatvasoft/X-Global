package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Re {
	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.manage().deleteAllCookies();
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);
	driver.findElement(By.xpath("(//div[text()='SAMSUNG Galaxy F23 5G (Forest Green, 128 GB)'])[1]")).click();
	Set<String> allwindows = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList(allwindows);
	/*String parent = al.get(0);
	System.out.println(parent);
	String child = al.get(1);
	System.out.println(child);*/
	for(String win:al) {
	String titlee = driver.switchTo().window(win).getTitle();
	System.out.println(titlee);
	
	if(titlee.equals("SAMSUNG Galaxy F23 5G ( 128 GB Storage, 6 GB RAM ) Online at Best Price On Flipkart.com")||titlee.equals("Mobiles Under 20000- Buy Products Online at Best Price in India - All Categories | Flipkart.com")) {
		driver.close();
		
	}
		
	}
	}

}
